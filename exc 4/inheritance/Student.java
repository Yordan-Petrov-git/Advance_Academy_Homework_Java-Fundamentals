package inheritance;

public class Student extends User {

    private double grade;

    public Student(String fullName, String age,
                   String email, String phoneNumber, String address, double grade) {

        super(fullName, age, email, address, phoneNumber);

        this.setGrade(grade);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 2.00 && grade <= 6.00) {
            this.grade = grade;
        } else {
            throw new IllegalArgumentException("Оценката трябва да е между 2.00 и 6.00");
        }
    }

    public void printStudentFullInformation() {
        printsUserInformation();
        printsStudentGrade();
    }

    public void printsStudentGrade() {
        System.out.println("Student's grade is : " + getGrade());
    }

}
