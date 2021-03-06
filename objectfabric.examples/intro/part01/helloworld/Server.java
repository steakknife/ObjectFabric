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

package part01.helloworld;

import com.objectfabric.misc.Log;
import com.objectfabric.transports.Server.Callback;
import com.objectfabric.transports.http.HTTP;
import com.objectfabric.transports.socket.SocketServer;
import com.objectfabric.transports.socket.SocketServer.Session;

/**
 * Exchanges text with clients.
 */
public class Server {

    private static final int PORT = 8080;

    public static void main(String[] args) throws Exception {
        /*
         * Creates a socket server.
         */
        SocketServer server = new SocketServer(PORT);

        /*
         * Listen for incoming connections and objects sent from clients.
         */
        server.setCallback(new Callback<Session>() {

            public void onConnection(Session session) {
                System.out.println("Connection from " + session.getRemoteAddress());

                /*
                 * Send an object to client. Here we send a String, see part02 for other
                 * supported types.
                 */
                session.send("Hello");
            }

            public void onDisconnection(Session session, Exception e) {
                System.out.println("Disconnection from " + session.getRemoteAddress());
            }

            public void onReceived(Session session, Object object) {
                System.out.println("Received: " + object);
            }
        });

        /*
         * This line enables HTTP connections. It is not required for Java and .NET
         * clients, but allows connections from the GWT version of this sample.
         */
        server.addFilter(new HTTP());

        /*
         * Start the server.
         */
        server.start();

        Log.write("Started a server on port " + server.getPort());

        /*
         * Server must be killed. ObjectFabric can be shutdown cleanly but kills must be
         * supported in the cloud anyway so that's the default behavior. Also, avoid
         * reading console as it does not work when running as a daemon, e.g. for EC2.
         */
        Thread.sleep(Long.MAX_VALUE);
    }
}
