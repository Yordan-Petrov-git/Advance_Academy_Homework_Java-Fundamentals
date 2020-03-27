import Helpers.InitializeObjects;
import Models.Product;
import Models.Waiter;
import Views.JFrameMain;
import Views.LoginPanel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
         //init OBJECTS
//        Waiter waiter = new Waiter("Viktor", "VVV","1234");
//        Product product = new Product("Wiskey", "50ml", 6.00);
//        JFrameMain.waiter.add(waiter);
//        JFrameMain.products.add(product);
        Waiter a = new Waiter("Ivan Ivanov","Ivan","1234");
        JFrameMain.waiter.add(a);
        String fullName = "Ivan Ivanov";
        String username = "Ivan";
        String password="1234";
        InitializeObjects.initializeNewWaiter(fullName,username,password);
        InitializeObjects.initializeNewWProduct("Wiskey", "50ml", 6.00);
//        InitializeObjects.initializeNewWOrder(JFrameMain.products,"Table 0","Ivan Ivanov");
//        InitializeObjects.initializeNewWOrder(JFrameMain.products,"Table 1","Ivan Ivanov");
        System.out.println(JFrameMain.orders.toString());
        // InitializeObjects.initializeNewWaiter("Ivan Ivanov","Ivan","1234");

        //sTART
        JFrameMain jFrame =  new JFrameMain();
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }
}
