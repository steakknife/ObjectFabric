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

package com.objectfabric;

import java.util.concurrent.Future;

import com.objectfabric.OF.AutoCommitPolicy;
import com.objectfabric.TObject.UserTObject;
import com.objectfabric.TObject.Version;
import com.objectfabric.Visitor.Listener;
import com.objectfabric.misc.AsyncCallback;
import com.objectfabric.misc.Debug;
import com.objectfabric.misc.List;
import com.objectfabric.misc.WritableFuture;

/**
 * Helper to access ObjectFabric internals from other packages. Do not use!
 */
public abstract class Privileged {

    protected static void assertIdleAndCleanup() {
        if (Debug.ENABLED)
            Helper.getInstance().assertIdleAndCleanup();

        if (Stats.ENABLED)
            Stats.getInstance().writeAndReset();
    }

    protected static java.lang.Class getBuiltInClassFromString(String name) {
        BuiltInClass c = BuiltInClass.parse(name);

        if (c != null)
            return DefaultObjectModel.getInstance().getClass(c.getId(), null);

        return null;
    }

    protected static int getSharedHashCode(TObject object) {
        if (!Debug.ENABLED)
            throw new IllegalStateException();

        return object.getSharedHashCode_objectfabric();
    }

    protected static TObject getSharedVersion(TObject object) {
        if (object instanceof UserTObject)
            return object.getSharedVersion_objectfabric();

        if (Debug.ENABLED)
            Debug.assertion(((Version) object).isShared());

        return object;
    }

    protected static <V> WritableFuture<V> createWritableFuture() {
        return new FutureWithCallback<V>(null, null);
    }

    protected static final void disposeGCQueue() {
        GCQueue.getInstance().dispose();
    }

    protected static void init(Visitor visitor, Listener listener, boolean visitsTransients) {
        visitor.init(listener, visitsTransients);
    }

    protected static void disableEqualsOrHashCheck() {
        if (!Debug.ENABLED)
            throw new AssertionError();

        Helper.getInstance().disableEqualsOrHashCheck();
    }

    protected static void enableEqualsOrHashCheck() {
        if (!Debug.ENABLED)
            throw new AssertionError();

        Helper.getInstance().enableEqualsOrHashCheck();
    }

    protected static void setCurrentUnsafe(Transaction transaction) {
        Transaction.setCurrentUnsafe(transaction);
    }

    protected static boolean getNoTransaction() {
        return Helper.getInstance().getNoTransaction();
    }

    protected static void setNoTransaction(boolean value) {
        Helper.getInstance().setNoTransaction(value);
    }

    protected static void assertTransactionNull() {
        Debug.assertion(Transaction.currentNull());
    }

    protected static void abortThreadContext() {
        ThreadContext context = ThreadContext.getCurrent();
        context.abortAll();
    }

    protected static void assertThreadContextEmpty() {
        ThreadContext context = ThreadContext.getCurrent();
        context.assertEmpty();
    }

    protected static void forceAutoCommitPolicy(AutoCommitPolicy policy) {
        ThreadContext context = ThreadContext.getCurrent();
        context.forceAutoCommitPolicy(policy);
    }

    protected static final AsyncOptions getDefaultAsyncOptions() {
        return OF.getDefaultAsyncOptions();
    }

    protected static void resetOF() {
        OF.reset();
    }

    protected static void expectException() {
        ExpectedExceptionThrower.expectException();
    }

    protected static boolean isUserTObject(Object object) {
        return object instanceof UserTObject;
    }

    protected static final <V> void wait(Future<V> future) {
        OF.getConfig().wait(future);
    }

    protected static final void onThrowable(Throwable t) {
        OF.getConfig().onThrowable(t);
    }

    protected static class FutureAccessor<V> extends FutureWithCallback<V> {

        public FutureAccessor(AsyncCallback<V> callback, AsyncOptions options) {
            super(callback, options);
        }
    }

    protected static void assertIdle(Privileged privileged) {
        privileged.assertIdle();
    }

    protected static final void requestRun(Schedulable schedulable) {
        schedulable.requestRun();
    }

    protected static final int writeString(String text, byte[] buffer) {
        TextWriter writer = new TextWriter(buffer);
        writer.write(text);
        return writer.getOffset();
    }

    protected static final Reader createReader() {
        return new Reader(new List<UserTObject>());
    }

    protected static final String readString(Reader reader, byte[] buffer, int offset, int limit) {
        if (!reader.interrupted()) {
            reader.setFlags(buffer[offset]);
            offset++;
        }

        reader.setBuffer(buffer);
        reader.setOffset(offset);
        reader.setLimit(limit);
        return (String) reader.readObject();
    }

    protected void assertIdle() {
    }

    private static final class TextWriter extends GrowableWriter {

        public TextWriter(byte[] buffer) {
            super(buffer);
        }

        @Override
        public void writeCommand(byte command) {
            throw new UnsupportedOperationException();
        }

        @Override
        boolean isKnown(Version shared) {
            throw new UnsupportedOperationException();
        }

        @Override
        void setCreated(Version shared) {
            throw new UnsupportedOperationException();
        }
    }
}
