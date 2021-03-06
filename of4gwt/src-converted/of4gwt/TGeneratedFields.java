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

package of4gwt;

import java.util.Iterator;

/**
 * Transactional object with fields generated by ObjectFabric generator.
 */
public abstract class TGeneratedFields extends TIndexed implements Iterable<Object> {

    protected TGeneratedFields(TObject.Version shared, Transaction trunk) {
        super(shared, trunk);
    }

    /**
     * Generated fields are assigned an index, so their value can also be retrieved by
     * index.
     */
    public abstract Object getField(int index);

    /**
     * Return the field as it was when the current transaction started.
     */
    public abstract Object getOldField(int index);

    public abstract void setField(int index, Object value);

    public abstract int getFieldCount();

    public abstract String getFieldName(int index);

    public abstract TType getFieldType(int index);

    public abstract Iterator<Object> iterator();
}