package Models;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> productArrayList;
    private String tableID;
    private String WaiterUsername;


    public Order(ArrayList<Product> productArrayList, String tableID, String waiterUsername) {
        setProductArrayList(productArrayList);
        setTableID(tableID);
        setWaiterUsername(waiterUsername);
    }


    public ArrayList<Product> getProductArrayList() {
        return this.productArrayList;
    }

    public void setProductArrayList(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    public String getTableID() {
        return this.tableID;
    }

    public void setTableID(String tableID) {
        this.tableID = tableID;
    }

    public String getWaiterUsername() {
        return this.WaiterUsername;
    }

    public void setWaiterUsername(String waiterUsername) {
        WaiterUsername = waiterUsername;
    }


}
