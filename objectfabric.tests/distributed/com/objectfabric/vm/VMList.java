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

package com.objectfabric.vm;

import org.junit.Test;

import com.objectfabric.TestsHelper;
import com.objectfabric.misc.SeparateClassLoader;

public class VMList extends TestsHelper {

    public VMList() {
    }

    @Test
    public void run() {
        SeparateClassLoader thread = new SeparateClassLoader(VMListServer.class.getName());

        thread.start();

        try {
            thread.join();
        } catch (java.lang.InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        thread.close();
    }

    public static void main(String[] args) throws Exception {
        VMList test = new VMList();

        for (int i = 0; i < 100; i++) {
            test.before();
            test.run();
            test.after();
        }
    }
}
