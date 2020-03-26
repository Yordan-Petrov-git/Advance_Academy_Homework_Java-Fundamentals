package Views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TablesPanel extends JFrame {

    private JButton jButtonTable;

    public TablesPanel() {
        super("Tables");
        String buttonName = "1A";
        jButtonTable = new JButton(buttonName);
        jButtonTable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });
        add(jButtonTable);
    }


    //Tables
    //3.  tables panel
    // 1 label
    // 9 buttons
}
