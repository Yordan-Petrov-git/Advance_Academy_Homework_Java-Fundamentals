package Helpers;

import Models.Product;
import Models.Waiter;
import Views.JFrameMain;

public class InitializeObjects {


  public static  void initializeNewWaiter(String fullName,String username, String password){
//      String fullName = "Ivan Ivanov";
//      String username = "I_Ivanov";
//      String password="1234";
      Waiter waiter = new Waiter(fullName, username,password);
      JFrameMain.waiter.add(waiter);
  }
    public static  void initializeNewWProduct(String productName,String productQuantity, double productPrice){
//        String productName = "Vodka";
//        String productQuantity = "200ml";
//        double productPrice=15.00;
        Product product = new Product(productName,productQuantity,productPrice);
        JFrameMain.products.add(product);
    }
}
