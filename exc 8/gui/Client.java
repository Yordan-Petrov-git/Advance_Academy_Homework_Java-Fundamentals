package gui;


import javax.swing.*;

public class Client extends User {

    private double clientBalance;
    private String clientPinNumber;

    public Client(String fullName, String clientPinNumber) {
        super(fullName);
        setClientPinNumber(clientPinNumber);
        setClientBalance(10_000.00);
    }

    public double getClientBalance() {
        return this.clientBalance;
    }

    public void setClientBalance(double clientBalance) {
        this.clientBalance = clientBalance;
    }

    public String getClientPinNumber() {
        return this.clientPinNumber;
    }

    public void setClientPinNumber(String clientPinNumber) {
        this.clientPinNumber = clientPinNumber;
    }

    public void showBalance() {
        AutomatedTellerMachineJFrame.jLabelOutputText
                .setText("Вашата наличност е" + " " + this.clientBalance);
    }

    public void withdrawMoney(double withdrawAmount) {
        if (withdrawMoneyValidate(withdrawAmount)) {
            this.clientBalance -= withdrawAmount;
            AutomatedTellerMachineJFrame.jLabelOutputText
                    .setText("Вие изтеглихте:" + " " + withdrawAmount);
        }
    }

    public boolean withdrawMoneyValidate(double withdrawAmountToValidete) {
        if (this.clientBalance < withdrawAmountToValidete) {
            AutomatedTellerMachineJFrame.jLabelOutputText
                    .setText("Недостатъчна наличност по сметка.");
            JOptionPane.showMessageDialog(null, "Недостатъчна наличност по сметка.");
            return false;
        }
        if (withdrawAmountToValidete == 10.00 || withdrawAmountToValidete == 20.00 || withdrawAmountToValidete == 50.00
                || withdrawAmountToValidete == 100.00 || withdrawAmountToValidete == 200.00
                || withdrawAmountToValidete == 300.00 || withdrawAmountToValidete == 400.00) {
            return true;
        } else {
            AutomatedTellerMachineJFrame.jLabelOutputText
                    .setText("Грешна сума.");
            JOptionPane.showMessageDialog(null, "Грешна сума.");
            return false;
        }

    }


}





