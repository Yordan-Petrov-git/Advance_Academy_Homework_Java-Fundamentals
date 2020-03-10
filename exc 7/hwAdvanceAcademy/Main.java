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
       // arrayOfFiveElements();
        //========================================================================================================
        //     Задача 2
        addingStudents();
        //========================================================================================================
        //Търсим ученик по номер
        searchStudentById();
        //========================================================================================================
        //     Задача 4
        largestPalindromeNumber();
        //========================================================================================================
    }

    private static void largestPalindromeNumber() {
        System.out.print("Biggest palindrome number is :" + PalindromeNumber.larrgestPalindrome(3));
    }

    private static void searchStudentById() throws IOException {
        System.out.println("Please enter student number");
        String searchInput = reader.readLine();//Променлива за номера на ученика
        findStudentByNumber(searchInput);//Викаме метод за търсене на ученик по номер
    }

    private static void arrayOfFiveElements() throws IOException {
        //Задача 1
        double[] arrayFiveNumbers = new double[5];
        System.out.println("Добвете елемтнти");
        for (int i = 0; i < arrayFiveNumbers.length; i++) {
            arrayFiveNumbers[i] = Double.parseDouble(reader.readLine());
        }
        double sumForAvg = 0;//Съдържа сумата на чилата в масива
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
        //---Избираме броя на учениците които искаме да въведем-------
        System.out.println("How many new students do you like to add");
        int addNumberOfStudents = Integer.parseInt(reader.readLine());
        //-------------------------------------------------------------
        //Цикъл за създаване на обекти от клас Student
        for (int i = 0; i < addNumberOfStudents; i++) {
            //--Въвеждаме номер на ученика---------
            System.out.println("Please enter student number");
            String numberOfTheStudent = reader.readLine();
            //--------------------------------------
            //--Въвеждаме Име на ученика---------
            System.out.println("Enter the name of the student");
            String nameOfTheStudent = reader.readLine();
            //--------------------------------------
            //--Въвеждаме брой оценки на ученика---------
            System.out.println("How much grades would you like to enter");
            int numberOfEnteredGrades = Integer.parseInt(reader.readLine());
            //--------------------------------------
            //Цикъл за въвеждане на оценки в динамичен масив
            if (numberOfEnteredGrades >= 5) {
                for (int j = 0; j < numberOfEnteredGrades; j++) {
                    System.out.printf("%nPlease enter grade number : %d %n", j + 1);
                    gradesStudents.add(Double.parseDouble(reader.readLine()));
                }
                //Сортираме оценките по възходящо ред чрез bubble sort оптимизираната версия
                bubbleSortingAlgorithm(gradesStudents);
                //За тест на сортировката
                //System.out.println("Sorted " + gradesStudents.toString());
            }
            //Попълваме конструктора на нов обект от клас Ученик
            Student newStudent = new Student(numberOfTheStudent, nameOfTheStudent, gradesStudents);
            //Добавяме нов ученик
            students.add(newStudent);
        }
        System.out.println(students.toString());
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

    static void printArray(int[] array) {
        //Метод за принтиране на масив от интове
        int arrayLength = array.length;//Вземаме дължината на масива в променливата от тип инт
        //Вземаме и принтираме всеки елемент от масива последователно
        for (int value : array) System.out.print(value + " ");
    }

}
