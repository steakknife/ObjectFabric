
package part12.users.generated;

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                
//                                                                              
//==============================================================================

@SuppressWarnings({ "hiding", "unchecked", "static-access" })
public class PublicData extends com.objectfabric.TGeneratedFields32 {

    public PublicData() {
        this(com.objectfabric.Transaction.getDefaultTrunk());
    }

    public PublicData(com.objectfabric.Transaction trunk) {
        this(new Version(null, FIELD_COUNT), trunk);
    }

    protected PublicData(com.objectfabric.TObject.Version shared, com.objectfabric.Transaction trunk) {
        super(shared, trunk);
    }

    public static final com.objectfabric.TType TYPE = new com.objectfabric.TType(part12.users.generated.ObjectModel.getInstance(), part12.users.generated.ObjectModel.PART12_USERS_GENERATED_PUBLICDATA_CLASS_ID);

    public final int getData() {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startRead_objectfabric(outer);
        Version v = (Version) getTIndexed32Version_objectfabric(inner, DATA_INDEX);
        int value = v != null ? v._data : 0;
        endRead_objectfabric(outer, inner);
        return value;
    }

    public final void setData(int value) {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startWrite_objectfabric(outer);
        Version v = (Version) getOrCreateVersion_objectfabric(inner);
        v._data = value;
        v.setBit(DATA_INDEX);
        endWrite_objectfabric(outer, inner);
    }

    public static final int DATA_INDEX = 0;

    public static final java.lang.String DATA_NAME = "data";

    public static final java.lang.Class DATA_CLASS = int.class;

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
            case DATA_INDEX:
                return DATA_NAME;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public java.lang.Class getFieldClass(int index) {
        return getFieldClassStatic(index);
    }

    @SuppressWarnings("static-access")
    public static java.lang.Class getFieldClassStatic(int index) {
        switch (index) {
            case DATA_INDEX:
                return DATA_CLASS;
            default:
                throw new IllegalArgumentException();
        }
    }

    protected static class Version extends com.objectfabric.TGeneratedFields32.Version {

        public int _data;

        static {
        }

        public Version(com.objectfabric.TGeneratedFields32.Version shared, int length) {
            super(shared, length);
        }

        @Override
        public java.lang.Object getAsObject(int index) {
            switch (index) {
                case DATA_INDEX:
                    return _data;
                default:
                    return super.getAsObject(index);
            }
        }

        @Override
        public void setAsObject(int index, java.lang.Object value) {
            switch (index) {
                case DATA_INDEX:
                    _data = ((java.lang.Integer) value).intValue();
                    break;
                default:
                    super.setAsObject(index, value);
                    break;
            }
        }

        @Override
        public com.objectfabric.TObject.Version merge(com.objectfabric.TObject.Version target, com.objectfabric.TObject.Version next, int flags) {
            PublicData.Version source = (PublicData.Version) next;
            PublicData.Version merged = (PublicData.Version) super.merge(target, next, flags);

            if (source.hasBits()) {
                if (source.getBit(DATA_INDEX))
                    merged._data = source._data;
            }

            return merged;
        }

        @Override
        public void writeWrite(com.objectfabric.Writer writer, int index) {
            if (writer.interrupted())
                writer.resume();

            switch (index) {
                case DATA_INDEX: {
                    if (!writer.canWriteInteger()) {
                        writer.interrupt(null);
                        return;
                    }

                    writer.writeInteger(_data);
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
        public void readWrite(com.objectfabric.Reader reader, int index) {
            if (reader.interrupted())
                reader.resume();

            switch (index) {
                case DATA_INDEX: {
                    if (!reader.canReadInteger()) {
                        reader.interrupt(null);
                        return;
                    }

                    _data = reader.readInteger();
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
        public com.objectfabric.TObject.Version createVersion() {
            return new PublicData.Version(this, FIELD_COUNT);
        }

        @Override
        public int getClassId() {
            return part12.users.generated.ObjectModel.PART12_USERS_GENERATED_PUBLICDATA_CLASS_ID;
        }

        @SuppressWarnings("static-access")
        @Override
        public com.objectfabric.ObjectModel getObjectModel() {
            return part12.users.generated.ObjectModel.getInstance();
        }
    }
}