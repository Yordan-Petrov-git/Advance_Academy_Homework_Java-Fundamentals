package hwAdvanceAcademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
    //Пазим оценките на учениците в динамичен масив
    public static ArrayList<Double> gradesStudents = new ArrayList<>();
    //Динамичен масив от обект ученици
    public static ArrayList<Student> students = new ArrayList<>();
    //Четем от клавиатурата
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        //========================================================================================================
        //Задача 1
        arrayOfFiveElements();//Създаваме масив от 5 елемтна и принтираме средно аритметичното от числата
        //========================================================================================================
        //Задача 2 и 3
        addingStudents(); // Добавяме ученици и сортираме оценки
        searchStudentById();    //Търсим ученик по номер
        //========================================================================================================
        //Задача 4 Най-голям палиндром
        printLargestPalindromeNumber();
        //========================================================================================================
    }

    private static void printLargestPalindromeNumber() {
        //Палиндором мерод за принтиране
        System.out.print("Biggest palindrome number product of three digit numbers is :" + PalindromeNumber.larrgestPalindrome(3));
    }

    private static void searchStudentById() throws IOException {
        //Tърсене на ученици по ид номер
        System.out.println("Please enter student number");
        String searchInput = reader.readLine();//Променлива за номера на ученика
        findStudentByNumber(searchInput);//Викаме метод за търсене на ученик по номер
    }

    private static void arrayOfFiveElements() throws IOException {
        //Задача 1
        //Декларираме и инициализираме нов масив от дабъли с 5 елемента
        double[] arrayFiveNumbers = new double[5];
        System.out.println("Добвете елемтнти");
        //Итерираме през масива и добавяме 5 елемента
        for (int i = 0; i < arrayFiveNumbers.length; i++) {
            arrayFiveNumbers[i] = Double.parseDouble(reader.readLine());
        }
        //Съдържа сумата на чилата в масива
        double sumForAvg = 0;
        try {
            //Минава през дължината през масива + 1 за да хвърли грешка !!!
            for (int i = 0; i < arrayFiveNumbers.length + 1; i++) {
                //Сумата ан числата в масива за всяко завъртане на цикъла се добавя елемент
                sumForAvg += arrayFiveNumbers[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Минавате извън границата на масива");
        }
        sumForAvg = sumForAvg / arrayFiveNumbers.length;//Осреднява числата от масвива
        System.out.println(sumForAvg);//Принтираме средната стойност на числата
    }

    private static void addingStudents() throws IOException {
        //Задача 2
        //Добавяме ученици
        int addStudentNumber = addNumberOfStudents();
        //-------------------------------------------------------------
        //Цикъл за създаване на обекти от клас Student
        for (int i = 0; i < addStudentNumber; i++) {
            String validNumberOfTheStudent = numOfStudentAdd();//Добавяме номер на ученика
            //--------------------------------------
            String validNameOfTheStudent = studentNameAdd();//Добавяме име на ученика
            //--------------------------------------
            studentGradesAdd();//Добавяме оценките
            //Попълваме конструктора на нов обект от клас Ученик
            try {
                //Добавяме нов ученик
                Student newStudent = new Student(validNumberOfTheStudent, validNameOfTheStudent, gradesStudents);
                students.add(newStudent);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            }
        }
        System.out.println(students.toString());
    }

    private static void studentGradesAdd() throws IOException {
        //--Въвеждаме брой оценки на ученика---------
        System.out.println("How much grades would you like to enter for student . The minimum number is five !");
        int numberOfEnteredGrades = Integer.parseInt(reader.readLine());
        //--------------------------------------
        //Цикъл за въвеждане на оценки в динамичен масив
        if (numberOfEnteredGrades >= 5) {
            for (int j = 0; j < numberOfEnteredGrades; j++) {
                System.out.printf("%nPlease enter grade number : %d %n", j + 1);
                double addGrade = Double.parseDouble(reader.readLine());
                //Филтрираме оценката от 2.00 до 6.00 на входа в масива
                if (addGrade >= 2.00 && addGrade <= 6.00) {
                    //Добавяме оценката ако е валсидна
                    gradesStudents.add(addGrade);
                } else {
                    System.out.println("Grade is not in the valid range");
                }
            }
            //Сортираме оценките по възходящо ред чрез bubble sort оптимизираната версия
            bubbleSortingAlgorithm(gradesStudents);
            //За тест на сортировката
            //System.out.println("Sorted " + gradesStudents.toString());
        } else {
            System.out.println("Please enter at least 5 grades");
        }
    }

    private static String studentNameAdd() throws IOException {
        //--Въвеждаме Име на ученика---------
        System.out.println("Enter the name of the student");
        String validNameOfTheStudent = "";
        String nameOfTheStudent = reader.readLine();
        if (nameOfTheStudent != null && nameOfTheStudent.length() > 0) {
            validNameOfTheStudent = nameOfTheStudent;
        }
        return validNameOfTheStudent;
    }

    private static String numOfStudentAdd() throws IOException {
        //--Въвеждаме номер на ученика---------
        System.out.println("Please enter student  number");
        String validnumberOfTheStudent = "";
        String numberOfTheStudent = reader.readLine();
        //Валидираме номера на студента
        if (numberOfTheStudent != null && numberOfTheStudent.length() > 0) {
            //Ако е валиден го подаваме на констурктора на обекта
            validnumberOfTheStudent = numberOfTheStudent;
        }
        return validnumberOfTheStudent;
    }

    private static int addNumberOfStudents() throws IOException {
        //---Избираме броя на учениците които искаме да въведем-------
        System.out.println("How many new students do you like to add");
        int addNumberOfStudents = Integer.parseInt(reader.readLine());
        int addStudentNumber = 0;//Брой ученици
        if (addNumberOfStudents > 0) {//Валидация за броя на учениците
            addStudentNumber = addNumberOfStudents;
        } else {
            System.out.println("Invalid number of students");
        }
        return addStudentNumber;
    }


    static void bubbleSortingAlgorithm(ArrayList<Double> arrayToSort) {
        //Метод с който се сортира масив от интове чрез bubble sort

        //Временна променлива за запазване на елемтни при размяна
        double tempForSwap;
        //променлива за състояние на разменените числа
        boolean isNumbersSwapped = false;
        //Вземаме дължината на масива в променливата от тип инт
        double arrayLength = arrayToSort.size();
        //Итерира даденият масив елемент по елемент до дължината на масива по редове
        for (int i = 0; i < arrayLength - 1; i++) {
            //Вложен цикъл с който взимаме елементите по двойки за да ги сравним
            //Итерира през колоните на масива
            for (int j = 0; j < arrayLength - i - 1; j++) {
                //Разменя числата ако 1 рия елемтн е по голям от 2 рият чрез времена променлива
                if (arrayToSort.get(j) > arrayToSort.get(j + 1)) {
                    tempForSwap = arrayToSort.get(j);
                    arrayToSort.set(j, arrayToSort.get(j + 1));
                    arrayToSort.set(j + 1, tempForSwap);
                    //Сменяме статуса на булевата променлива ако сме разменили числата за оптимизация
                    isNumbersSwapped = true;
                }
            }
            //Ако числата не се разменят спира да работи
            if (!isNumbersSwapped)
                break;
        }
    }

    public static void findStudentByNumber(String studentNumber) {
        //Метод с който намираме ученика по номер
        boolean isPresent = false;//Променлива от тип боол показваща дали сме намерили номера на ученика
        for (Student student : students) {//Итерираме през масива с ученици

            if (student.getStudentNumber().equals(studentNumber)) {//Проверяваме ако номера на ученика съвпада с подаденият стринг в метода
                isPresent = true;//Намерили сме съвпадение и сменяме статуса на вярно
                System.out.println("Student" + student.getName() + "have average grade of :" + student.averageGrade());
                break;//Спираме търсенето
            }

            if (!isPresent) {//Ако не сме намерили съвпадение излиза съобщение
                System.out.println("No result were found");
            }
        }
    }


}
