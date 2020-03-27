package Helpers;

import Models.Order;
import Models.Product;
import Models.Waiter;
import Views.JFrameMain;

import java.util.ArrayList;

public class InitializeObjects {

    public static void initializeNewWaiter(String fullName, String username, String password) {
        //Method that initialise waiter object
        for (Waiter waiter : JFrameMain.waiter) {
            //iterates trough array of waiters
            if (username.equals(waiter.getWaitressUsername())) {
                //if the new waiters's username already exists in the waiter array it does not create new object
                //username's must be unique
                //shows test message
                System.out.println("Username already exists");
                //stops
                break;
            } else {
                //initialise new waiter if username is not present in the array
                Waiter newWaiter = new Waiter(fullName, username, password);
                //adds the new waiter to the array
                JFrameMain.waiter.add(newWaiter);
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

    public static void initializeNewWOrder(String tableID, Waiter WaiterName) {
        //
        Order order = new Order(tableID, WaiterName);
        JFrameMain.orders.add(order);
    }

    public static void initializeNewWOrderProductArrayList(ArrayList<Product> productArrayList) {
        //
        Order order = new Order(productArrayList);
        JFrameMain.orders.add(order);
    }
}
