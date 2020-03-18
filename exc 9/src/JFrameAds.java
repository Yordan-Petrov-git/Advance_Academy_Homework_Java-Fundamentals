
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
    public static JTextField jTextFieldAdMake;
    public static JTextField jTextFieldAdModel;
    public static JTextField jTextFieldAdYear;
    public static JTextField jTextFieldAdPower;
    public static JTextField jTextFieldAdPrice;
    public static JTextField jTextFieldAdDescription;
    public static JTextField jTextFieldAdTitle;

    public JFrameAds() {
        super("Advert");
//----------------
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

//-----------------------------

        jTextFieldAdMake = new JTextField("Make");
        add(jTextFieldAdMake);

        jTextFieldAdModel = new JTextField("Model");
        add(jTextFieldAdModel);

        jTextFieldAdYear = new JTextField("Year");
        add(jTextFieldAdYear);

        jTextFieldAdPower = new JTextField("Power");
        add(jTextFieldAdPower);

        jTextFieldAdPrice = new JTextField("Price");
        add(jTextFieldAdPrice);

        jTextFieldAdDescription = new JTextField("Description");
        add(jTextFieldAdDescription);

        jTextFieldAdTitle = new JTextField("Title");
        add(jTextFieldAdTitle);
//----------------
        jButtonAdd = new JButton("Add");
        jButtonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Add Button
                initializeNewAdvert();
                //Shows all Adverts
                System.out.println(Logic.arrayListAds.toString());
            }
        });

        add(jButtonAdd);

        jButtonDelete = new JButton("Delete");
        jButtonDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Delete Advert Button
                String stringToRemove = JOptionPane.showInputDialog("Въведете ID на обявата която изкате да птемехнете");
                Logic.removeById(stringToRemove);
            }
        });
        add(jButtonDelete);
//----------------
        pack();
    }

    private void initializeNewAdvert() {
        //Initializes new advert object
        String make = jTextFieldAdMake.getText().trim();
        String model = jTextFieldAdModel.getText().trim();
        String year = jTextFieldAdYear.getText().trim();
        String power = jTextFieldAdPower.getText().trim();
        String price = jTextFieldAdPrice.getText().trim();
        String description = jTextFieldAdDescription.getText().trim();
        String adTitle = jTextFieldAdTitle.getText().trim();

        //
        Logic.addNewAdvert(make, model, year,
                power, price, description
                , adTitle);

    }

    public static void clearTextFields() {
        jTextFieldAdTitle.setText("         ");
        jTextFieldAdMake.setText("         ");
        jTextFieldAdModel.setText("         ");
        jTextFieldAdYear.setText("         ");
        jTextFieldAdPower.setText("         ");
        jTextFieldAdPrice.setText("         ");
        jTextFieldAdDescription.setText("         ");
    }

}
