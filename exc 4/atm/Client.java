package atm;



public class Client {


    public double clientBalance;
    public String clientFullName;
    public String clientPinNumber;

    public Client(String clientFullName, String clientPinNumber) {
        this.clientFullName = clientFullName;
        this.clientPinNumber = clientPinNumber;
        this.clientBalance = 10_000.00;
    }


    public void showBalance() {

        System.out.println("Вашата наличност е" + " " + this.clientBalance);

    }


    public void withdrawMoney(double withdrawAmount) {
        if (this.clientBalance < withdrawAmount) {
            System.out.println("Недостатъчна наличност по сметка.");
        }

        if (withdrawAmount == 10.00 || withdrawAmount == 20.00 || withdrawAmount == 50.00
                || withdrawAmount == 100.00 || withdrawAmount == 200.00
                || withdrawAmount == 300.00 || withdrawAmount == 400.00) {

            this.clientBalance -= withdrawAmount;
            System.out.println("Вие изтеглихте:" + " " + withdrawAmount);
            //  System.out.println("Оставаща сума по сметката: " + this.clientBalance);
        } else {
            System.out.println("Грешна сума.");
        }

    }
}








