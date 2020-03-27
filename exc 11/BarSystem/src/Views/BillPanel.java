package Views;

import Models.Product;

import javax.swing.*;

public class BillPanel extends JPanel {
    private JLabel jLabelShowBill;
    public JFrameMain jFrame;

    public BillPanel(JFrameMain jFrame) {
        this.jFrame = jFrame;
        double bill = getBill();
        jLabelShowBill = new JLabel(
                "Your  waiter was: " + JFrameMain.currentWaiter.getUserFullName()
                        + " The bill for " + JFrameMain.currentOrder.getTableID()
                        + "is total :" + String.valueOf(bill));
        add(jLabelShowBill);
    }

    public Double getBill() {
        //Sums the total bill of all the items of one order
        double totalSum = 0.0;//Holds the sum
        for (Product product : JFrameMain.products) {
            //Iterates trough the array of products
            totalSum += product.getProductPrice();
            //Sums every product's price
        }
        return totalSum;
    }

}
