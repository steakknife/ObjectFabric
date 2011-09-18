
package com.objectfabric.security.shiro;

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                
//                                                                              
//==============================================================================

@SuppressWarnings({ "hiding", "unchecked", "static-access" })
public class ShiroStore extends com.objectfabric.TGeneratedFields32 {

    public ShiroStore() {
        this(com.objectfabric.Transaction.getDefaultTrunk());
    }

    public ShiroStore(com.objectfabric.Transaction trunk) {
        this(trunk, new com.objectfabric.TMap<java.lang.String, com.objectfabric.security.shiro.Account>(trunk), new com.objectfabric.TMap<java.lang.String, com.objectfabric.security.shiro.Role>(trunk), new com.objectfabric.LazyMap<java.lang.String, java.lang.Object>(trunk));
    }

    public ShiroStore(com.objectfabric.TMap<java.lang.String, com.objectfabric.security.shiro.Account> accounts, com.objectfabric.TMap<java.lang.String, com.objectfabric.security.shiro.Role> roles, com.objectfabric.LazyMap<java.lang.String, java.lang.Object> sessions) {
        this(com.objectfabric.Transaction.getDefaultTrunk(), accounts, roles, sessions);
    }

    public ShiroStore(com.objectfabric.Transaction trunk, com.objectfabric.TMap<java.lang.String, com.objectfabric.security.shiro.Account> accounts, com.objectfabric.TMap<java.lang.String, com.objectfabric.security.shiro.Role> roles, com.objectfabric.LazyMap<java.lang.String, java.lang.Object> sessions) {
        this(new Version(null, FIELD_COUNT), trunk, accounts, roles, sessions);
    }

    protected ShiroStore(com.objectfabric.TObject.Version shared, com.objectfabric.Transaction trunk, com.objectfabric.TMap<java.lang.String, com.objectfabric.security.shiro.Account> accounts, com.objectfabric.TMap<java.lang.String, com.objectfabric.security.shiro.Role> roles, com.objectfabric.LazyMap<java.lang.String, java.lang.Object> sessions) {
        super(shared, trunk);

        ((Version) shared)._accounts = shared.mergeTObject(((Version) shared)._accounts, accounts);

        if (accounts != null)
            ((Version) shared).setBit(ACCOUNTS_INDEX);

        ((Version) shared)._roles = shared.mergeTObject(((Version) shared)._roles, roles);

        if (roles != null)
            ((Version) shared).setBit(ROLES_INDEX);

        ((Version) shared)._sessions = shared.mergeTObject(((Version) shared)._sessions, sessions);

        if (sessions != null)
            ((Version) shared).setBit(SESSIONS_INDEX);
    }

    public static final com.objectfabric.TType TYPE = new com.objectfabric.TType(com.objectfabric.security.shiro.ShiroObjectModel.getInstance(), com.objectfabric.security.shiro.ShiroObjectModel.COM_OBJECTFABRIC_SECURITY_SHIRO_SHIROSTORE_CLASS_ID);

    public final com.objectfabric.TMap<java.lang.String, com.objectfabric.security.shiro.Account> getAccounts() {
        Version v = (Version) getSharedVersion_objectfabric();
        return (com.objectfabric.TMap<java.lang.String, com.objectfabric.security.shiro.Account>) getUserTObject_objectfabric(v._accounts);
    }

    public final com.objectfabric.TMap<java.lang.String, com.objectfabric.security.shiro.Role> getRoles() {
        Version v = (Version) getSharedVersion_objectfabric();
        return (com.objectfabric.TMap<java.lang.String, com.objectfabric.security.shiro.Role>) getUserTObject_objectfabric(v._roles);
    }

    public final com.objectfabric.LazyMap<java.lang.String, java.lang.Object> getSessions() {
        Version v = (Version) getSharedVersion_objectfabric();
        return (com.objectfabric.LazyMap<java.lang.String, java.lang.Object>) getUserTObject_objectfabric(v._sessions);
    }

    public static final int ACCOUNTS_INDEX = 0;

    public static final java.lang.String ACCOUNTS_NAME = "accounts";

    public static final java.lang.Class ACCOUNTS_CLASS = com.objectfabric.TMap.class;

    public static final int ROLES_INDEX = 1;

    public static final java.lang.String ROLES_NAME = "roles";

    public static final java.lang.Class ROLES_CLASS = com.objectfabric.TMap.class;

    public static final int SESSIONS_INDEX = 2;

    public static final java.lang.String SESSIONS_NAME = "sessions";

    public static final java.lang.Class SESSIONS_CLASS = com.objectfabric.LazyMap.class;

