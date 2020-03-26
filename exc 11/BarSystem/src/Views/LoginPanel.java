package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JFrame {

    //Login panel
//1.  login panel
    // 1 button
    // 3 labels
    // 2 text boxes
    private JLabel jLabelLoginTop;
    private JButton jButtonLogin;
    private JTextField jTextFieldUsername;
    private JTextField jTextFieldPassword;

    public LoginPanel() {
        super("Login");
//----------------
        this.setLayout(new FlowLayout());
        //this.setDefaultCloseOperation(EXIT_ON_CLOSE);

//-----------------------------
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
                //

            }
        });

        add(jButtonLogin);

    }
}
