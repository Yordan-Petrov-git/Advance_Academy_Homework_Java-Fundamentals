package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel {

    private JLabel jLabelTop;
    private JButton jButtonAddNewOrder;
    private JButton jButtonAddExistingOrder;
    private JButton jButtonShowBill;
    public JFrameMain jFrame;

    public MenuPanel(JFrameMain jFrame) {
        this.jFrame = jFrame;

        jLabelTop = new JLabel("Menu");
        add(jLabelTop);

        jButtonAddNewOrder = new JButton("Add new order");
        jButtonAddNewOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewOrder();
            }
        });
        add(jButtonAddNewOrder);

        jButtonAddExistingOrder = new JButton("Add to existing order");
        jButtonAddExistingOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addToExistingOrder();
            }
        });
        add(jButtonAddExistingOrder);

        jButtonShowBill = new JButton("Show bill");
        jButtonShowBill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showBill();
            }
        });
        add(jButtonShowBill);

    }
//2.  menu panel
    // 1 label
    // 3buttons

    public void addNewOrder() {
        jFrame.showTablesPanel(1);
    }

    public void addToExistingOrder() {
        jFrame.showTablesPanel(2);
    }

    public void showBill() {
        jFrame.showTablesPanel(3);
    }
}
