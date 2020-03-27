package Views;

import Helpers.InitializeObjects;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemsPanel extends JPanel {

    private JButton jButtonProduct;
    private JButton jButtonApply;
    private JButton jButtonEraseOrder;
    public JFrameMain jFrame;

    public ItemsPanel(JFrameMain jFrame) {
        this.jFrame = jFrame;

        add(buttonItem("Whiskey 50ml", "50 ml", 7.00));
        add(buttonItem("Whiskey 100ml", "100 ml", 10.00));
        add(buttonItem("Whiskey 200ml", "200 ml", 15.00));
        add(buttonItem("Vodka 50ml", "50 ml", 4.00));
        add(buttonItem("Vodka 100ml", "100 ml", 6.00));


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

    private JButton buttonItem(String buttonName, String quantity, Double price) {
        //Initializes item button
        jButtonProduct = new JButton(buttonName);
        jButtonProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Gets pressed button text
                String currentButton = ((JButton) e.getSource()).getText();
                // Initializes new product
                InitializeObjects.initializeNewWProduct(currentButton, quantity, price);
            }
        });
        return jButtonProduct;
    }
}
