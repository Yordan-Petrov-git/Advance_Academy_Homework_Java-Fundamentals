package Views;

import Helpers.Validators;
import Models.Waiter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel {

    //Login panel
//1.  login panel
    // 1 button
    // 3 labels
    // 2 text boxes
    private JLabel jLabelLoginTop;
    private JButton jButtonLogin;
    private JTextField jTextFieldUsername;
    private JTextField jTextFieldPassword;
    public JFrameMain jFrame;


    public LoginPanel(JFrameMain jFrame) {
        this.jFrame = jFrame;

        jLabelLoginTop = new JLabel("Enter your credentials");
        add(jLabelLoginTop);

        jTextFieldUsername = new JTextField("Username");
        add(jTextFieldUsername);

        jTextFieldPassword = new JTextField("Password");
        add(jTextFieldPassword);

        jButtonLogin = new JButton("Sign in");
        jButtonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = jTextFieldUsername.getText().trim();
                String password = jTextFieldPassword.getText().trim();
                login(username, password);
            }
        });

        add(jButtonLogin);

    }

    public void login(String username, String password) {
        //Method that shows menu jPanel to chose an action : make new order , add to ex

        if (Validators.validatePassword(password) && Validators.validateUserName(username)) {
            System.out.println("valid input");
            for (Waiter waiter : JFrameMain.waiter) {
                if (username.equals(waiter.getWaitressUsername()) && password.equals(waiter.getWaitressPassword())) {
                    System.out.println("logged in as " + waiter.getWaitressUsername());
                    JFrameMain.currentWaiter = waiter;
                    System.out.println(JFrameMain.currentWaiter.toString());
                    jFrame.showMenuPanel();
                }
            }

        }

    }
}
