package arrays;

public class Worker extends User {


    private double salaryPerMonth;
    private double salaryBonus;


    public Worker(String firstName, String familyName, String phoneNumber, String email,
                  String homeAddress, double salaryPerMonth, double salaryBonus) {

        super(firstName, familyName, phoneNumber, email, homeAddress);

        setSalaryPerMonth(salaryPerMonth);
        setSalaryBonus(salaryBonus);
    }

    public Worker(String firstName, String familyName, String phoneNumber, String email, String homeAddress) {
        super(firstName, familyName, phoneNumber, email, homeAddress);
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(double salaryPerMonth) {
        if (salaryPerMonth > 0.00) {
            this.salaryPerMonth = salaryPerMonth;
        }else {
            throw new IllegalArgumentException("Моля въведете валидна месечна заплата");
        }

    }

    public double getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(double salaryBonus) {
        if (salaryBonus >= 0.00) {
            this.salaryBonus = salaryBonus;
        }else {
            throw new IllegalArgumentException("Моля въведете валиден бонус");
        }


    }

    public double annualSalary() {
        return getSalaryPerMonth() * 12 + this.salaryBonus;
    }

    public void printWorkerInfo() {
        System.out.printf("%n First Name :" + " " + "%s"
                        + "%n Family Name :" + " " + "%s"
                        + "%n Phone Number :" + " " + "%s"
                        + "%n Email :" + " " + "%s"
                        + "%n Home Address :" + " " + "%s"
                        + "%n Monthly Salary :" + " " + "%.2f"
                        + "%n Bonus :" + " " + "%.2f"
                        + "%n Annual Salary :" + " " + "%.2f"
                , this.getFirstName(), this.getFamilyName(), this.getPhoneNumber()
                , this.getEmail(), this.getHomeAddress(), this.getSalaryPerMonth()
                , this.getSalaryBonus(), this.annualSalary());
    }

}
