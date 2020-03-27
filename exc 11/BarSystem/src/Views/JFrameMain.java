package Views;

import Models.Order;
import Models.Product;
import Models.Waiter;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class JFrameMain extends JFrame {


    public static List<Waiter> waiter = new ArrayList<>();
    public static List<Product> products = new ArrayList<>();
    public static List<Order> orders = new ArrayList<>();
    public static Waiter currentWaiter;

    public LoginPanel loginPanel;
    public MenuPanel menuPanel;
    public TablesPanel tablesPanel;

    public JFrameMain() {
        super("Bar System");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(800, 600);

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

    public void showTablesPanel(int selectedOperation) {
        menuPanel.setVisible(false);
        remove(menuPanel);

        tablesPanel = new TablesPanel(this);
        // tablesPanel.selectedOperation = selectedOperation;
        tablesPanel.setSize(getWidth(), getHeight());
        add(tablesPanel);
    }
}
