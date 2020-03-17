package gui;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainGUI {


    public static void main(String[] args) {
        //---------Calculator---------------
        //----------------------------------
//        JFrame window = new WindowGui();
//        window.setSize(800, 600);
//        window.setLocationRelativeTo(null);
//        window.setVisible(true);
        //----------------------------------
        //==================================
        //-----------ATM--------------------
        JFrame atm = new AutomatedTellerMachineJFrame();
        atm.setSize(800, 600);
        atm.setLocationRelativeTo(null);
        atm.setVisible(true);
        //----------------------------------
       // validateName("awdawdadawdadadd");
    }
//    public static boolean validateName(String nameInput) {
//        final String regex = "^[a-zA-Z]+$";
//        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
//        final Matcher matcher = pattern.matcher(nameInput);
//        while (matcher.find()) {
//            System.out.println("Full match: " + matcher.group(0));
//        }
//        return false;
//    }
}
