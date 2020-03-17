
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameAds extends JFrame {

    //----------------------
    private JButton jButtonAdd;
    private JButton jButtonDelete;
    //------------------------------

    //----------------
    public static JTextField jTextFieldAdTitle;
    public static JTextField jTextFieldAdMake;
    public static JTextField jTextFieldAdModel;
    public static JTextField jTextFieldAdYear;
    public static JTextField jTextFieldAdPower;
    public static JTextField jTextFieldAdPrice;
    public static JTextField jTextFieldAdDescription;

    public JFrameAds() {
        super("Advert");
//----------------
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//-----------------------------

        jTextFieldAdTitle = new JTextField("     ");
        jTextFieldAdMake = new JTextField("     ");
        jTextFieldAdModel = new JTextField("     ");
        jTextFieldAdYear = new JTextField("     ");
        jTextFieldAdPower = new JTextField("     ");
        jTextFieldAdPrice = new JTextField("     ");
        jTextFieldAdDescription = new JTextField("     ");
//----------------

        jButtonAdd = new JButton("0");
        jButtonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Add Button

            }
        });
        jButtonDelete = new JButton("1");
        jButtonDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Delete Advert Button

            }
        });
//----------------

        //====================================
        add(jButtonAdd);
        add(jButtonDelete);


//----------------
        pack();
    }

}
