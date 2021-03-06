
package objectmodel.client.generated;

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                
//                                                                              
//==============================================================================

@SuppressWarnings({ "hiding", "unchecked", "static-access", "unused" })
public class Driver extends of4gwt.TGeneratedFields32 {

    public Driver() {
        this(of4gwt.Transaction.getDefaultTrunk());
    }

    public Driver(of4gwt.Transaction trunk) {
        this(new Version(null, FIELD_COUNT), trunk);
    }

    protected Driver(of4gwt.TObject.Version shared, of4gwt.Transaction trunk) {
        super(shared, trunk);
    }

    public static final of4gwt.TType TYPE = new of4gwt.TType(objectmodel.client.generated.MyObjectModel.getInstance(), objectmodel.client.generated.MyObjectModel.OBJECTMODEL_CLIENT_GENERATED_DRIVER_CLASS_ID);

    public final java.lang.String getName() {
        of4gwt.Transaction outer = of4gwt.Transaction.getCurrent();
        of4gwt.Transaction inner = startRead_objectfabric(outer);
        Version v = (Version) getTIndexed32Version_objectfabric(inner, NAME_INDEX);
        java.lang.String value = v != null ? v._name : null;
        endRead_objectfabric(outer, inner);
        return value;
    }

    public final void setName(java.lang.String value) {
        of4gwt.Transaction outer = of4gwt.Transaction.getCurrent();
        of4gwt.Transaction inner = startWrite_objectfabric(outer);
        Version v = (Version) getOrCreateVersion_objectfabric(inner);
        v._name = value;
        v.setBit(NAME_INDEX);
        endWrite_objectfabric(outer, inner);
    }

    public static final int NAME_INDEX = 0;

    public static final java.lang.String NAME_NAME = "name";

    public static final of4gwt.TType NAME_TYPE = of4gwt.ImmutableClass.STRING.getType();

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
            case NAME_INDEX:
                return NAME_NAME;
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
            case NAME_INDEX:
                return NAME_TYPE;
            default:
                throw new IllegalArgumentException();
        }
    }

    protected static class Version extends of4gwt.TGeneratedFields32.Version {

        public java.lang.String _name;

        static {
        }

        public Version(of4gwt.TGeneratedFields32.Version shared, int length) {
            super(shared, length);
        }

        @Override
        public java.lang.Object getAsObject(int index) {
            switch (index) {
                case NAME_INDEX:
                    return _name;
                default:
                    return super.getAsObject(index);
            }
        }

        @Override
        public void setAsObject(int index, java.lang.Object value) {
            switch (index) {
                case NAME_INDEX:
                    _name = (java.lang.String) value;
                    break;
                default:
                    super.setAsObject(index, value);
                    break;
            }
        }

        @Override
        public of4gwt.TObject.Version merge(of4gwt.TObject.Version target, of4gwt.TObject.Version next, int flags) {
            Driver.Version source = (Driver.Version) next;
            Driver.Version merged = (Driver.Version) super.merge(target, next, flags);

            if (source.hasBits()) {
                if (source.getBit(NAME_INDEX))
                    merged._name = source._name;
            }

            return merged;
        }

        @Override
        public void writeWrite(of4gwt.Writer writer, int index) {
            if (writer.interrupted())
                writer.resume();

            switch (index) {
                case NAME_INDEX: {
                    writer.writeString(_name);

                    if (writer.interrupted()) {
                        writer.interrupt(null);
                        return;
                    }
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
                case NAME_INDEX: {
                    _name = reader.readString();

                    if (reader.interrupted()) {
                        reader.interrupt(null);
                        return;
                    }
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
            return new Driver.Version(this, FIELD_COUNT);
        }

        @Override
        public int getClassId() {
            return objectmodel.client.generated.MyObjectModel.OBJECTMODEL_CLIENT_GENERATED_DRIVER_CLASS_ID;
        }

        @SuppressWarnings("static-access")
        @Override
        public of4gwt.ObjectModel getObjectModel() {
            return objectmodel.client.generated.MyObjectModel.getInstance();
        }
    }
}