    public static final int FIELD_COUNT = 3;

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
            case ACCOUNTS_INDEX:
                return ACCOUNTS_NAME;
            case ROLES_INDEX:
                return ROLES_NAME;
            case SESSIONS_INDEX:
                return SESSIONS_NAME;
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
            case ACCOUNTS_INDEX:
                return ACCOUNTS_CLASS;
            case ROLES_INDEX:
                return ROLES_CLASS;
            case SESSIONS_INDEX:
                return SESSIONS_CLASS;
            default:
                throw new IllegalArgumentException();
        }
    }

    protected static class Version extends com.objectfabric.TGeneratedFields32.Version {

        public com.objectfabric.TObject _accounts;

        public com.objectfabric.TObject _roles;

        public com.objectfabric.TObject _sessions;

        private static final int _readOnlys;

        static {
            int readOnlys = 0;
            readOnlys = setBit(readOnlys, ACCOUNTS_INDEX);
            readOnlys = setBit(readOnlys, ROLES_INDEX);
            readOnlys = setBit(readOnlys, SESSIONS_INDEX);
            _readOnlys = readOnlys;
        }

        public Version(com.objectfabric.TGeneratedFields32.Version shared, int length) {
            super(shared, length);
        }

        @Override
        public java.lang.Object getAsObject(int index) {
            switch (index) {
                case ACCOUNTS_INDEX:
                    return getUserTObject_objectfabric(_accounts);
                case ROLES_INDEX:
                    return getUserTObject_objectfabric(_roles);
                case SESSIONS_INDEX:
                    return getUserTObject_objectfabric(_sessions);
                default:
                    return super.getAsObject(index);
            }
        }

        @Override
        public void setAsObject(int index, java.lang.Object value) {
            switch (index) {
                case ACCOUNTS_INDEX:
                    _accounts = (com.objectfabric.TMap) value;
                    break;
                case ROLES_INDEX:
                    _roles = (com.objectfabric.TMap) value;
                    break;
                case SESSIONS_INDEX:
                    _sessions = (com.objectfabric.LazyMap) value;
                    break;
                default:
                    super.setAsObject(index, value);
                    break;
            }
        }

        @Override
        public com.objectfabric.TObject.Version merge(com.objectfabric.TObject.Version target, com.objectfabric.TObject.Version next, int flags) {
            ShiroStore.Version source = (ShiroStore.Version) next;
            ShiroStore.Version merged = (ShiroStore.Version) super.merge(target, next, flags);

            if (source.hasBits()) {
                if (source.getBit(ACCOUNTS_INDEX))
                    merged._accounts = mergeTObject(merged._accounts, source._accounts);

                if (source.getBit(ROLES_INDEX))
                    merged._roles = mergeTObject(merged._roles, source._roles);

                if (source.getBit(SESSIONS_INDEX))
                    merged._sessions = mergeTObject(merged._sessions, source._sessions);
            }

            return merged;
        }

        @Override
        public int getReadOnlys() {
            return _readOnlys;
        }

        @Override
        public void writeWrite(com.objectfabric.Writer writer, int index) {
            if (writer.interrupted())
                writer.resume();

            switch (index) {
                case ACCOUNTS_INDEX: {
                    writer.writeTObject(_accounts);

                    if (writer.interrupted()) {
                        writer.interrupt(null);
                        return;
                    }
                    break;
                }
                case ROLES_INDEX: {
                    writer.writeTObject(_roles);

                    if (writer.interrupted()) {
                        writer.interrupt(null);
                        return;
                    }
                    break;
                }
                case SESSIONS_INDEX: {
                    writer.writeTObject(_sessions);

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
                case ACCOUNTS_INDEX: {
                    ShiroStore.Version shared = (ShiroStore.Version) getUnion();
                    shared._accounts = getSharedVersion_objectfabric(reader.readTObject());

                    if (reader.interrupted()) {
                        reader.interrupt(null);
                        return;
                    }

                    shared.setBit(ACCOUNTS_INDEX);
                    unsetBit(ACCOUNTS_INDEX);
                    break;
                }
                case ROLES_INDEX: {
                    ShiroStore.Version shared = (ShiroStore.Version) getUnion();
                    shared._roles = getSharedVersion_objectfabric(reader.readTObject());

                    if (reader.interrupted()) {
                        reader.interrupt(null);
                        return;
                    }

                    shared.setBit(ROLES_INDEX);
                    unsetBit(ROLES_INDEX);
                    break;
                }
                case SESSIONS_INDEX: {
                    ShiroStore.Version shared = (ShiroStore.Version) getUnion();
                    shared._sessions = getSharedVersion_objectfabric(reader.readTObject());

                    if (reader.interrupted()) {
                        reader.interrupt(null);
                        return;
                    }

                    shared.setBit(SESSIONS_INDEX);
                    unsetBit(SESSIONS_INDEX);
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
            return new ShiroStore.Version(this, FIELD_COUNT);
        }

        @Override
        public int getClassId() {
            return com.objectfabric.security.shiro.ShiroObjectModel.COM_OBJECTFABRIC_SECURITY_SHIRO_SHIROSTORE_CLASS_ID;
        }

        @SuppressWarnings("static-access")
        @Override
        public com.objectfabric.ObjectModel getObjectModel() {
            return com.objectfabric.security.shiro.ShiroObjectModel.getInstance();
        }
    }
}