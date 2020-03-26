package Views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JFrame {

    private JButton jButtonAddNewOrder;
    private JButton jButtonAddExistingOrder;
    private JButton jButtonShowBill;

    public MenuPanel() {
        super("Main menu");

        jButtonAddNewOrder = new JButton("Add new order");
        jButtonAddNewOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //

            }
        });
        add(jButtonAddNewOrder);

        jButtonAddExistingOrder = new JButton("Add to existing order");
        jButtonAddExistingOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //

            }
        });
        add(jButtonAddExistingOrder);

        jButtonShowBill = new JButton("Show bill");
        jButtonShowBill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //

            }
        });
        add(jButtonShowBill);

    }
//2.  menu panel
    // 1 label
    // 3buttons

}
