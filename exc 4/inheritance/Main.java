package inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {


        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            initTeacher(reader);
            initStudent(reader);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public static void initStudent(BufferedReader reader) throws IOException {
        System.out.println("========= NEW STUDENT =========");
        System.out.println("Enter student's name");
        String studentFullName = reader.readLine();
        System.out.println("Enter student's age");
        String studentAge = reader.readLine();
        System.out.println("Enter student's email");
        String studentsEmail = reader.readLine();
        System.out.println("Enter student's phone number");
        String studentPhoneNumber = reader.readLine();
        System.out.println("Enter student's home address");
        String studentsHomeAddress = reader.readLine();
        System.out.println("Enter student's grade");
        double studentsGrade = Double.parseDouble(reader.readLine());


        Student student1 = new Student(studentFullName, studentAge,
                studentsEmail, studentPhoneNumber,
                studentsHomeAddress, studentsGrade);

        System.out.println("========= STUDENT =========");
        student1.printStudentFullInformation();
    }


    public static void initTeacher(BufferedReader reader) throws IOException {
        System.out.println("========= NEW TEACHER =========");
        System.out.println("Enter teacher's name");
        String teacherFullName = reader.readLine();
        System.out.println("Enter teacher's age");
        String teacherAge = reader.readLine();
        System.out.println("Enter teacher's email");
        String teacherEmail = reader.readLine();
        System.out.println("Enter teacher's phone number");
        String teacherPhoneNumber = reader.readLine();
        System.out.println("Enter teacher's home address");
        String teacherHomeAddress = reader.readLine();
        System.out.println("Enter teacher's salary");
        double teacherSalary = Double.parseDouble(reader.readLine());

        Teacher teacher1 = new Teacher(teacherFullName, teacherAge,
                teacherEmail, teacherPhoneNumber,
                teacherHomeAddress, teacherSalary);
        System.out.println("========= TEACHER =========");
        teacher1.printTeacherFullInformation();

    }

}
