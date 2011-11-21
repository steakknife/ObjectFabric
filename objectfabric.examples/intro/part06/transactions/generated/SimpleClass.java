
package part06.transactions.generated;

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                
//                                                                              
//==============================================================================

@SuppressWarnings({ "hiding", "unchecked", "static-access", "unused" })
public class SimpleClass extends com.objectfabric.TGeneratedFields32 {

    public SimpleClass() {
        this(com.objectfabric.Transaction.getDefaultTrunk());
    }

    public SimpleClass(com.objectfabric.Transaction trunk) {
        this(new Version(null, FIELD_COUNT), trunk);
    }

    protected SimpleClass(com.objectfabric.TObject.Version shared, com.objectfabric.Transaction trunk) {
        super(shared, trunk);
    }

    public static final com.objectfabric.TType TYPE = new com.objectfabric.TType(part06.transactions.generated.SimpleObjectModel.getInstance(), part06.transactions.generated.SimpleObjectModel.PART06_STM_GENERATED_SIMPLECLASS_CLASS_ID);

    public final java.lang.String getText() {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startRead_objectfabric(outer);
        Version v = (Version) getTIndexed32Version_objectfabric(inner, TEXT_INDEX);
        java.lang.String value = v != null ? v._text : null;
        endRead_objectfabric(outer, inner);
        return value;
    }

    public final void setText(java.lang.String value) {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startWrite_objectfabric(outer);
        Version v = (Version) getOrCreateVersion_objectfabric(inner);
        v._text = value;
        v.setBit(TEXT_INDEX);
        endWrite_objectfabric(outer, inner);
    }

    public final int getInt() {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startRead_objectfabric(outer);
        Version v = (Version) getTIndexed32Version_objectfabric(inner, INT_INDEX);
        int value = v != null ? v._int : 0;
        endRead_objectfabric(outer, inner);
        return value;
    }

    public final void setInt(int value) {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startWrite_objectfabric(outer);
        Version v = (Version) getOrCreateVersion_objectfabric(inner);
        v._int = value;
        v.setBit(INT_INDEX);
        endWrite_objectfabric(outer, inner);
    }

    public final int getInt2() {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startRead_objectfabric(outer);
        Version v = (Version) getTIndexed32Version_objectfabric(inner, INT2_INDEX);
        int value = v != null ? v._int2 : 0;
        endRead_objectfabric(outer, inner);
        return value;
    }

    public final void setInt2(int value) {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startWrite_objectfabric(outer);
        Version v = (Version) getOrCreateVersion_objectfabric(inner);
        v._int2 = value;
        v.setBit(INT2_INDEX);
        endWrite_objectfabric(outer, inner);
    }

    public final part06.transactions.generated.SimpleClass getObject() {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startRead_objectfabric(outer);
        Version v = (Version) getTIndexed32Version_objectfabric(inner, OBJECT_INDEX);
        part06.transactions.generated.SimpleClass value = v != null ? (part06.transactions.generated.SimpleClass) getUserTObject_objectfabric(v._object) : null;
        endRead_objectfabric(outer, inner);
        return value;
    }

    public final void setObject(part06.transactions.generated.SimpleClass value) {
        com.objectfabric.Transaction outer = com.objectfabric.Transaction.getCurrent();
        com.objectfabric.Transaction inner = startWrite_objectfabric(outer);
        Version v = (Version) getOrCreateVersion_objectfabric(inner);
        v._object = value;
        v.setBit(OBJECT_INDEX);
        endWrite_objectfabric(outer, inner);
    }

    public static final int TEXT_INDEX = 0;

    public static final java.lang.String TEXT_NAME = "text";

    public static final com.objectfabric.TType TEXT_TYPE = com.objectfabric.ImmutableClass.STRING.getType();

    public static final int INT_INDEX = 1;

    public static final java.lang.String INT_NAME = "int";

    public static final com.objectfabric.TType INT_TYPE = com.objectfabric.ImmutableClass.INTEGER.getType();

    public static final int INT2_INDEX = 2;

    public static final java.lang.String INT2_NAME = "int2";

    public static final com.objectfabric.TType INT2_TYPE = com.objectfabric.ImmutableClass.INTEGER.getType();

    public static final int OBJECT_INDEX = 3;

    public static final java.lang.String OBJECT_NAME = "object";

    public static final com.objectfabric.TType OBJECT_TYPE = part06.transactions.generated.SimpleClass.TYPE;

