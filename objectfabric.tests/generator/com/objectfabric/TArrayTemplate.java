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

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                        
//                                                                              
//==============================================================================

/**
 * Transactional array. ObjectFabric generates specialized implementations for every
 * supported immutable type (C.f. <code>ImmutableClass</code>) and TObjects for faster
 * serialization, to avoid boxing for primitive types, and for easier interoperability
 * with .NET generics which require a type at runtime.
 */
@SuppressWarnings("unchecked")
abstract class TArrayTemplate/* generic_declaration */extends TIndexed implements Iterable<Float> {

    @SuppressWarnings("hiding")
    public static final TType TYPE = new TType(DefaultObjectModel.getInstance(), -1, new TType(ImmutableClass.FLOAT));

    private final int _length;

    private static final boolean IS_TOBJECT = false;

    private static final boolean CAN_BE_TOBJECT = false;

    public TArrayTemplate(int length) {
        this(Transaction.getDefaultTrunk(), length);
    }

    public TArrayTemplate(Transaction trunk, int length) {
        super(new TArrayVersionTemplate(null, length), trunk);

        _length = length;
    }

    /**
     * This constructor is only useful if the object might get replicated to a .NET
     * process, to specify which type would be instantiated by the remote runtime.
     */
    /* generic start */public TArrayTemplate(Transaction trunk, int length, TType genericParam) {
        this(trunk, length);

        if (genericParam != null) {
            if (genericParam.getObjectModel() == null)
                throw new IllegalArgumentException("Generic parameter must be a transactional object.");

            ((TArrayVersionTemplate) getSharedVersion_objectfabric())._genericParameters = new TType[] { genericParam };
        }
    }/* generic end */

    public final int length() {
        return _length;
    }

    @SuppressWarnings("cast")
    public final float get(int index) {
        if (index < 0 || index >= length())
            throw new IndexOutOfBoundsException();

        Transaction outer = Transaction.getCurrent();
        Transaction inner = Transaction.startRead(outer, this);
        float value;

        if (IS_TOBJECT) {
            TArrayVersionTemplate/* TObject */version = (TArrayVersionTemplate/* TObject */) getTIndexedNVersion_objectfabric(inner, index);
            value = (Float) getUserTObject_objectfabric(version != null ? version.get(index) : null);
        } else if (CAN_BE_TOBJECT) {
            TArrayVersionTemplate/* Object */version = (TArrayVersionTemplate/* Object */) getTIndexedNVersion_objectfabric(inner, index);
            value = (Float) getUserTObject_objectfabric(version != null ? version.get(index) : null);
        } else {
            TArrayVersionTemplate version = (TArrayVersionTemplate) getTIndexedNVersion_objectfabric(inner, index);
            value = version != null ? (float) version.get(index) : 0 /* Default */;
        }

        Transaction.endRead(outer, inner);
        return value;
    }

    /**
     * Return the field as it was when the current transaction started.
     */
    @SuppressWarnings("cast")
    public final float getPrevious(int index) {
        if (index < 0 || index >= length())
            throw new IndexOutOfBoundsException();

        Transaction outer = Transaction.getCurrent();
        Transaction inner = Transaction.startRead(outer, this);
        float value;

        if (IS_TOBJECT) {
            TArrayVersionTemplate/* TObject */version = (TArrayVersionTemplate/* TObject */) findTIndexedNPublicVersion(inner, index);
            value = (Float) getUserTObject_objectfabric(version != null ? version.get(index) : null);
        } else if (CAN_BE_TOBJECT) {
            TArrayVersionTemplate/* Object */version = (TArrayVersionTemplate/* Object */) findTIndexedNPublicVersion(inner, index);
            value = (Float) getUserTObject_objectfabric(version != null ? version.get(index) : null);
        } else {
            TArrayVersionTemplate version = (TArrayVersionTemplate) findTIndexedNPublicVersion(inner, index);
            value = version != null ? (float) version.get(index) : 0 /* Default */;
        }

        Transaction.endRead(outer, inner);
        return value;
    }

    @SuppressWarnings("cast")
    public final void set(int index, float value) {
        if (index < 0 || index >= length())
            throw new IndexOutOfBoundsException();

        Transaction outer = Transaction.getCurrent();
        Transaction inner = Transaction.startWrite(outer, this);

        if (IS_TOBJECT) {
            TArrayVersionTemplate/* TObject */version = (TArrayVersionTemplate/* TObject */) getOrCreateVersion_objectfabric(inner);
            version.setBit(index);
            version.setAsObject(index, value);
        } else if (CAN_BE_TOBJECT) {
            TArrayVersionTemplate/* Object */version = (TArrayVersionTemplate/* Object */) getOrCreateVersion_objectfabric(inner);
            version.setBit(index);
            version.set(index, value);
        } else {
            TArrayVersionTemplate version = (TArrayVersionTemplate) getOrCreateVersion_objectfabric(inner);
            version.setBit(index);
            version.set(index, value);
        }

        Transaction.endWrite(outer, inner);
    }

    /* iterator start */

    public final java.util.Iterator<Float> iterator() {
        return new IteratorImpl();
    }

    private final class IteratorImpl implements java.util.Iterator<Float> {

        private int _cursor = 0;

        public boolean hasNext() {
            return _cursor != _length;
        }

        public Float next() {
            Float value = get(_cursor++);
            return value;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* iterator end */
}
// End (for .NET)
