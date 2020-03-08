package inheritance;

public class Teacher extends User {

    private double salary;

    public Teacher(String fullName, String age,
                   String email, String phoneNumber, String address, double salary) {

        super(fullName, age, email, address, phoneNumber);

        this.setSalary(salary);
    }

    //=============GET================
    public double getSalary() {
        return salary;
    }

    //=============SET================
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Заплатата трябва да е над 0 лева.");
        }
    }

    //=============Methods======================
    public double calculateTeachersAnnualSalary() {
        return this.salary * 12;
    }

    public void printTeacherSalary() {
        System.out.println("Monthly salary :" + " " + getSalary());
    }

    public void printTeacherFullInformation() {
        printsUserInformation();
        printTeacherSalary();
        System.out.println("Annual salary :" + " " + calculateTeachersAnnualSalary());
    }
}
