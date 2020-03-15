package gui;

import javax.swing.*;

public class AutomatedTellerMachineLogic {


    public static void atmStart() {
        //Method for the atm
        //Starts the atm
        int countOfTries = 3;//Counter for attempts

        while (countOfTries > 0) {  //Checker for counter

            //Initializes the client
            Client client1 = initializeClient();
            if (client1.getClientPinNumber().equals("0101") && isStingBuilderFull()) {
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
        String clientName = null;
        String pinNum = null;
        try {
            //Initializes the name of the client
            clientName = initializeNameOfTheClient();
            //Initializes the pin number of the client
            pinNum = initializePinOfTheClient();
            //returns the initialized client
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Клиента не е инициализиран "+ e.getMessage());
            initializeClient();
        }
        return new Client(clientName, pinNum);
    }

    public static boolean isStingBuilderFull() {
        if (AutomatedTellerMachineJFrame.stringBuilderMenuBox.length() == 0) {
            JOptionPane.showMessageDialog(null, "Въведете сума.");
        return false;
        }
        return true;
    }

    static String initializePinOfTheClient() {
        //
        String pin = "";
        while (pin.length() != 4  && pin.isBlank()) {
            pin = JOptionPane.showInputDialog(
                    null,
                    " Enter your pin : ","Input",1).trim();

        }
        return pin;
    }

    static String initializeNameOfTheClient() {
        //
        String clientName = "";
        while (clientName.length() < 2 && clientName.isBlank()) {
            clientName = JOptionPane.showInputDialog(
                    null,
                    " Enter your name : ", "Input",1).trim();
        }
        return clientName;
    }
}
