package Views;

import Helpers.InitializeObjects;
import Models.Order;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TablesPanel extends JPanel {


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
                //JFrameMain.currentTable = tableId;

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
        //Method for when the order is found in the arrayList Orders

        switch (clickedButton) {
            //Switching between the 3 buttons from the Menu
            //1 -> new order
            //2 -> add to existing order
            //3 -> show bill
            case 1:
                //1 -> New order option : 1 order found : popup the order already exists
                JOptionPane.showMessageDialog(null
                        , "Order for the selected table already exists"
                        , "Order exists"
                        , JOptionPane.INFORMATION_MESSAGE);

                break;

            case 2:
                //2 ->Existing order option : order found : go to the panel with the items
                jFrame.showItemsPanel();

                break;

            case 3:
                //3 -> Get Bill option : order found : go to get bill panel
                jFrame.showBillPanel();

                break;

            default:
                //When no valid button is pressed
                System.out.println("No valid menu option selected");

                break;

        }
    }

    public void orderNotFound(String tableId) {
        //Method that activates if no order is found in the arrayList Orders

        switch (clickedButton) {
            //Switching between the 3 buttons from the Menu
            //1 -> new order
            //2 -> add to existing order
            //3 -> show bill
            case 1:
                InitializeObjects.initializeNewWOrder(tableId, JFrameMain.currentWaiter);
                //1 -> New order option  :  order not found : sazdavame nova pora4ka i q dobavqme v masiva s pora4ki
                //go to the next panel
                break;
            case 2:
                //2 -> Existing order option :  order not found : nqma pora4ka koqto da prodalji na tazi masa i da go popita mdali i ska da napravi nova pora4ka
                int result =
                        JOptionPane.showConfirmDialog(
                                null
                                , "No order for the current table."
                                        + "Do you want to add new order ?"
                                , "No existing orders"
                                , JOptionPane.YES_NO_OPTION);

                if (result == JOptionPane.YES_OPTION) {
                    //Add new order
                    InitializeObjects.initializeNewWOrder(tableId, JFrameMain.currentWaiter);
                    jFrame.showItemsPanel();
                }

                break;
            case 3:
                //3 -> Get Bill option :  order not found : no orders present for this table and the bill cannot be shown
                JOptionPane.showMessageDialog(
                        null
                        , "No existing order for the selected table"
                        , "Order not found"
                        , JOptionPane.INFORMATION_MESSAGE);

                break;

            default:
                //When no valid button is pressed
                System.out.println("No valid menu option selected");

                break;
        }
    }
}
