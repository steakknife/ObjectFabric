/**
 * Copyright (c) ObjectFabric Inc. All rights reserved.
 *
 * This file is part of ObjectFabric (objectfabric.com).
 *
 * ObjectFabric is licensed under the Apache License, Version 2.0, the terms
 * of which may be found at http://www.apache.org/licenses/LICENSE-2.0.html.
 *
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 */

package com.objectfabric.extensions;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

import com.objectfabric.AsyncOptions;
import com.objectfabric.Privileged;
import com.objectfabric.Site;
import com.objectfabric.TGeneratedFields;
import com.objectfabric.TGeneratedFields32;
import com.objectfabric.TIndexed;
import com.objectfabric.TKeyed;
import com.objectfabric.TObject;
import com.objectfabric.Transaction;
import com.objectfabric.Transaction.Granularity;
import com.objectfabric.Visitor;
import com.objectfabric.Walker;
import com.objectfabric.misc.Debug;
import com.objectfabric.misc.Log;
import com.objectfabric.misc.ThreadAssert;
import com.objectfabric.misc.ThreadAssert.AllowSharedRead;
import com.objectfabric.misc.ThreadAssert.SingleThreaded;
import com.objectfabric.misc.Utils;

/**
 * Logs all changes occurring on a public transaction (e.g. local site's trunk for changes
 * on local objects).
 */
@SingleThreaded
public class Logger extends Walker {

    @AllowSharedRead
    private final Executor _executor;

    private final Visitor _visitor;

    @AllowSharedRead
    private final Run _run = new Run();

    public Logger() {
        this(new AsyncOptions());

        if (Debug.THREADS)
            ThreadAssert.removePrivate(this);
    }

    public Logger(AsyncOptions options) {
        super(options.getForcedGranularity());

        onStarting();

        _executor = options.getExecutor();

        _visitor = new Visitor();
        _visitor.registerClassVisitor(Visitor.INDEXED_VISITOR_ID, new TIndexedVisitor());
        _visitor.registerClassVisitor(Visitor.KEYED_VISITOR_ID, new TKeyedVisitor());

        Privileged.init(_visitor, this, true);

        if (Debug.THREADS) {
            ThreadAssert.exchangeGive(_run, _visitor);
            ThreadAssert.exchangeGive(_run, this);
        }

        onStarted();
    }

    public void log(final Transaction branch) {
        _run.add(new Runnable() {

            public void run() {
                register(branch);
            }
        });

        flush();
    }

    /**
     * Block the current thread until all events which occurred up to now have been
     * logged.
     */
    public void flush() {
        Future<Void> flush = _run.startFlush();

        if (requestRun())
            wait(flush);
    }

    public void stop() {
        flush();

        _run.add(new Runnable() {

            public void run() {
                unregisterFromAllBranches(null);
            }
        });

        flush();

        if (Debug.THREADS) {
            ThreadAssert.suspend(this);
            ThreadAssert.resume(_run);
            ThreadAssert.removePrivate(_visitor);
            ThreadAssert.removePrivate(this);
            ThreadAssert.resume(this);
        }
    }

    //

    protected void onChange(TObject object, String change) {
        Transaction transaction = Transaction.getCurrent();

        if (transaction == null)
            transaction = Site.getLocal().getTrunk();

        String a = Utils.padRight(transaction.toString() + ", ", 30);

        if (Debug.ENABLED)
            disableEqualsOrHashCheck();

        String b = Utils.padRight(object.toString() + ", ", 60);

        if (Debug.ENABLED)
            enableEqualsOrHashCheck();

        Log.write(a + b + change);
    }

    @Override
    protected void startRun() {
        _executor.execute(_run);
    }

    private final class Run extends DefaultRunnable {

        @Override
        protected void checkedRun() {
            if (Debug.ENABLED) {
                ThreadAssert.resume(this, false);
                Debug.assertion(Transaction.getCurrent() == null);
            }

            if (Debug.THREADS)
                ThreadAssert.exchangeTake(this);

            onRunStarting();
            runTasks();

            Logger.this.walk(_visitor);

            if (Debug.ENABLED)
                ThreadAssert.suspend(this);

            setFlushes();
            onRunEnded();

            if (Debug.ENABLED)
                Debug.assertion(Transaction.getCurrent() == null);
        }
    }

    private final class TIndexedVisitor extends TIndexed.Visitor {

        protected TIndexedVisitor() {
            super(_visitor);
        }

        @Override
        protected void onRead(TObject object, int index) {
            // TODO
        }

        @Override
        protected void onWrite(TObject object, int index) {
            TGeneratedFields indexed = (TGeneratedFields) object;
            String name;

            if (object instanceof TGeneratedFields32)
                name = ((TGeneratedFields32) object).getFieldName(index);
            else
                name = "Field " + index;

            if (getGranularity(getParent().getBranch()) == Granularity.ALL) {
                String before = writeField(indexed.getOldField(index));
                String after = writeField(indexed.getField(index));
                onChange(object, name + ": " + before + " -> " + after);
            } else
                onChange(object, name + " = " + writeField(indexed.getField(index)));

        }

        private String writeField(Object value) {
            if (value != null) {
                if (Debug.ENABLED)
                    disableEqualsOrHashCheck();

                String result = value.toString();

                if (Debug.ENABLED)
                    enableEqualsOrHashCheck();

                return result;
            }

            return "null";
        }
    }

    private final class TKeyedVisitor<K, V> extends TKeyed.Visitor<K, V> {

        protected TKeyedVisitor() {
            super(_visitor);
        }

        @Override
        protected void onRead(TObject object, K key) {
            // TODO
        }

        @Override
        protected void onPut(TObject object, K key, V value) {
            onChange(object, "Put " + key + ", " + value);
        }

        @Override
        protected void onRemoval(TObject object, K key) {
            onChange(object, "Removal " + key);
        }

        @Override
        protected void onClear(TObject object) {
            onChange(object, "Clear");
        }
    }

    // TODO list
}
