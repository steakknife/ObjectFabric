
package part02.objectmodel.generated;

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                
//                                                                              
//==============================================================================

@SuppressWarnings({ "hiding", "unchecked", "static-access", "unused" })
public class Settings extends com.objectfabric.TGeneratedFields32 {

    public Settings() {
        this(com.objectfabric.Transaction.getDefaultTrunk());
    }

    public Settings(com.objectfabric.Transaction trunk) {
        this(new Version(null, FIELD_COUNT), trunk);
    }

    protected Settings(com.objectfabric.TObject.Version shared, com.objectfabric.Transaction trunk) {
        super(shared, trunk);
    }

    public static final com.objectfabric.TType TYPE = new com.objectfabric.TType(part02.objectmodel.generated.MyObjectModel.getInstance(), part02.objectmodel.generated.MyObjectModel.PART02_OBJECTMODEL_GENERATED_SETTINGS_CLASS_ID);

    public final int getSeatHeight() {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startRead_objectfabric(outer);
        Version v = (Version) getTIndexed32Version_objectfabric(inner, SEAT_HEIGHT_INDEX);
        int value = v != null ? v._seatHeight : 0;
        endRead_objectfabric(outer, inner);
        return value;
    }

    public final void setSeatHeight(int value) {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startWrite_objectfabric(outer);
        Version v = (Version) getOrCreateVersion_objectfabric(inner);
        v._seatHeight = value;
        v.setBit(SEAT_HEIGHT_INDEX);
        endWrite_objectfabric(outer, inner);
    }

    public static final int SEAT_HEIGHT_INDEX = 0;

    public static final java.lang.String SEAT_HEIGHT_NAME = "seatHeight";

    public static final com.objectfabric.TType SEAT_HEIGHT_TYPE = com.objectfabric.ImmutableClass.INTEGER.getType();

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
            case SEAT_HEIGHT_INDEX:
                return SEAT_HEIGHT_NAME;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public  com.objectfabric.TType getFieldType(int index) {
        return getFieldTypeStatic(index);
    }

    @SuppressWarnings("static-access")
    public static com.objectfabric.TType getFieldTypeStatic(int index) {
        switch (index) {
            case SEAT_HEIGHT_INDEX:
                return SEAT_HEIGHT_TYPE;
            default:
                throw new IllegalArgumentException();
        }
    }

    protected static class Version extends com.objectfabric.TGeneratedFields32.Version {

        public int _seatHeight;

        static {
        }

        public Version(com.objectfabric.TGeneratedFields32.Version shared, int length) {
            super(shared, length);
        }

        @Override
        public java.lang.Object getAsObject(int index) {
            switch (index) {
                case SEAT_HEIGHT_INDEX:
                    return _seatHeight;
                default:
                    return super.getAsObject(index);
            }
        }

        @Override
        public void setAsObject(int index, java.lang.Object value) {
            switch (index) {
                case SEAT_HEIGHT_INDEX:
                    _seatHeight = ((java.lang.Integer) value).intValue();
                    break;
                default:
                    super.setAsObject(index, value);
                    break;
            }
        }

        @Override
        public com.objectfabric.TObject.Version merge(com.objectfabric.TObject.Version target, com.objectfabric.TObject.Version next, int flags) {
            Settings.Version source = (Settings.Version) next;
            Settings.Version merged = (Settings.Version) super.merge(target, next, flags);

            if (source.hasBits()) {
                if (source.getBit(SEAT_HEIGHT_INDEX))
                    merged._seatHeight = source._seatHeight;
            }

            return merged;
        }

        @Override
        public void writeWrite(com.objectfabric.Writer writer, int index) {
            if (writer.interrupted())
                writer.resume();

            switch (index) {
                case SEAT_HEIGHT_INDEX: {
                    if (!writer.canWriteInteger()) {
                        writer.interrupt(null);
                        return;
                    }

                    writer.writeInteger(_seatHeight);
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
                case SEAT_HEIGHT_INDEX: {
                    if (!reader.canReadInteger()) {
                        reader.interrupt(null);
                        return;
                    }

                    _seatHeight = reader.readInteger();
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
            return new Settings.Version(this, FIELD_COUNT);
        }

        @Override
        public int getClassId() {
            return part02.objectmodel.generated.MyObjectModel.PART02_OBJECTMODEL_GENERATED_SETTINGS_CLASS_ID;
        }

        @SuppressWarnings("static-access")
        @Override
        public com.objectfabric.ObjectModel getObjectModel() {
            return part02.objectmodel.generated.MyObjectModel.getInstance();
        }
    }
}
