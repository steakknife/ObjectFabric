
package of4gwt;

//==============================================================================
//                                                                              
//  THIS FILE HAS BEEN GENERATED BY OBJECTFABRIC                                
//                                                                              
//==============================================================================

@SuppressWarnings({ "hiding", "unchecked", "static-access", "unused" })
public class UsernamePasswordUserManager extends of4gwt.TGeneratedFields32 {

    public UsernamePasswordUserManager() {
        this(of4gwt.Transaction.getDefaultTrunk());
    }

    public UsernamePasswordUserManager(of4gwt.Transaction trunk) {
        this(new Version(null, FIELD_COUNT), trunk);
    }

    protected UsernamePasswordUserManager(of4gwt.TObject.Version shared, of4gwt.Transaction trunk) {
        super(shared, trunk);
    }

    public static final of4gwt.TType TYPE = new of4gwt.TType(of4gwt.ShiroObjectModel.getInstance(), of4gwt.ShiroObjectModel.OF4GWT_USERNAMEPASSWORDUSERMANAGER_CLASS_ID);

    public static final int FIELD_COUNT = 0;

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
            default:
                throw new IllegalArgumentException();
        }
    }

    // Methods

    protected static final int METHOD_0 = 0;

    protected static final int METHOD_1 = 1;

    protected static final int METHOD_2 = 2;
    /**
     * Asynchronous version.
     */
    public final of4gwt.misc.Future<java.lang.Void> createAccountAsync(java.lang.String username, java.lang.String password, java.lang.Object userData, com.google.gwt.user.client.rpc.AsyncCallback<java.lang.Void> callback) {
        return createAccountAsync(username, password, userData, callback, getDefaultAsyncOptions_objectfabric(), getDefaultMethodExecutor_objectfabric());
    }

    /**
     * Asynchronous version, with options for the callback.
     */
    public final of4gwt.misc.Future<java.lang.Void> createAccountAsync(java.lang.String username, java.lang.String password, java.lang.Object userData, com.google.gwt.user.client.rpc.AsyncCallback<java.lang.Void> callback, of4gwt.AsyncOptions asyncOptions) {
        return createAccountAsync(username, password, userData, callback, asyncOptions, getDefaultMethodExecutor_objectfabric());
    }

    /**
     * Asynchronous version, with options for the callback, and specifies the Executor or TaskScheduler that will run the method. For replicated objects,
     * the method runs by default on the site the object has been created. @see Site.getMethodExecutor() to specify an execution site.
     */
    public final of4gwt.misc.Future<java.lang.Void> createAccountAsync(java.lang.String username, java.lang.String password, java.lang.Object userData, com.google.gwt.user.client.rpc.AsyncCallback<java.lang.Void> callback, of4gwt.AsyncOptions asyncOptions, of4gwt.misc.Executor executor) {
        if (executor == of4gwt.misc.TransparentExecutor.getInstance()) {
            java.lang.Void result_ = null;
            java.lang.Exception exception_ = null;

            try {
                createAccountImplementation(username, password, userData);
            } catch (java.lang.Exception e_) {
                exception_ = e_;
            }

            return getCompletedFuture_objectfabric(result_, exception_, callback, asyncOptions);
        } else {
            of4gwt.ShiroObjectModel.Method0.Version version_ = (of4gwt.ShiroObjectModel.Method0.Version) createVersion_objectfabric(of4gwt.ShiroObjectModel.Method0.INSTANCE);

            if (username != null) {
                version_._username = username;
                version_.setBit(of4gwt.ShiroObjectModel.Method0.USERNAME_INDEX);
            }

            if (password != null) {
                version_._password = password;
                version_.setBit(of4gwt.ShiroObjectModel.Method0.PASSWORD_INDEX);
            }

            if (userData != null) {
                version_._userData = userData;
                version_.setBit(of4gwt.ShiroObjectModel.Method0.USER_DATA_INDEX);
            }

            of4gwt.TObject.UserTObject.LocalMethodCall call_ = new of4gwt.TObject.UserTObject.LocalMethodCall(this, of4gwt.ShiroObjectModel.Method0.INSTANCE, version_, METHOD_0, callback, asyncOptions);
            executor.execute(call_);
            return call_;
        }
    }

    /**
     * Override to implement the method.
     */
    protected void createAccountImplementation(java.lang.String username, java.lang.String password, java.lang.Object userData) {
        throw new RuntimeException(of4gwt.Strings.MISSING_METHOD_CALL_IMPLEMENTATION);
    }

    /**
     * Override to implement the method asynchronously.
     */
    protected void createAccountImplementationAsync(java.lang.String username, java.lang.String password, java.lang.Object userData, of4gwt.MethodCall call) {
        try {
            createAccountImplementation(username, password, userData);
            call.set(null);
        } catch (java.lang.Exception e_) {
            call.setException(e_);
        }
    }

    /**
     * Asynchronous version.
     */
    public final of4gwt.misc.Future<java.lang.Void> updateAccountAsync(java.lang.String username, java.lang.String oldPassword, java.lang.String newPassword, java.lang.Object userData, com.google.gwt.user.client.rpc.AsyncCallback<java.lang.Void> callback) {
        return updateAccountAsync(username, oldPassword, newPassword, userData, callback, getDefaultAsyncOptions_objectfabric(), getDefaultMethodExecutor_objectfabric());
    }

    /**
     * Asynchronous version, with options for the callback.
     */
    public final of4gwt.misc.Future<java.lang.Void> updateAccountAsync(java.lang.String username, java.lang.String oldPassword, java.lang.String newPassword, java.lang.Object userData, com.google.gwt.user.client.rpc.AsyncCallback<java.lang.Void> callback, of4gwt.AsyncOptions asyncOptions) {
        return updateAccountAsync(username, oldPassword, newPassword, userData, callback, asyncOptions, getDefaultMethodExecutor_objectfabric());
    }

    /**
     * Asynchronous version, with options for the callback, and specifies the Executor or TaskScheduler that will run the method. For replicated objects,
     * the method runs by default on the site the object has been created. @see Site.getMethodExecutor() to specify an execution site.
     */
    public final of4gwt.misc.Future<java.lang.Void> updateAccountAsync(java.lang.String username, java.lang.String oldPassword, java.lang.String newPassword, java.lang.Object userData, com.google.gwt.user.client.rpc.AsyncCallback<java.lang.Void> callback, of4gwt.AsyncOptions asyncOptions, of4gwt.misc.Executor executor) {
        if (executor == of4gwt.misc.TransparentExecutor.getInstance()) {
            java.lang.Void result_ = null;
            java.lang.Exception exception_ = null;

            try {
                updateAccountImplementation(username, oldPassword, newPassword, userData);
            } catch (java.lang.Exception e_) {
                exception_ = e_;
            }

            return getCompletedFuture_objectfabric(result_, exception_, callback, asyncOptions);
        } else {
            of4gwt.ShiroObjectModel.Method1.Version version_ = (of4gwt.ShiroObjectModel.Method1.Version) createVersion_objectfabric(of4gwt.ShiroObjectModel.Method1.INSTANCE);

            if (username != null) {
                version_._username = username;
                version_.setBit(of4gwt.ShiroObjectModel.Method1.USERNAME_INDEX);
            }

            if (oldPassword != null) {
                version_._oldPassword = oldPassword;
                version_.setBit(of4gwt.ShiroObjectModel.Method1.OLD_PASSWORD_INDEX);
            }

            if (newPassword != null) {
                version_._newPassword = newPassword;
                version_.setBit(of4gwt.ShiroObjectModel.Method1.NEW_PASSWORD_INDEX);
            }

            if (userData != null) {
                version_._userData = userData;
                version_.setBit(of4gwt.ShiroObjectModel.Method1.USER_DATA_INDEX);
            }

            of4gwt.TObject.UserTObject.LocalMethodCall call_ = new of4gwt.TObject.UserTObject.LocalMethodCall(this, of4gwt.ShiroObjectModel.Method1.INSTANCE, version_, METHOD_1, callback, asyncOptions);
            executor.execute(call_);
            return call_;
        }
    }

    /**
     * Override to implement the method.
     */
    protected void updateAccountImplementation(java.lang.String username, java.lang.String oldPassword, java.lang.String newPassword, java.lang.Object userData) {
        throw new RuntimeException(of4gwt.Strings.MISSING_METHOD_CALL_IMPLEMENTATION);
    }

    /**
     * Override to implement the method asynchronously.
     */
    protected void updateAccountImplementationAsync(java.lang.String username, java.lang.String oldPassword, java.lang.String newPassword, java.lang.Object userData, of4gwt.MethodCall call) {
        try {
            updateAccountImplementation(username, oldPassword, newPassword, userData);
            call.set(null);
        } catch (java.lang.Exception e_) {
            call.setException(e_);
        }
    }

    /**
     * Asynchronous version.
     */
    public final of4gwt.misc.Future<java.lang.Void> deleteAccountAsync(java.lang.String username, com.google.gwt.user.client.rpc.AsyncCallback<java.lang.Void> callback) {
        return deleteAccountAsync(username, callback, getDefaultAsyncOptions_objectfabric(), getDefaultMethodExecutor_objectfabric());
    }

    /**
     * Asynchronous version, with options for the callback.
     */
    public final of4gwt.misc.Future<java.lang.Void> deleteAccountAsync(java.lang.String username, com.google.gwt.user.client.rpc.AsyncCallback<java.lang.Void> callback, of4gwt.AsyncOptions asyncOptions) {
        return deleteAccountAsync(username, callback, asyncOptions, getDefaultMethodExecutor_objectfabric());
    }

    /**
     * Asynchronous version, with options for the callback, and specifies the Executor or TaskScheduler that will run the method. For replicated objects,
     * the method runs by default on the site the object has been created. @see Site.getMethodExecutor() to specify an execution site.
     */
    public final of4gwt.misc.Future<java.lang.Void> deleteAccountAsync(java.lang.String username, com.google.gwt.user.client.rpc.AsyncCallback<java.lang.Void> callback, of4gwt.AsyncOptions asyncOptions, of4gwt.misc.Executor executor) {
        if (executor == of4gwt.misc.TransparentExecutor.getInstance()) {
            java.lang.Void result_ = null;
            java.lang.Exception exception_ = null;

            try {
                deleteAccountImplementation(username);
            } catch (java.lang.Exception e_) {
                exception_ = e_;
            }

            return getCompletedFuture_objectfabric(result_, exception_, callback, asyncOptions);
        } else {
            of4gwt.ShiroObjectModel.Method2.Version version_ = (of4gwt.ShiroObjectModel.Method2.Version) createVersion_objectfabric(of4gwt.ShiroObjectModel.Method2.INSTANCE);

            if (username != null) {
                version_._username = username;
                version_.setBit(of4gwt.ShiroObjectModel.Method2.USERNAME_INDEX);
            }

            of4gwt.TObject.UserTObject.LocalMethodCall call_ = new of4gwt.TObject.UserTObject.LocalMethodCall(this, of4gwt.ShiroObjectModel.Method2.INSTANCE, version_, METHOD_2, callback, asyncOptions);
            executor.execute(call_);
            return call_;
        }
    }

    /**
     * Override to implement the method.
     */
    protected void deleteAccountImplementation(java.lang.String username) {
        throw new RuntimeException(of4gwt.Strings.MISSING_METHOD_CALL_IMPLEMENTATION);
    }

    /**
     * Override to implement the method asynchronously.
     */
    protected void deleteAccountImplementationAsync(java.lang.String username, of4gwt.MethodCall call) {
        try {
            deleteAccountImplementation(username);
            call.set(null);
        } catch (java.lang.Exception e_) {
            call.setException(e_);
        }
    }

    @SuppressWarnings({ "static-access", "cast" })
    @Override
    protected void invoke_objectfabric(of4gwt.MethodCall call) {
        switch (getMethodCallIndex_objectfabric(call)) {
            case METHOD_0: {
                of4gwt.ShiroObjectModel.Method0.Version version_ = (of4gwt.ShiroObjectModel.Method0.Version) getMethodVersion_objectfabric(call);
                java.lang.String username = version_ != null ? (java.lang.String) version_._username : null;
                java.lang.String password = version_ != null ? (java.lang.String) version_._password : null;
                java.lang.Object userData = version_ != null ? (java.lang.Object) version_._userData : null;

                try {
                    createAccountImplementationAsync(username, password, userData, call);
                } catch (java.lang.Exception e_) {
                    call.setException(e_);
                }

                break;
            }
            case METHOD_1: {
                of4gwt.ShiroObjectModel.Method1.Version version_ = (of4gwt.ShiroObjectModel.Method1.Version) getMethodVersion_objectfabric(call);
                java.lang.String username = version_ != null ? (java.lang.String) version_._username : null;
                java.lang.String oldPassword = version_ != null ? (java.lang.String) version_._oldPassword : null;
                java.lang.String newPassword = version_ != null ? (java.lang.String) version_._newPassword : null;
                java.lang.Object userData = version_ != null ? (java.lang.Object) version_._userData : null;

                try {
                    updateAccountImplementationAsync(username, oldPassword, newPassword, userData, call);
                } catch (java.lang.Exception e_) {
                    call.setException(e_);
                }

                break;
            }
            case METHOD_2: {
                of4gwt.ShiroObjectModel.Method2.Version version_ = (of4gwt.ShiroObjectModel.Method2.Version) getMethodVersion_objectfabric(call);
                java.lang.String username = version_ != null ? (java.lang.String) version_._username : null;

                try {
                    deleteAccountImplementationAsync(username, call);
                } catch (java.lang.Exception e_) {
                    call.setException(e_);
                }

                break;
            }
            default: {
                super.invoke_objectfabric(call);
                break;
            }
        }
    }

    @SuppressWarnings({ "static-access", "cast" })
    @Override
    protected void setResult_objectfabric(of4gwt.TObject.Version version, int index, java.lang.Object result) {
        switch (index) {
            case METHOD_0: {
                break;
            }
            case METHOD_1: {
                break;
            }
            case METHOD_2: {
                break;
            }
            default: {
                super.setResult_objectfabric(version, index, result);
                break;
            }
        }
    }

    @SuppressWarnings("static-access")
    @Override
    protected void setError_objectfabric(of4gwt.TObject.Version version, int index, java.lang.String error) {
        switch (index) {
            case METHOD_0: {
                ((of4gwt.ShiroObjectModel.Method0.Version) version)._error_objectfabric = error;
                ((of4gwt.ShiroObjectModel.Method0.Version) version).setBit(of4gwt.ShiroObjectModel.Method0.ERROR_OBJECTFABRIC_INDEX);
                break;
            }
            case METHOD_1: {
                ((of4gwt.ShiroObjectModel.Method1.Version) version)._error_objectfabric = error;
                ((of4gwt.ShiroObjectModel.Method1.Version) version).setBit(of4gwt.ShiroObjectModel.Method1.ERROR_OBJECTFABRIC_INDEX);
                break;
            }
            case METHOD_2: {
                ((of4gwt.ShiroObjectModel.Method2.Version) version)._error_objectfabric = error;
                ((of4gwt.ShiroObjectModel.Method2.Version) version).setBit(of4gwt.ShiroObjectModel.Method2.ERROR_OBJECTFABRIC_INDEX);
                break;
            }
            default: {
                super.setError_objectfabric(version, index, error);
                break;
            }
        }
    }

    @SuppressWarnings("static-access")
    @Override
    protected void getResultOrError_objectfabric(of4gwt.MethodCall call) {
        switch (getMethodCallIndex_objectfabric(call)) {
            case METHOD_0: {
                of4gwt.ShiroObjectModel.Method0.Version version = (of4gwt.ShiroObjectModel.Method0.Version) getMethodVersion_objectfabric(call);

                if (version == null || version._error_objectfabric == null)
                    setDirect(call, null);
                else
                    setExceptionDirect(call, new of4gwt.misc.ReplicatedException(version._error_objectfabric));

                break;
            }
            case METHOD_1: {
                of4gwt.ShiroObjectModel.Method1.Version version = (of4gwt.ShiroObjectModel.Method1.Version) getMethodVersion_objectfabric(call);

                if (version == null || version._error_objectfabric == null)
                    setDirect(call, null);
                else
                    setExceptionDirect(call, new of4gwt.misc.ReplicatedException(version._error_objectfabric));

                break;
            }
            case METHOD_2: {
                of4gwt.ShiroObjectModel.Method2.Version version = (of4gwt.ShiroObjectModel.Method2.Version) getMethodVersion_objectfabric(call);

                if (version == null || version._error_objectfabric == null)
                    setDirect(call, null);
                else
                    setExceptionDirect(call, new of4gwt.misc.ReplicatedException(version._error_objectfabric));

                break;
            }
            default: {
                super.getResultOrError_objectfabric(call);
                break;
            }
        }
    }

    protected static class Version extends of4gwt.TGeneratedFields32.Version {

        static {
        }

        public Version(of4gwt.TGeneratedFields32.Version shared, int length) {
            super(shared, length);
        }

        @Override
        public java.lang.Object getAsObject(int index) {
            switch (index) {
                default:
                    return super.getAsObject(index);
            }
        }

        @Override
        public void setAsObject(int index, java.lang.Object value) {
            switch (index) {
                default:
                    super.setAsObject(index, value);
                    break;
            }
        }

        @Override
        public of4gwt.TObject.Version merge(of4gwt.TObject.Version target, of4gwt.TObject.Version next, int flags) {
            UsernamePasswordUserManager.Version merged = (UsernamePasswordUserManager.Version) super.merge(target, next, flags);
            return merged;
        }

        @Override
        public void writeWrite(of4gwt.Writer writer, int index) {
            if (writer.interrupted())
                writer.resume();

            switch (index) {
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
            return new UsernamePasswordUserManager.Version(this, FIELD_COUNT);
        }

        @Override
        public int getClassId() {
            return of4gwt.ShiroObjectModel.OF4GWT_USERNAMEPASSWORDUSERMANAGER_CLASS_ID;
        }

        @SuppressWarnings("static-access")
        @Override
        public of4gwt.ObjectModel getObjectModel() {
            return of4gwt.ShiroObjectModel.getInstance();
        }
    }
}