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

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                
//                                                                              
//==============================================================================

@SuppressWarnings({ "hiding", "unchecked", "static-access", "unused" })
abstract class SiteBase extends of4gwt.TGeneratedFields32 {

    protected SiteBase() {
        this(of4gwt.Transaction.getDefaultTrunk());
    }

    protected SiteBase(of4gwt.Transaction trunk) {
        this(new Version(null, FIELD_COUNT), trunk);
    }

    protected SiteBase(of4gwt.TObject.Version shared, of4gwt.Transaction trunk) {
        super(shared, trunk);
    }

    public static final of4gwt.TType TYPE = new of4gwt.TType(of4gwt.DefaultObjectModel.getInstance(), of4gwt.DefaultObjectModelBase.COM_OBJECTFABRIC_SITE_CLASS_ID);

    protected final int getDistance() {
        of4gwt.Transaction outer = of4gwt.Transaction.getCurrent();
        of4gwt.Transaction inner = startRead_objectfabric(outer);
        Version v = (Version) getTIndexed32Version_objectfabric(inner, DISTANCE_INDEX);
        int value = v != null ? v._distance : 0;
        endRead_objectfabric(outer, inner);
        return value;
    }

    protected final void setDistance(int value) {
        of4gwt.Transaction outer = of4gwt.Transaction.getCurrent();
        of4gwt.Transaction inner = startWrite_objectfabric(outer);
        Version v = (Version) getOrCreateVersion_objectfabric(inner);
        v._distance = value;
        v.setBit(DISTANCE_INDEX);
        endWrite_objectfabric(outer, inner);
    }

    protected static final int DISTANCE_INDEX = 0;

    protected static final java.lang.String DISTANCE_NAME = "distance";

    protected static final of4gwt.TType DISTANCE_TYPE = of4gwt.ImmutableClass.INTEGER.getType();

    public static final int FIELD_COUNT = 1;

    @Override
    public int getFieldCount() {
        return FIELD_COUNT;
    }

    @Override
    public java.lang.String getFieldName(int index) {
        return getFieldNameStatic(index);
    }

    @SuppressWarnings("static-access")
    public static java.lang.String getFieldNameStatic(int index) {
        switch (index) {
            case DISTANCE_INDEX:
                return DISTANCE_NAME;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public  of4gwt.TType getFieldType(int index) {
        return getFieldTypeStatic(index);
    }

    @SuppressWarnings("static-access")
    public static of4gwt.TType getFieldTypeStatic(int index) {
        switch (index) {
            case DISTANCE_INDEX:
                return DISTANCE_TYPE;
            default:
                throw new IllegalArgumentException();
        }
    }

    protected static class Version extends of4gwt.TGeneratedFields32.Version {

        public int _distance;

        static {
        }

        public Version(of4gwt.TGeneratedFields32.Version shared, int length) {
            super(shared, length);
        }

        @Override
        public java.lang.Object getAsObject(int index) {
            switch (index) {
                case DISTANCE_INDEX:
                    return _distance;
                default:
                    return super.getAsObject(index);
            }
        }

        @Override
        public void setAsObject(int index, java.lang.Object value) {
            switch (index) {
                case DISTANCE_INDEX:
                    _distance = ((java.lang.Integer) value).intValue();
                    break;
                default:
                    super.setAsObject(index, value);
                    break;
            }
        }

        @Override
        public of4gwt.TObject.Version merge(of4gwt.TObject.Version target, of4gwt.TObject.Version next, int flags) {
            SiteBase.Version source = (SiteBase.Version) next;
            SiteBase.Version merged = (SiteBase.Version) super.merge(target, next, flags);

            if (source.hasBits()) {
                if (source.getBit(DISTANCE_INDEX))
                    merged._distance = source._distance;
            }

            return merged;
        }

        @Override
        public void writeWrite(of4gwt.Writer writer, int index) {
            if (writer.interrupted())
                writer.resume();

            switch (index) {
                case DISTANCE_INDEX: {
                    if (!writer.canWriteInteger()) {
                        writer.interrupt(null);
                        return;
                    }

                    writer.writeInteger(_distance);
                    break;
                }
                default: {
                    super.writeWrite(writer, index);

                    if (writer.interrupted()) {
                        writer.interrupt(null);
                        return;
                    }
                    break;
                }
            }
        }

        @Override
        public void readWrite(of4gwt.Reader reader, int index) {
            if (reader.interrupted())
                reader.resume();

            switch (index) {
                case DISTANCE_INDEX: {
                    if (!reader.canReadInteger()) {
                        reader.interrupt(null);
                        return;
                    }

                    _distance = reader.readInteger();
                    break;
                }
                default: {
                    super.readWrite(reader, index);

                    if (reader.interrupted()) {
                        reader.interrupt(null);
                        return;
                    }
                    break;
                }
            }
        }

        @Override
        public of4gwt.TObject.Version createVersion() {
            return new SiteBase.Version(this, FIELD_COUNT);
        }

        @Override
        public int getClassId() {
            return of4gwt.DefaultObjectModelBase.COM_OBJECTFABRIC_SITE_CLASS_ID;
        }

        @SuppressWarnings("static-access")
        @Override
        public of4gwt.ObjectModel getObjectModel() {
            return of4gwt.DefaultObjectModel.getInstance();
        }
    }
}
