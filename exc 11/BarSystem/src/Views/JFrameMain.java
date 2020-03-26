package Views;

import javax.swing.*;
import java.awt.*;

public class JFrameMain extends JFrame {

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

}
