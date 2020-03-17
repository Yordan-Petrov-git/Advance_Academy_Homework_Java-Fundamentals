package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutomatedTellerMachineJFrame extends JFrame {

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
        jButtonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //0 Button
                buttonKeypadZero();
            }
        });
        jButtonOne = new JButton("1");
        jButtonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //1 Button
                buttonKeypadOne();
            }
        });
        jButtonTwo = new JButton("2");
        jButtonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //2 Button
                buttonKeypadTwo();
            }
        });
        jButtonThree = new JButton("3");

        jButtonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //3 Button
                buttonKeypadThree();
            }
        });
        jButtonFour = new JButton("4");
        jButtonFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //4 Button
                buttonKeypadFour();
            }
        });
        jButtonFive = new JButton("5");
        jButtonFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //5 Button
                buttonKeypadFive();
            }
        });
        jButtonSix = new JButton("6");
        jButtonSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //6 Button
                buttonKeypadSix();
            }
        });
        jButtonSeven = new JButton("7");
        jButtonSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //7 Button
                buttonKeypadSeven();

            }
        });
        jButtonEight = new JButton("8");
        jButtonEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //8 Button
                buttonKeypadEight();

            }
        });
        jButtonNine = new JButton("9");
        jButtonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //9 Button
                buttonKeypadNine();
            }
        });
//----------------
        jButtonCancel = new JButton("Cancel");
        jButtonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        jButtonDelete = new JButton("Delete");
        jButtonDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Delete
                buttonDelete();

            }
        });
        jButtonBack = new JButton("Back ->");
        jButtonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Back button that deletes last element
                buttonBack();
            }
        });

        jButtonOk = new JButton("OK");
        jButtonOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//ok button to initiate the ATM method
                buttonOk();
            }
        });

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
//-----------   -----
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

    //Action listener for button click


    private void buttonBack() {
        int txtLength = stringBuilderMenuBox.length();

        if (txtLength > 0) {
            //If there is something in the string builder deletes only the leftmost element
            stringBuilderMenuBox.deleteCharAt(txtLength - 1);
            //Sets the new  string with deleted element  at the last index
            jTextFieldMenu.setText(stringBuilderMenuBox.toString());

        }
    }

    private void buttonDelete() {
        //deletes the string builder's content

        deleteStringBuilderContent();
        //Sets string builder content to the txtBox
        jTextFieldMenu.setText(String.valueOf(stringBuilderMenuBox));
    }

    private void buttonOk() {
        AutomatedTellerMachineLogic.atmStart();
    }

    private void buttonKeypadNine() {
        stringBuilderMenuBox.append(9);
        jTextFieldMenu.setText(stringBuilderMenuBox.toString());
    }

    private void buttonKeypadEight() {
        stringBuilderMenuBox.append(8);
        jTextFieldMenu.setText(stringBuilderMenuBox.toString());
    }

    private void buttonKeypadSeven() {
        stringBuilderMenuBox.append(7);
        jTextFieldMenu.setText(stringBuilderMenuBox.toString());
    }

    private void buttonKeypadSix() {
        stringBuilderMenuBox.append(6);
        jTextFieldMenu.setText(stringBuilderMenuBox.toString());
    }

    private void buttonKeypadFive() {
        stringBuilderMenuBox.append(5);
        jTextFieldMenu.setText(stringBuilderMenuBox.toString());
    }

    private void buttonKeypadFour() {
        stringBuilderMenuBox.append(4);
        jTextFieldMenu.setText(stringBuilderMenuBox.toString());
    }

    private void buttonKeypadThree() {
        stringBuilderMenuBox.append(3);
        jTextFieldMenu.setText(stringBuilderMenuBox.toString());
    }

    private void buttonKeypadTwo() {
        stringBuilderMenuBox.append(2);
        jTextFieldMenu.setText(stringBuilderMenuBox.toString());
    }

    private void buttonKeypadOne() {
        stringBuilderMenuBox.append(1);
        jTextFieldMenu.setText(stringBuilderMenuBox.toString());
    }

    private void buttonKeypadZero() {
        stringBuilderMenuBox.append(0);
        jTextFieldMenu.setText(stringBuilderMenuBox.toString());
    }

    public static void deleteStringBuilderContent() {

        //Method for deleting string builders content

        AutomatedTellerMachineJFrame.
                stringBuilderMenuBox.delete(
                0, stringBuilderMenuBox.length());

    }
}
