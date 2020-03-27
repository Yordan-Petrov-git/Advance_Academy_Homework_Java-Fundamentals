package Helpers;

import Models.Order;
import Models.Product;
import Models.Waiter;
import Views.JFrameMain;

import java.util.ArrayList;

public class InitializeObjects {

    public static void initializeNewWaiter(String fullName, String username, String password) {
        //Method that initialise waiter object
        for (Waiter w : JFrameMain.waiter) {
            //iterates trough array of waiters
            if (username.equals(w.getWaiterUsername())) {
                //if the new waiters's username already exists in the waiter array it does not create new object
                //username's must be unique
                //shows test message
                System.out.println("Username already exists");
                //stops
                break;
            } else if (!username.equals(w.getWaiterUsername())){
                //initialise new waiter if username is not present in the array
                Waiter waiter = new Waiter(fullName, username, password);
                //adds the new waiter to the array
                JFrameMain.waiter.add(waiter);
            }
        }
    }

    public static void initializeNewWProduct(String productName, String productQuantity, double productPrice) {
        //
//        for (Product product : JFrameMain.products ) {
//
//        }
        Product product = new Product(productName, productQuantity, productPrice);
        JFrameMain.products.add(product);
    }

    public static Order initializeNewWOrder(String tableID, Waiter WaiterName) {
        //
        return new Order(tableID, WaiterName);
    }

    public static void initializeNewWOrderProductArrayList(ArrayList<Product> productArrayList, String tableID, Waiter WaiterName) {
        //
        Order order = initializeNewWOrder(tableID, WaiterName);
        order.setProductArrayList(productArrayList);
        JFrameMain.orders.add(order);
    }
}
