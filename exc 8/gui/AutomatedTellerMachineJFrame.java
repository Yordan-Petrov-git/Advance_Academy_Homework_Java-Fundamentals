package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AutomatedTellerMachineJFrame extends JFrame implements ActionListener {



    //---------NumberPad-------------
    private JButton jButtonZero;
    private JButton jButtonOne;
    private JButton jButtonTwo;
    private JButton jButtonThree;
    private JButton jButtonFour;
    private JButton jButtonFive;
    private JButton jButtonSix;
    private JButton jButtonSeven;
    private JButton jButtonEight;
    private JButton jButtonNine;
    //----------NumberPadEnd--------
    //------------------------------
    //---------ActionPad------------
    private JButton jButtonCancel;
    private JButton jButtonDelete;
    private JButton jButtonBack;
    private JButton jButtonOk;
    //----------ActionPadEnd----------
//----------------
    public static JTextField jTextFieldMenu;

   // public static JTextArea jTextArea;

    //----------------
    public static JLabel jLabelOutputText;
    // private static JLabel jLabelOutputText;

    //----------------
    public AutomatedTellerMachineJFrame() {
        super("Automated Teller Machine ");
//----------------
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//-----------------------------
       // jTextArea = new JTextArea("");
//----------------
        jTextFieldMenu = new JTextField("                   ");
//----------------
        jLabelOutputText = new JLabel("Изберете желаната от вас сума 10 лв 20 лв 50 лв" +
                " 100 лв 200 лв 300 лв или 400лв ");
        //----------------buttonsForTheAtm---------------------------------
        jButtonZero = new JButton("0");
        jButtonOne = new JButton("1");
        jButtonTwo = new JButton("2");
        jButtonThree = new JButton("3");
        jButtonFour = new JButton("4");
        jButtonFive = new JButton("5");
        jButtonSix = new JButton("6");
        jButtonSeven = new JButton("7");
        jButtonEight = new JButton("8");
        jButtonNine = new JButton("9");
//----------------
        jButtonCancel = new JButton("Cancel");
        jButtonDelete = new JButton("Delete");
        jButtonBack = new JButton("Back ->");

        jButtonOk = new JButton("OK");

        //====================================
        jButtonZero.addActionListener(this);
        jButtonOne.addActionListener(this);
        jButtonTwo.addActionListener(this);
        jButtonThree.addActionListener(this);
        jButtonFour.addActionListener(this);
        jButtonFive.addActionListener(this);
        jButtonSix.addActionListener(this);
        jButtonSeven.addActionListener(this);
        jButtonEight.addActionListener(this);
        jButtonNine.addActionListener(this);
//----------------
        jButtonCancel.addActionListener(this);
        jButtonOk.addActionListener(this);
        jButtonDelete.addActionListener(this);
        jButtonBack.addActionListener(this);
        //====================================
        add(jButtonZero);
        add(jButtonOne);
        add(jButtonTwo);
        add(jButtonThree);
        add(jButtonFour);
        add(jButtonFive);
        add(jButtonSix);
        add(jButtonSeven);
        add(jButtonEight);
        add(jButtonNine);
//----------------
        add(jButtonCancel);
        add(jButtonOk);
        add(jButtonDelete);
        add(jButtonBack);
        //----------------
        add(jTextFieldMenu);
//----------------
        add(jLabelOutputText);
//----------------
        pack();
    }

    //Holds string for atm actions
    public static StringBuilder stringBuilderMenuBox =
            new StringBuilder();

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == jButtonZero) {
            stringBuilderMenuBox.append(0);
            jTextFieldMenu.setText(stringBuilderMenuBox.toString());


        } else if (e.getSource() == jButtonOne) {
            stringBuilderMenuBox.append(1);
            jTextFieldMenu.setText(stringBuilderMenuBox.toString());


        } else if (e.getSource() == jButtonTwo) {
            stringBuilderMenuBox.append(2);
            jTextFieldMenu.setText(stringBuilderMenuBox.toString());


        } else if (e.getSource() == jButtonThree) {
            stringBuilderMenuBox.append(3);
            jTextFieldMenu.setText(stringBuilderMenuBox.toString());


        } else if (e.getSource() == jButtonFour) {
            stringBuilderMenuBox.append(4);
            jTextFieldMenu.setText(stringBuilderMenuBox.toString());


        } else if (e.getSource() == jButtonFive) {
            stringBuilderMenuBox.append(5);
            jTextFieldMenu.setText(stringBuilderMenuBox.toString());


        } else if (e.getSource() == jButtonSix) {
            stringBuilderMenuBox.append(6);
            jTextFieldMenu.setText(stringBuilderMenuBox.toString());


        } else if (e.getSource() == jButtonSeven) {
            stringBuilderMenuBox.append(7);
            jTextFieldMenu.setText(stringBuilderMenuBox.toString());


        } else if (e.getSource() == jButtonEight) {
            //8
            stringBuilderMenuBox.append(8);
            jTextFieldMenu.setText(stringBuilderMenuBox.toString());


        } else if (e.getSource() == jButtonNine) {
            //9
            stringBuilderMenuBox.append(9);
            jTextFieldMenu.setText(stringBuilderMenuBox.toString());


        } else if (e.getSource() == jButtonCancel) {
            //cancel


        } else if (e.getSource() == jButtonOk) {
            //ok
            AutomatedTellerMachineLogic.atmStart();

        } else if (e.getSource() == jButtonDelete) {
            //Delete
            //deletes string builders content
            deleteStringBuilderContent();
            //Sets string builder content to the txtBox
            jTextFieldMenu.setText(String.valueOf(stringBuilderMenuBox));

        } else if (e.getSource() == jButtonBack) {
            //Back button
            int txtLength = stringBuilderMenuBox.length();

            if (txtLength > 0) {
                stringBuilderMenuBox.deleteCharAt(txtLength - 1);
                jTextFieldMenu.setText(stringBuilderMenuBox.toString());

            }

        }
    }


    public static void deleteStringBuilderContent() {
        AutomatedTellerMachineJFrame.
                stringBuilderMenuBox.delete(
                0, stringBuilderMenuBox.length());
    }


    static String initializePinOfTheClient() {
        //
        String pin = JOptionPane.showInputDialog(" Enter your pin : ").trim();
        while (pin.length() != 4) {
            pin = JOptionPane.showInputDialog(" Enter your pin : ").trim();
        }
        return pin;
    }

    static String initializeNameOfTheClient() {
        //
        String clientName = JOptionPane.showInputDialog(
                " Enter your name : ", "").trim();
        while (clientName.length() < 2) {
            clientName = JOptionPane.showInputDialog(
                    " Enter your name : ", "").trim();
        }
        return clientName;
    }

}
