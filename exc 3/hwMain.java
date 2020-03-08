import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hwMain {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //=============================
        //Задача №1--------------------
        //System.out.println("Enter three numbers between 100 and 200");
        //int numberFirst = Integer.parseInt(reader.readLine());
        //int numberSecond = Integer.parseInt(reader.readLine());
        //int numberThird = Integer.parseInt(reader.readLine());
        //printNumbersFromInputToZero(numberFirst,numberSecond,numberThird);
        //-------------------------край
        //=============================
        //Задача №2--------------------
        //System.out.println("Enter three numbers between 1 and 10");
        //double numFirst = Double.parseDouble(reader.readLine());
        //double numSecond = Double.parseDouble(reader.readLine());
        //calcNumbers(numFirst,numSecond);
        //-------------------------край
        //=============================
        //Задача №3--------------------
        //double numFirst = Double.parseDouble(reader.readLine());
        //double result = returnsSumOfAllNums(numFirst);
        //System.out.println(result);
        //-------------------------край
        //=============================
        //Задача №4--------------------
        //int inputNumber = Integer.parseInt(reader.readLine());
        // primeOrNot(inputNumber);
        //-------------------------край
        //=============================
        //Задача №5--------------------
        //System.out.println("Моля изберете сума 10 лева, 20 лева, 50 лева, 100 лева");
        //double moneyWithdraw = Double.parseDouble(reader.readLine());
        //atmExercise(moneyWithdraw);
        //-------------------------край


    }

    public static void atmExercise(double sum) {

        double totalMoneyAmountClient = 5000.0;

        if (sum == 100) {
            double result = totalMoneyAmountClient - 100;
            System.out.printf("Изтеглихте %.2f лева и вашият баланс е %.2f лева. %n", sum, result);
        } else if (sum == 50) {
            double result = totalMoneyAmountClient - 50;
            System.out.printf("Изтеглихте %.2f лева и вашият баланс е %.2f лева. %n", sum, result);
        } else if (sum == 20) {
            double result = totalMoneyAmountClient - 20;
            System.out.printf("Изтеглихте %.2f лева и вашият баланс е %.2f лева. %n", sum, result);
        } else if (sum == 10) {
            double result = totalMoneyAmountClient - 10;
            System.out.printf("Изтеглихте %.2f лева и вашият баланс е %.2f лева. %n", sum, result);
        } else {
            System.out.println("Въведената сума е грешна !");
        }
    }


    public static void primeOrNot(int numberInput) {
        boolean isNotPrime = false;
        for (int i = 2; i <= numberInput / 2; ++i) {

            if (numberInput % i == 0) {
                isNotPrime = true;
                break;
            }
        }

        if (!isNotPrime)
            System.out.printf("%d is a prime number.", numberInput);
        else
            System.out.printf("%d is not a prime number.", numberInput);
    }


    public static double returnsSumOfAllNums(double inputNumber) {
        int result = 0;
        for (int i = 1; i <= inputNumber; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }

    public static void calcNumbers(double numberOne, double numberTwo) {

        if (numberOne >= 1 && numberOne <= 10 && numberTwo >= 1 && numberTwo <= 10) {
            double resultMultiplyNumbers = multiplyNumbers(numberOne, numberTwo);
            double resultDivideNumbers = divideNumbers(numberOne, numberTwo);
            double resultSumNumbers = sumNumbers(numberOne, numberTwo);
            double resultSubtractNumbers = subtractNumbers(numberOne, numberTwo);
            System.out.printf("Multiply : %f %n", resultMultiplyNumbers);
            System.out.printf("Divide : %f %n", resultDivideNumbers);
            System.out.printf("Sum : %f %n", resultSumNumbers);
            System.out.printf("Subtract : %f %n", resultSubtractNumbers);
        } else {
            System.out.println("The number is out of range !");
        }

    }

    public static double multiplyNumbers(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    public static double divideNumbers(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }

    public static double sumNumbers(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    public static double subtractNumbers(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    public static void printNumbersFromInputToZero(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= 100 && firstNumber <= 200) {
            for (int i = 0; i < firstNumber; i++) {
                if (i % secondNumber == 0 && i % thirdNumber == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("First number out of range!");
        }
    }

}
