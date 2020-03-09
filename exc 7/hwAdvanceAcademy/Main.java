package hwAdvanceAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

    public static ArrayList<Double> gradesStudents = new ArrayList<>();
    public static ArrayList<Student> students = new ArrayList<Student>();

    public static void main(String[] args) throws IOException {


//===============================================================
//zad 1
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        double [] arrayFiveNumbers = new double [5] ;
//        for (int i = 0; i < arrayFiveNumbers.length ; i++) {
//                arrayFiveNumbers[i] = Double.parseDouble(reader.readLine());
//        }
//        double sumForAvg = 0 ;
//        try {
//            for (int i = 0; i < arrayFiveNumbers.length + 1 ; i++) {
//                sumForAvg += arrayFiveNumbers[i];
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Минавате извън границата на масива");
//        }
//        sumForAvg = sumForAvg/arrayFiveNumbers.length;
//        System.out.println(sumForAvg);
//==========================================================
        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // int arrayLength = Integer.parseInt(reader.readLine());

//        int[] array = new int  [arrayLength] ;
//        for (int i = 0; i <array.length ; i++) {
//            array[i] = Integer.parseInt(reader.readLine());
//        }
//
//        bubbleSortingAlgorithm(array);
//        System.out.println("Sorted array: ");
//        printArray(array);

        //==============================================================
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many new students do you like to add");
        int addNumberOfStudents = Integer.parseInt(reader.readLine());
        for (int i = 0; i < addNumberOfStudents; i++) {
            System.out.println("Please enter student number");
            String numberOfTheStudent = reader.readLine();
            System.out.println("Enter the name of the student");
            String nameOfTheStudent = reader.readLine();
            System.out.println("How much grades would you like to enter");
            int numberOfEnteredGrades = Integer.parseInt(reader.readLine());
            if (numberOfEnteredGrades >= 5) {
                for (int j = 0; j < numberOfEnteredGrades; j++) {
                    System.out.printf("%nPlease enter grade number : %d %n", j + 1);
                    gradesStudents.add(Double.parseDouble(reader.readLine()));
                }
                bubbleSortingAlgorithm(gradesStudents);
                System.out.println("Sorted "+gradesStudents.toString());
            }
            if (numberOfEnteredGrades < 5) {
                System.out.println("Pleases enter 5 or moore grades!");//fix it
            }
            Student newStudent = new Student(numberOfTheStudent, nameOfTheStudent, gradesStudents);
            students.add(newStudent);
        }

        System.out.println(students.toString());

        System.out.println("Please enter student number");
        String searchInput = reader.readLine();
        findStudentByNumber(searchInput);

        //=======================

        int n = 3;
        System.out.print(PalindromeNumber.larrgestPalindrome(n));

    }
    static void bubbleSortingAlgorithm(ArrayList<Double> arrayToSort) {
        //Метод с който се сортира масив от интове
        double tempForSwap;//Временна променлива за запазване на
        boolean isNumbersSwapped = false;//променлива за
        double arrayLength = arrayToSort.size();//Вземаме дължината на масива в променливата от тип инт
        for (int i = 0; i < arrayLength - 1; i++) {//обхождаме даденият масив елемент по елемент
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (arrayToSort.get(j) > arrayToSort.get(j + 1)) {
                    tempForSwap = arrayToSort.get(j);
                    arrayToSort.set(j, arrayToSort.get(j + 1));
                    arrayToSort.set(j + 1, tempForSwap);
                    isNumbersSwapped = true;
                }
            }
            if (!isNumbersSwapped)
                break;
        }
    }

    public static void findStudentByNumber(String studentNumber) {


        boolean isPresent = false;
        for (Student student : students) {

            if (student.getStudentNumber().equals(studentNumber)) {
                isPresent = true;
                System.out.println("Student" + student.getName() + "have average grade of :" + student.averageGrade());
                break;
            }

            if (!isPresent) {
                System.out.println("No result were found");
            }
        }
    }

    static void printArray(int[] array) {
        //Метод за принтиране на масив от интове
        int arrayLength = array.length;//Вземаме дължината на масива в променливата от тип инт
        //Вземаме и принтираме всеки елемент от масива последователно
        for (int value : array) System.out.print(value + " ");
    }

}
