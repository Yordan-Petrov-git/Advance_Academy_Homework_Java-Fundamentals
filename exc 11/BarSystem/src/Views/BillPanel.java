package Views;

import javax.swing.*;

public class BillPanel extends JPanel {
    private JLabel jLabelShowBill;
    public JFrameMain jFrame;

    public BillPanel(JFrameMain jFrame) {
        this.jFrame = jFrame;

        jLabelShowBill = new JLabel("");
        add(jLabelShowBill);
    }

    //Shows the bill
    //4.  bill panel
    // 1 label
}
