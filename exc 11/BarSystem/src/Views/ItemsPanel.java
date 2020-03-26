package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemsPanel extends JPanel {

    private JButton jButtonProduct;
    private JButton jButtonApply;
    private JButton jButtonEraseOrder;
    public JFrameMain jFrame;

    public ItemsPanel(JFrameMain jFrame) {
        this.jFrame = jFrame;


        String jButtonProductName = "Whiskey";
        jButtonProduct = new JButton(jButtonProductName);
        jButtonProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });
        add(jButtonProduct);


        String jButtonAcceptName = "Apply";
        jButtonApply = new JButton(jButtonAcceptName);
        jButtonApply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });
        add(jButtonApply);

        String jButtonCancelName = "Erase Order";
        jButtonEraseOrder = new JButton(jButtonCancelName);
        jButtonEraseOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });
        add(jButtonEraseOrder);

    }
    //5.  products panel
    // 14 buttons
    // 1 label
}
