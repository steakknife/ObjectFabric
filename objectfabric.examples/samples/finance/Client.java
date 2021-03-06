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

package finance;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Random;

import com.objectfabric.TList;
import com.objectfabric.Transaction;
import com.objectfabric.misc.PlatformConsole;
import com.objectfabric.transports.socket.SocketClient;

import finance.generated.Instrument;
import finance.generated.Market;
import finance.generated.ObjectModel;
import finance.generated.Order;
import finance.generated.User;

/**
 * This sample executes a method on a Market instance shared by the server to retrieve
 * instruments.
 */
public class Client {

    private User user;

    public static void main(String[] args) throws IOException {
        ObjectModel.register();
        Client client = new Client();
        client.connect();
    }

    private void connect() throws IOException {
        SocketClient client = new SocketClient("localhost", 4444);

        System.out.println("Retrieving market from server");

        final Market market = (Market) client.connectAndWaitObject();

        System.out.println("Setting server's trunk as default so that objects we create belong to it");

        Transaction.setDefaultTrunk(market.getTrunk());

        // Transaction is needed when iterating a collection
        Transaction.run(new Runnable() {

            public void run() {
                System.out.println("Adding our user to the market");

                user = new User(new TList<Order>());
                user.setName("User " + Integer.toString(new Random().nextInt(10)));
                user.setEmail("foo@bar.com");
                market.getUsers().add(user);

                System.out.println("Listing current users");

                for (User current : market.getUsers())
                    System.out.println(current.getName() + " (" + current.getEmail() + ")");
            }
        });

        System.out.println("Calling a method on the market to retrieve instruments");

        TList<Instrument> instruments = market.getInstruments("");

        System.out.println("Adding random orders for user");

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            Instrument instrument = instruments.get(rand.nextInt(instruments.size()));

            Order order = new Order();
            order.setInstrument(instrument);
            order.setPrice(new BigDecimal(Double.toString(rand.nextDouble())));
            order.setQuantity(new BigDecimal(Double.toString(rand.nextDouble())));

            user.getOrders().add(order);
        }

        Transaction.run(new Runnable() {

            public void run() {
                System.out.println("Listing all orders:");

                for (User current : market.getUsers())
                    for (Order order : user.getOrders())
                        System.out.println(current.getName() + ": [" + order.getInstrument().getName() + ", " + order.getQuantity() + ", " + order.getPrice());

                System.out.println("Done!");
            }
        });

        System.out.println("Press enter to continue");
        PlatformConsole.readLine();
    }
}
