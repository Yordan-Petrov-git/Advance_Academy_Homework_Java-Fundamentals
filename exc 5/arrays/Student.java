package arrays;

public class Student extends User {

    private double gradeMath;
    private double gradeHistory;
    private double gradeChemistry;
    private double gradePhysics;
    private double gradeInformationTechnology;


    public Student(String firstName, String familyName, String phoneNumber, String email,
                   String homeAddress, double gradeMath, double gradeHistory, double gradeChemistry,
                   double gradePhysics, double gradeInformationTechnology) {

        super(firstName, familyName, phoneNumber, email, homeAddress);

        setGradeMath(gradeMath);
        setGradeHistory(gradeHistory);
        setGradeChemistry(gradeChemistry);
        setGradePhysics(gradePhysics);
        setGradeInformationTechnology(gradeInformationTechnology);

    }

    public Student(String firstName, String familyName, String phoneNumber, String email, String homeAddress) {
        super(firstName, familyName, phoneNumber, email, homeAddress);
    }


    public double getGradeMath() {
        return gradeMath;
    }

    public void setGradeMath(double gradeMath) {
        if (gradeMath >= 2.00 && gradeMath <= 6.00) {
            this.gradeMath = gradeMath;
        } else {
            throw new IllegalArgumentException("Моля въведете оценка от 2.00 до 6.00");
        }
    }

    public double getGradeHistory() {
        return gradeHistory;
    }

    public void setGradeHistory(double gradeHistory) {
        if (gradeHistory >= 2.00 && gradeHistory <= 6.00) {
            this.gradeHistory = gradeHistory;
        } else {
            throw new IllegalArgumentException("Моля въведете оценка от 2.00 до 6.00");
        }
    }

    public double getGradeChemistry() {
        return gradeChemistry;
    }

    public void setGradeChemistry(double gradeChemistry) {
        if (gradeChemistry >= 2.00 && gradeChemistry <= 6.00) {
            this.gradeChemistry = gradeChemistry;
        } else {
            throw new IllegalArgumentException("Моля въведете оценка от 2.00 до 6.00");
        }
    }

    public double getGradePhysics() {
        return gradePhysics;
    }

    public void setGradePhysics(double gradePhysics) {
        if (gradePhysics >= 2.00 && gradePhysics <= 6.00) {
            this.gradePhysics = gradePhysics;
        } else {
            throw new IllegalArgumentException("Моля въведете оценка от 2.00 до 6.00");
        }
    }

    public double getGradeInformationTechnology() {
        return gradeInformationTechnology;
    }

    public void setGradeInformationTechnology(double gradeInformationTechnology) {
        if (gradeInformationTechnology >= 2.00 && gradeInformationTechnology <= 6.00) {
            this.gradeInformationTechnology = gradeInformationTechnology;
        } else {
            throw new IllegalArgumentException("Моля въведете оценка от 2.00 до 6.00");
        }
    }

    public double returnsAverageGradeOfStudent() {
        return (this.getGradeMath() + this.getGradeHistory() + this.getGradeChemistry() +
                this.getGradePhysics() + this.getGradeInformationTechnology()) / 5.00;
    }


    public void printStudentInfo() {

        System.out.printf("%n First Name :" + " " + "%s"
                        + "%n Family Name :" + " " + "%s"
                        + "%n Phone Number :" + " " + "%s"
                        + "%n Email :" + " " + "%s"
                        + "%n Home Address :" + " " + "%s"
                        + "%n Grade Math :" + " " + "%.2f"
                        + "%n Grade History :" + " " + "%.2f"
                        + "%n Grade Chemistry :" + " " + "%.2f"
                        + "%n Grade Physics :" + " " + "%.2f"
                        + "%n Grade IT :" + " " + "%.2f"
                        + "%n Average grade :" + " " + "%.2f"
                , this.getFirstName(), this.getFamilyName(), this.getPhoneNumber()
                , this.getEmail(), this.getHomeAddress(), this.getGradeMath()
                , this.getGradeHistory(), this.getGradeChemistry(), this.getGradePhysics()
                , this.getGradeInformationTechnology(), this.returnsAverageGradeOfStudent());
    }

}
