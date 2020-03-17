package gui;

import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AutomatedTellerMachineLogic {


    public static void atmStart() {
        //Method for the atm
        //Starts the atm
        int countOfTries = 3;//Counter for attempts

        while (countOfTries > 0) {  //Checker for counter

            //Initializes the client
            Client client1 = initializeClient();
            if (client1.getClientPinNumber().trim().equals("0101") && isStingBuilderFull()) {
                //Amount to widow
                double amount = Double.parseDouble(AutomatedTellerMachineJFrame.stringBuilderMenuBox.toString());
                //Sets string builder content to the txtBox
                AutomatedTellerMachineJFrame.jTextFieldMenu.setText(String.valueOf(AutomatedTellerMachineJFrame.stringBuilderMenuBox));
                //Withdraws money
                client1.withdrawMoney(amount);
                //Shows Balance aether the transaction
                client1.showBalance();

                //AutomatedTellerMachineJFrame.deleteStringBuilderContent();

                countOfTries = 3;//reset counts
                break;
            } else {//else if amount is not correct
                countOfTries--;
                AutomatedTellerMachineJFrame.jLabelOutputText.setText("Грешен пин код");
            }
            if (countOfTries == 0) {//If the card is blocked
                AutomatedTellerMachineJFrame.jLabelOutputText.setText("Картата ви е блокирана временно.");
            }
        }
    }

    private static Client initializeClient() {
        //
        String clientName = null;
        String pinNum = null;
        try {
            //Initializes the name of the client
            clientName = initializeNameOfTheClient();
            //Initializes the pin number of the client
            pinNum = initializePinOfTheClient();
            //returns the initialized client
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Клиента не е инициализиран " + e.getMessage());
            initializeClient();
        }
        return new Client(clientName, pinNum);
    }

    public static boolean isStingBuilderFull() {
        //
        if (AutomatedTellerMachineJFrame.stringBuilderMenuBox.length() == 0) {
            JOptionPane.showMessageDialog(null, "Въведете сума.");
            return false;
        }
        return true;
    }

    private static String initializePinOfTheClient() {
        //Initializes the pin number of the client
        String pin = "";
        try {//IT WORKS BUT IT IS STUPID !!!
            while (pin.isBlank()) {
                pin = JOptionPane.showInputDialog(
                        null,
                        " Enter your pin : ", "Input", 1).trim();
                if (validatePin(pin)){
                    return pin;
                }else {
                    initializePinOfTheClient();
                }
            }
        } catch (NullPointerException e) {
            initializePinOfTheClient();
        }
        return pin;
    }

    private static String initializeNameOfTheClient() {
        //
        String clientName = "";
        try {//IT WORKS BUT IT IS STUPID !!!
            while (clientName.isBlank()) {
                clientName = JOptionPane.showInputDialog(
                        null,
                        " Enter your name : ", "Input", 1).trim();
                    if (validateName(clientName)){
                    return clientName;
                }else {
                    initializeNameOfTheClient();
                }
            }
        } catch (NullPointerException e) {
            initializeNameOfTheClient();
        }
        return clientName;
    }


    public static boolean validateName(String nameInput) {
        final String regex = "^[a-zA-Z]{2,100}$";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(nameInput);
        if (matcher.find()) {
            return true;
        }
        return false;
    }
    public static boolean validatePin(String pinInput) {
        final String regex = "^\\d{4}$";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(pinInput);
        if (matcher.find()) {
            return true;
        }
        return false;
    }
}
