package Views;

import Models.Order;
import Models.Product;

import javax.swing.*;

public class BillPanel extends JPanel {
    private JLabel jLabelShowBill;
    public JFrameMain jFrame;

    public BillPanel(JFrameMain jFrame) {
        this.jFrame = jFrame;
        double bill = getBill();
        jLabelShowBill = new JLabel("Your  waiter was: " + JFrameMain.currentWaiter.getUserFullName() + " The bill for " + JFrameMain.currentTable + "is total :" + String.valueOf(bill));
        add(jLabelShowBill);
    }

    public Double getBill() {
        double total = 0.0;
        for (Product product : JFrameMain.products) {
            total += product.getProductPrice();
        }
        System.out.println(total);
        return total;
    }

}
