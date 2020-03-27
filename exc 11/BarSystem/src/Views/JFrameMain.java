package Views;

import Models.Order;
import Models.Product;
import Models.Waiter;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class JFrameMain extends JFrame {


    public static ArrayList<Waiter> waiter = new ArrayList<>();
    public static ArrayList<Product> products = new ArrayList<>();
    public static ArrayList<Order> orders = new ArrayList<>();
    public static Waiter currentWaiter;
    public static String currentTableId;
    public static Order currentOrder;


    public LoginPanel loginPanel;
    public MenuPanel menuPanel;
    public TablesPanel tablesPanel;
    public ItemsPanel itemsPanel;
    public BillPanel billPanel;


    public JFrameMain() {
        super("Bar System");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(1,2,3));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        this.setSize((int)width,(int)height);

        showLoginPanel();
    }

    public void showLoginPanel() {
        loginPanel = new LoginPanel(this);
        loginPanel.setSize(getWidth(), getHeight());
        add(loginPanel);
    }

    public void showMenuPanel() {
        loginPanel.setVisible(false);
        remove(loginPanel);

        menuPanel = new MenuPanel(this);
        menuPanel.setSize(getWidth(), getHeight());
        add(menuPanel);
    }

    public void showTablesPanel(int clickedButton) {
        menuPanel.setVisible(false);
        remove(menuPanel);

        tablesPanel = new TablesPanel(this);
        tablesPanel.clickedButton = clickedButton;
        tablesPanel.setSize(getWidth(), getHeight());
        add(tablesPanel);
    }


    public void showItemsPanel() {
        tablesPanel.setVisible(false);
        remove(tablesPanel);

        itemsPanel = new ItemsPanel(this);
        itemsPanel.setSize(getWidth(), getHeight());
        add(itemsPanel);
    }

    public void showBillPanel() {
        tablesPanel.setVisible(false);
        remove(tablesPanel);

        billPanel = new BillPanel(this);
        billPanel.setSize(getWidth(), getHeight());
        add(billPanel);
    }
}
