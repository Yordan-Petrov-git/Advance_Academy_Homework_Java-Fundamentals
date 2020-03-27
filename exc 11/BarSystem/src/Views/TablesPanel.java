package Views;

import Helpers.InitializeObjects;
import Models.Order;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TablesPanel extends JPanel {

    //private ArrayList<JButton> buttons;
    private JButton jButtonTable;
    public JFrameMain jFrame;
    public int clickedButton;

    public TablesPanel(JFrameMain jFrame) {
        this.jFrame = jFrame;

        int tableCount = 5;
        for (int i = 0; i <= tableCount; i++) {
            add(button("Table " + i));
        }

    }

    private JButton button(String buttonName) {
        jButtonTable = new JButton(buttonName);
        jButtonTable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
                String tableId = ((JButton) e.getSource()).getText();
                JFrameMain.currentTable = tableId;

                // System.out.println(currentButton);

                boolean isOrderFound = false;
                for (Order order : JFrameMain.orders) {
                    if (order.getTableID().equals(tableId)) {
                        JFrameMain.currentOrder = order;
                        System.out.println("We have order  ");
                        isOrderFound = true;
                        orderFound();
                        break;
                    }
                }
                if (!isOrderFound) {
                    orderNotFound(tableId);
                }

            }
        });
        return jButtonTable;
    }

    public void orderFound() {


        switch (clickedButton) {
            case 1:
                System.out.println("New order");
                JOptionPane.showMessageDialog(null, "Order for the selected table already exists", "Order exists", JOptionPane.INFORMATION_MESSAGE);
                //new order 1 popup ima pora4ka ve4e
                break;
            case 2:
                // System.out.println("Add to existing order");
                //exisitng 2 order minava na sledva6tiq ekran s prodiktite
                jFrame.showItemsPanel();
                break;
            case 3:
                System.out.println("Show bill");
                //get bill 3 mina va na ekrana bet bill i smqta smetnkata za dadena masa
                jFrame.showBillPanel();
                break;
            default:
                System.out.println("No valid menu option selected");
                break;

        }
    }

    public void orderNotFound(String tableId) {


        System.out.println("No existing order");
        switch (clickedButton) {
            case 1:
                System.out.println("New order");
                InitializeObjects.initializeNewWOrder(tableId, JFrameMain.currentWaiter);
                //new order 1 sazdavame nova pora4ka i q dobavqme v masiva s pora4ki
                //minavame na sledva6tiq ekran
                break;
            case 2:
                System.out.println("Add to existing order");
                //exisitng order 2 nqma pora4ka koqto da prodalji na tazi masa i da go popita mdali i ska da napravi nova pora4ka
                int result = JOptionPane.showConfirmDialog(null, "No order for the current table." +
                        "Do you want to add new order ?", "No existing orders", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    //Add new order
                    InitializeObjects.initializeNewWOrder(tableId, JFrameMain.currentWaiter);
                    jFrame.showItemsPanel();
                }

                break;
            case 3:
                System.out.println("Show bill");
                JOptionPane.showMessageDialog(null, "No existing order for the selected table", "Order not found", JOptionPane.INFORMATION_MESSAGE);
                //get bill popup 3 nqma pora4ka na tazi masa i ne moje da se pokaje smetkata

                break;
            default:
                System.out.println("No valid menu option selected");
                break;

        }
    }
}