    public static final int FIELD_COUNT = 4;

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
            case TEXT_INDEX:
                return TEXT_NAME;
            case INT_INDEX:
                return INT_NAME;
            case INT2_INDEX:
                return INT2_NAME;
            case OBJECT_INDEX:
                return OBJECT_NAME;
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
            case TEXT_INDEX:
                return TEXT_TYPE;
            case INT_INDEX:
                return INT_TYPE;
            case INT2_INDEX:
                return INT2_TYPE;
            case OBJECT_INDEX:
                return OBJECT_TYPE;
            default:
                throw new IllegalArgumentException();
        }
    }

    protected static class Version extends com.objectfabric.TGeneratedFields32.Version {

        public java.lang.String _text;

        public int _int;

        public int _int2;

        public com.objectfabric.TObject _object;

        static {
        }

        public Version(com.objectfabric.TGeneratedFields32.Version shared, int length) {
            super(shared, length);
        }

        @Override
        public java.lang.Object getAsObject(int index) {
            switch (index) {
                case TEXT_INDEX:
                    return _text;
                case INT_INDEX:
                    return _int;
                case INT2_INDEX:
                    return _int2;
                case OBJECT_INDEX:
                    return getUserTObject_objectfabric(_object);
                default:
                    return super.getAsObject(index);
            }
        }

        @Override
        public void setAsObject(int index, java.lang.Object value) {
            switch (index) {
                case TEXT_INDEX:
                    _text = (java.lang.String) value;
                    break;
                case INT_INDEX:
                    _int = ((java.lang.Integer) value).intValue();
                    break;
                case INT2_INDEX:
                    _int2 = ((java.lang.Integer) value).intValue();
                    break;
                case OBJECT_INDEX:
                    _object = (part06.transactions.generated.SimpleClass) value;
                    break;
                default:
                    super.setAsObject(index, value);
                    break;
            }
        }

        @Override
        public com.objectfabric.TObject.Version merge(com.objectfabric.TObject.Version target, com.objectfabric.TObject.Version next, int flags) {
            SimpleClass.Version source = (SimpleClass.Version) next;
            SimpleClass.Version merged = (SimpleClass.Version) super.merge(target, next, flags);

            if (source.hasBits()) {
                if (source.getBit(TEXT_INDEX))
                    merged._text = source._text;

                if (source.getBit(INT_INDEX))
                    merged._int = source._int;

                if (source.getBit(INT2_INDEX))
                    merged._int2 = source._int2;

                if (source.getBit(OBJECT_INDEX))
                    merged._object = mergeTObject(merged._object, source._object);
            }

            return merged;
        }

        @Override
        public void writeWrite(com.objectfabric.Writer writer, int index) {
            if (writer.interrupted())
                writer.resume();

            switch (index) {
                case TEXT_INDEX: {
                    writer.writeString(_text);

                    if (writer.interrupted()) {
                        writer.interrupt(null);
                        return;
                    }
                    break;
                }
                case INT_INDEX: {
                    if (!writer.canWriteInteger()) {
                        writer.interrupt(null);
                        return;
                    }

                    writer.writeInteger(_int);
                    break;
                }
                case INT2_INDEX: {
                    if (!writer.canWriteInteger()) {
                        writer.interrupt(null);
                        return;
                    }

                    writer.writeInteger(_int2);
                    break;
                }
                case OBJECT_INDEX: {
                    writer.writeTObject(_object);

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
        public void readWrite(com.objectfabric.Reader reader, int index) {
            if (reader.interrupted())
                reader.resume();

            switch (index) {
                case TEXT_INDEX: {
                    _text = reader.readString();

                    if (reader.interrupted()) {
                        reader.interrupt(null);
                        return;
                    }
                    break;
                }
                case INT_INDEX: {
                    if (!reader.canReadInteger()) {
                        reader.interrupt(null);
                        return;
                    }

                    _int = reader.readInteger();
                    break;
                }
                case INT2_INDEX: {
                    if (!reader.canReadInteger()) {
                        reader.interrupt(null);
                        return;
                    }

                    _int2 = reader.readInteger();
                    break;
                }
                case OBJECT_INDEX: {
                    _object = reader.readTObject();

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
        public com.objectfabric.TObject.Version createVersion() {
            return new SimpleClass.Version(this, FIELD_COUNT);
        }

        @Override
        public int getClassId() {
            return part06.transactions.generated.SimpleObjectModel.PART06_STM_GENERATED_SIMPLECLASS_CLASS_ID;
        }

        @SuppressWarnings("static-access")
        @Override
        public com.objectfabric.ObjectModel getObjectModel() {
            return part06.transactions.generated.SimpleObjectModel.getInstance();
        }
    }
}