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
        //Initializes the name of the client
        String clientName = AutomatedTellerMachineJFrame.initializeNameOfTheClient();
        //Initializes the pin number of the client
        String pinNum = AutomatedTellerMachineJFrame.initializePinOfTheClient();
        //returns the initialized client
        return new Client(clientName, pinNum);
    }

    public static boolean isStingBuilderFull() {
        if (AutomatedTellerMachineJFrame.stringBuilderMenuBox.length() == 0) {
            JOptionPane.showMessageDialog(null, "Въведете сума.");
        return false;
        }
        return true;
    }


}
