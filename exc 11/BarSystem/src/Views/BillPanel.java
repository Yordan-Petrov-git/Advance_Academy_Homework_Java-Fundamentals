package Views;

import Models.Order;
import Models.Product;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BillPanel extends JPanel {

    private JLabel jLabelShowBill;
    public JFrameMain jFrame;
    private JButton jButtonBack;

    public BillPanel(JFrameMain jFrame) {
        this.jFrame = jFrame;
        double bill = getBill();
        String message = "Your  waiter was: " + JFrameMain.currentWaiter.getUserFullName()
                + " The bill for " + JFrameMain.currentOrder.getTableID()
                + " is total :" + String.valueOf(bill);
        jLabelShowBill = new JLabel(message);
        add(jLabelShowBill);

        jButtonBack = new JButton("Back");
        jButtonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.billPanel.setVisible(false);
                remove(jFrame.billPanel);
                jFrame.showLoginPanel();
            }
        });

        add(jButtonBack);
    }

    public Double getBill() {
        //Sums the total bill of all the items of one order
        // TODO : FIX SHOW BILL FOR EACH TABLE
        double totalSum = 0.0;
        //Holds the sum
        for (Order order : JFrameMain.orders) {
            if (JFrameMain.currentOrder.getTableID().equals(JFrameMain.currentTableId)){
                for (Product product : order.getProductArrayList()) {
                    totalSum += product.getProductPrice();
                }
                break;
            }
        }
        return totalSum;
    }

}
