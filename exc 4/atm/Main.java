package atm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countOfTries = 3;
        while (countOfTries-- > 0) {
            System.out.println("Въведете име");
            String clientName = reader.readLine();
            System.out.println("Въведете пин");
            String pinNum = reader.readLine();
            Client client1 = new Client(clientName, pinNum);


            if ("0101".equals(client1.clientPinNumber)) {
                System.out.println("Изберете желаната от вас сума 10 лв 20 лв 50 лв" +
                        " 100 лв 200 лв 300 лв 400лв ");
                double amount = Double.parseDouble(reader.readLine());

                client1.withdrawMoney(amount);

                client1.showBalance();
                break;
            } else {
                System.out.println("Грешен пин код");
            }

            if (countOfTries == 0) {
                System.out.println("Картата ви е блокирана временно.");
            }
        }


    }


}
