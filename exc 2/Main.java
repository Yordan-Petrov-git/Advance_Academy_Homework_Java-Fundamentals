public class Main {
    public static void main(String[] args) {
        //loanChecker("", 0, 0, 0, 0);
        //loanChecker("", 1, 0, 0, 0);
        //loanChecker("", 0, 1, 0, 0);
        //loanChecker("", 0, 0, 1, 0);
        //loanChecker("", 0, 0, 0, 1);
        //loanChecker("name", 17, 30000, 24, 1200);
        //loanChecker("name1", 17, 30000, 12, 5001);
        //loanChecker("name", 18, 2555, 13, 2000);
        //loanChecker("name", 18, 600, 13, 2000);
        // loanChecker("name", 18, 600, 12, 2000);
        //loanChecker("name", 18, 1, 12, 2000);
        //loanChecker("name", 18, 1, 13, 2000);
        //loanChecker("name", 18, 1000, 13, 2000);
        //loanChecker("name", 18, 1000, 12, 2000);
        //loanChecker("name", 18, 999, 13, 2000);
        //loanChecker("name", 18, 999, 12, 2000);
        //loanChecker("name", 18, 1001, 12, 2000);
        //loanChecker("name", 18, 30000, 12, 2000);
        //loanChecker("name", 18, 50000, 12, 2000);
        //loanChecker("name", 18, 30000, 21, 2000);
        //loanChecker("name", 18, 30000, 21, 5000);
        //loanChecker("name", 18, 30000, 21, 5001);
        //loanChecker("name", 18, 100000, 21, 5000);
        //loanChecker("name", 18, 100000, 21, 5001);
        //loanChecker("name", 18, 50000, 21, 5001);

    }

    public static void loanChecker(String nameClient, int ageClient, double loanAmount, double loanPeriodMonths, double salaryClient) {
        //Validates user input name
        //-----------------------------------
        boolean isClientInputValid = false;

        if (nameClient.equals("")) {
            System.out.println("Въведете име !");
            isClientInputValid = false;
        }
        if (ageClient <= 0) {
            System.out.println("Въведете години !");
            isClientInputValid = false;
        }
        if (loanAmount <= 0) {
            System.out.println("Въведете сума !");
            isClientInputValid = false;
        }
        if (loanPeriodMonths <= 0) {
            System.out.println("Въведете месеци !");
            isClientInputValid = false;
        }
        if (salaryClient <= 0) {
            System.out.println("Въведете месечна заплата !");
            isClientInputValid = false;
        }

        if (!"".toLowerCase().split("//s+").equals(nameClient) && ageClient > 0 && loanAmount > 0 && loanPeriodMonths > 0 && salaryClient > 0) {
            isClientInputValid = true;
        }

        //----------------------------------------Validator ends

        boolean isClientLegalAge = false;//Checks if the client is of legal age


        if (ageClient < 18) {//Checks age
            isClientLegalAge = false;
            System.out.println("Трябва да имате навършени 18 !");

        } else if (isClientInputValid = true) {//Programs logic HERE !!!

            isClientLegalAge = true;

            if (isClientLegalAge = true) {//Final input validity check !!!


                if (loanAmount >= 1000 && loanAmount <= 50000) {//Credit range 1 000-50 000

                    double monthlyInstallment = loanAmount / loanPeriodMonths;
                    System.out.printf("Вашата месечна вноска е :  %f   %n", monthlyInstallment);

                } else if (loanAmount < 1000 && loanPeriodMonths <= 12) {// loan amount below 1000 bgn and loan period below or 12 months.

                    System.out.println("Не може да изтеглите съответната сума за такъв период !");

                } else if (loanAmount < 1000 && loanPeriodMonths > 12) {// loan amount below 1000 bgn and loan period above 12 months.

                    double monthlyInstallment = loanAmount / loanPeriodMonths;
                    System.out.printf("Вашата месечна вноска е :  %f ", monthlyInstallment);

                } else {
                    System.out.println("Не може да изтеглите толкова голям потребителски кредит !");
                }


                if (loanAmount > 50000 && salaryClient < 2000) {

                    if (salaryClient > 2000) {

                        double calculateInstallment = loanAmount / loanPeriodMonths;

                        System.out.printf("Вашата месечна вноска е : %f  %n", calculateInstallment);

                    }


                }
                if (loanAmount < 100000 && salaryClient > 5000) {

                    System.out.println("С такъв доход можем да ви предложим 100 000 лева !");

                }

            }

        } else {

            isClientLegalAge = true;
            System.out.println("Трябва да имате навършени 18 !");

        }
    }

}
