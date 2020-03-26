package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TablesPanel extends JPanel {

    private JButton jButtonTable;
    public JFrameMain jFrame;

    public TablesPanel(JFrameMain jFrame) {
        this.jFrame = jFrame;

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
