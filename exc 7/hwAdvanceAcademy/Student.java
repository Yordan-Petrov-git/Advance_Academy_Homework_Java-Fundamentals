package hwAdvanceAcademy;

import java.util.ArrayList;

public class Student {

    private String studentNumber;
    private String name;
    private ArrayList<Double> grades = new ArrayList<>();

    public Student(String studentNumber, String name, ArrayList<Double> grades) {

        setStudentNumber(studentNumber);
        setName(name);
        setGrades(grades);
    }


    public String getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(String studentNumber) {

        if (studentNumber != null && studentNumber.length() > 0) {
            this.studentNumber = studentNumber;
        } else {
            throw new IllegalArgumentException("Please enter valid student number longer than 1 character");
        }

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {

        if (name.matches("^([A-Z][a-zA-Z]{2,25}\\s{0,25})+([A-Z][a-zA-Z]{2,25}\\s{0,25})?+([A-Z][a-zA-Z]{2,25})?$")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Please enter a valid name or at least 3 symbols and one Name");
        }
    }

    public ArrayList<Double> getGrades() {
        return this.grades;
    }

    public void setGrades(ArrayList<Double> grades) {
        if (grades != null && grades.size() >= 5) {
            this.grades = grades;
        } else {
            throw new IllegalArgumentException("Please enter at least 5 grades");
        }

    }


    @Override
    public String toString() {
        return "name:" + name +
                "grades:" + grades +
                "studentNumber:" + studentNumber;
    }

    public double averageGrade() {
        //Метод за изчисляване на средната оценка
        double result = 0.00; //Променлива за запазване на резултата от осредняването
        double gradesSum = 0.00;//Проманелива за запазване на суамта на оценките
        for (int i = 0; i < getGrades().size(); i++) {//Обхождаме динамичният масива съдържащ оценки
            double grades = getGrades().get(i);//Вземаме всяка оценка за всяко завъртане през цикъла
            gradesSum += grades;//Добавяме суамта от оценките в проемнлива
        }
        result = gradesSum / getGrades().size();//Разделяме броят на оценките на тяхната сума
        return result;//Връщаме резултат
    }

}

