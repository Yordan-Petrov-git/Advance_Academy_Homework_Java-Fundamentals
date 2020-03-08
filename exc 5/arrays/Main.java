package arrays;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
//==================================================
        //Задача едно

        // printsArray();

//==================================================
        //Задача две

        //printArrayWithForLoop();

//==================================================
        //Задача три
      /* try {
         Student student1 = new Student("Stamat", "Ivanov", "0890212175", "avd@gmail.com", "address 58 str", 5.00, 4.40, 3.00, 4.00, 5.00);
         Student student2 = new Student("Asen", "Vasilev", "0890234245", "bsd@gmail.com", "address 1 str", 2.00, 4.80, 3.50, 3.30, 6.00);
         Student student3 = new Student("Petar", "Georgiev", "0890245412", "csd@gmail.com", "address 15 str", 4.80, 4.50, 3.20, 2.00, 2.00);
         Student student4 = new Student("Ivailo", "Vasilev", "0890234241", "bsd@gmail.com", "address 1 str", 5.00, 5.80, 4.50, 3.30, 6.00);
         Student student5 = new Student("Boris", "Georgiev", "0890245412", "csd@gmail.com", "address 15 str", 3.80, 4.50, 3.20, 2.00, 2.00);

        students(student1,student2,student3,student4,student5);
        } catch (IllegalArgumentException e) {
               System.out.println(e.getMessage());
        }*/
//==================================================

        //Задача четири
        try {

            Worker worker1 = new Worker("Ivan", "Petrov", "0891234215", "dfsd@fdsd.com", "street 34", 1000, 50.00);
            Worker worker2 = new Worker("Petar", "Ivanov", "0894567514", "sfdvf@fma.com", "street 56d", 1200.00, 0.00);
            Student student1 = new Student("Stamat", "Ivanov", "0890212152", "avd@gmail.com", "address 58 str", 5.00, 4.40, 3.00, 4.00, 5.00);
            Student student2 = new Student("Asen", "Vasilev", "0890234248", "bsd@gmail.com", "address 1 str", 2.00, 4.80, 3.50, 3.30, 6.00);
            Student student3 = new Student("Petar", "Georgiev", "0890245411", "csd@gmail.com", "address 15 str", 4.80, 4.50, 3.20, 2.00, 2.00);
            Student student4 = new Student("Ivailo", "Vasilev", "0890234247", "bsd@gmail.com", "address 1 str", 5.00, 5.80, 4.50, 3.30, 6.00);
            Student student5 = new Student("Boris", "Georgiev", "0890245419", "csd@gmail.com", "address 15 str", 3.80, 4.50, 3.20, 2.00, 2.00);

            arrayContains(worker1, worker2, student1, student2, student3, student4, student5);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }


//==================================================

    }

    public static void arrayContains(Worker worker1, Worker worker2, Student student1, Student student2, Student student3, Student student4, Student student5) {

        //Задача четири метод

        containsArray(worker1, worker2, student1, student2, student3, student4, student5);
    }

    public static void containsArray(Worker worker1, Worker worker2, Student student1, Student student2, Student student3, Student student4, Student student5) {
        ArrayList<Object> usersArrayList = new ArrayList<>();

        usersArrayList.add(worker1);
        usersArrayList.add(student1);
        usersArrayList.add(student2);
        usersArrayList.add(student3);
        usersArrayList.add(worker2);
        usersArrayList.add(student4);
        usersArrayList.add(student5);

        for (Object object : usersArrayList) {
            if (object instanceof Worker) {
                System.out.printf("%n ==============================");
                System.out.printf("%n This object is of class worker");
                System.out.printf("%n ---------------------------- ");
                ((Worker) object).printWorkerInfo();
                System.out.printf("%n ==============================");

            } else if (object instanceof Student) {
                System.out.printf("%n This object is of class student");
                System.out.printf("%n ---------------------------- ");
                ((Student) object).printStudentInfo();
                System.out.printf("%n ==============================");
            }

        }

        System.out.printf("%n Contains" + " " + usersArrayList.contains(student4));
    }

    public static void students(Student student1, Student student2, Student student3, Student student4, Student student5) {

        //Метод към задача три

        ArrayList<Student> usersArrList = new ArrayList<>();

        usersArrList.add(student1);
        usersArrList.add(student2);
        usersArrList.add(student3);
        usersArrList.add(1, student4);
        usersArrList.add(student5);

        usersArrList.remove(3);
        usersArrList.remove(student5);


        for (Student tempStudent : usersArrList) {
            System.out.println("First Name :" + " " + tempStudent.getFirstName()
                    + "Family Name :" + " " + tempStudent.getFamilyName()
                    + "Phone Number :" + " " + tempStudent.getPhoneNumber()
                    + "Email :" + " " + tempStudent.getEmail()
                    + "Home Address :" + " " + tempStudent.getHomeAddress()
                    + "Grade Math :" + " " + tempStudent.getGradeMath()
                    + "Grade History :" + " " + tempStudent.getGradeHistory()
                    + "Grade Chemistry :" + " " + tempStudent.getGradeChemistry()
                    + "Grade Physics :" + " " + tempStudent.getGradePhysics()
                    + "Grade IT :" + " " + tempStudent.getGradeInformationTechnology());
        }

    }

    public static void printArrayWithForLoop() {

        //Метод към Задача две

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arrayList.add("Element" + i);
        }

        for (String foreachArray : arrayList) {
            System.out.println(foreachArray);
        }
    }

    public static void printsArray() {

        //Метод към задача едно

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}
