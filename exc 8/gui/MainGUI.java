package gui;

import javax.swing.*;

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
    }
}
