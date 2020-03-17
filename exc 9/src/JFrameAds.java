
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameAds extends JFrame {

    //-------Buttons--------------
    private JButton jButtonAddNewAds;
    private JButton jButtonShow;
    private JButton jButtonDelete;
    //---------------
    //------------TextFields-----------
    public static JTextField jTxtFldAdTitle;
    public static JTextField jTxtFldAdMake;
    public static JTextField jTxtFldAdModel;
    public static JTextField jTxtFldAdYear;
    public static JTextField jTxtFldAdPower;
    public static JTextField jTxtFldAdPrice;

    //----------------------------------
    public AdvertisementForVehicle() {
        super("Advertisement");
//----------------
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}