package hwAdvanceAcademy;

import java.util.ArrayList;

public class Student {

    private String studentNumber;
    private String name;
    private ArrayList<Double> grades = new ArrayList<>();

    public Student(String studentNumber,String name, ArrayList<Double> grades) {
        setStudentNumber(studentNumber);
        setName(name);
        setGrades(grades);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getGrades() {
        return this.grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        this.grades = grades;
    }

    public String getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    @Override
    public String toString() {
        return "name:" + name +
                "grades:" + grades +
                "studentNumber:" + studentNumber;
    }

    public double averageGrade(){
        double result = 0.00;
        double gradesSum = 0.00;
        for (int i = 0; i < getGrades().size() ; i++) {
           double grades = getGrades().get(i);
           gradesSum += grades;
        }
        result = gradesSum / getGrades().size();
        return result;
    }



}

