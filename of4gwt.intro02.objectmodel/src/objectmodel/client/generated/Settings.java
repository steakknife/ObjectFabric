
package objectmodel.client.generated;

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                
//                                                                              
//==============================================================================

@SuppressWarnings({ "hiding", "unchecked", "static-access", "unused" })
public class Settings extends of4gwt.TGeneratedFields32 {

    public Settings() {
        this(of4gwt.Transaction.getDefaultTrunk());
    }

    public Settings(of4gwt.Transaction trunk) {
        this(new Version(null, FIELD_COUNT), trunk);
    }

    protected Settings(of4gwt.TObject.Version shared, of4gwt.Transaction trunk) {
        super(shared, trunk);
    }

    public static final of4gwt.TType TYPE = new of4gwt.TType(objectmodel.client.generated.MyObjectModel.getInstance(), objectmodel.client.generated.MyObjectModel.OBJECTMODEL_CLIENT_GENERATED_SETTINGS_CLASS_ID);

    public final int getSeatHeight() {
        of4gwt.Transaction outer = of4gwt.Transaction.getCurrent();
        of4gwt.Transaction inner = startRead_objectfabric(outer);
        Version v = (Version) getTIndexed32Version_objectfabric(inner, SEAT_HEIGHT_INDEX);
        int value = v != null ? v._seatHeight : 0;
        endRead_objectfabric(outer, inner);
        return value;
    }

    public final void setSeatHeight(int value) {
        of4gwt.Transaction outer = of4gwt.Transaction.getCurrent();
        of4gwt.Transaction inner = startWrite_objectfabric(outer);
        Version v = (Version) getOrCreateVersion_objectfabric(inner);
        v._seatHeight = value;
        v.setBit(SEAT_HEIGHT_INDEX);
        endWrite_objectfabric(outer, inner);
    }

    public static final int SEAT_HEIGHT_INDEX = 0;

    public static final java.lang.String SEAT_HEIGHT_NAME = "seatHeight";

    public static final of4gwt.TType SEAT_HEIGHT_TYPE = of4gwt.ImmutableClass.INTEGER.getType();

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
    public  of4gwt.TType getFieldType(int index) {
        return getFieldTypeStatic(index);
    }

    @SuppressWarnings("static-access")
    public static of4gwt.TType getFieldTypeStatic(int index) {
        switch (index) {
            case SEAT_HEIGHT_INDEX:
                return SEAT_HEIGHT_TYPE;
            default:
                throw new IllegalArgumentException();
        }
    }

    protected static class Version extends of4gwt.TGeneratedFields32.Version {

        public int _seatHeight;

        static {
        }

        public Version(of4gwt.TGeneratedFields32.Version shared, int length) {
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
        public of4gwt.TObject.Version merge(of4gwt.TObject.Version target, of4gwt.TObject.Version next, int flags) {
            Settings.Version source = (Settings.Version) next;
            Settings.Version merged = (Settings.Version) super.merge(target, next, flags);

            if (source.hasBits()) {
                if (source.getBit(SEAT_HEIGHT_INDEX))
                    merged._seatHeight = source._seatHeight;
            }

            return merged;
        }

        @Override
        public void writeWrite(of4gwt.Writer writer, int index) {
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
        public void readWrite(of4gwt.Reader reader, int index) {
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
        public of4gwt.TObject.Version createVersion() {
            return new Settings.Version(this, FIELD_COUNT);
        }

        @Override
        public int getClassId() {
            return objectmodel.client.generated.MyObjectModel.OBJECTMODEL_CLIENT_GENERATED_SETTINGS_CLASS_ID;
        }

        @SuppressWarnings("static-access")
        @Override
        public of4gwt.ObjectModel getObjectModel() {
            return objectmodel.client.generated.MyObjectModel.getInstance();
        }
    }
}
