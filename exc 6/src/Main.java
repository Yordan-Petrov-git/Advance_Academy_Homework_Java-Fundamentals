
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static Joke[] jokerArray = new Joke[5];//Статичен масив за запазване на обекти от тип Joke

    public static ArrayList<Joke> arrayListJoke = new ArrayList<>();//Динамичен масив за запазване на обекти от тип Joke

    public static void main(String[] args) throws IOException {

//=======================================================

        //Задача 1

        //double[] holdsTotalPrice = {5.00, 6.00, 15.59, 9.50};//Масив със цените на всички продукти

        //double moneyGiven = 36.09;//Парите дадени от клиента равни на сумата от масива
        //double moneyGiven = 2.09;//Парите дадени от клиента по-малко от суамта в масива
        //double moneyGiven = 100.09;//Парите дадени от клиента повече от сумата в масива

        //calculateChange(holdsTotalPrice, moneyGiven);//Извикваме метод който смята колко пари е нужно да върнем

//=======================================================

        //Задача 2

        //Изчисляваме процент от число

        //calculateTipAmount(200,10);

//=======================================================

        //Задача 3

        //Филтрираме и премахваме гласните букви от даден стринг

        // socialMediaFilter("Hello, can you translate this message?");//вход при валиден стринг
        // socialMediaFilter("");//вход при празен текст

//=======================================================

        //Задача 4

        //Метод, който да вдига на 2-ра степен всички четни числа от 0 до 100.

        //printEvenNumbersFromZeroToHundredToThePowerOfTwo();

//=======================================================

         //Задача 5

//        String resultOfMethodReturn = returnsStringToThePowerOfTwo(245);//Викаме метод с параметър число (245) и очакваме да вземе всяко число поотделно и ги повдига на степен 2 след това да конкатенира всички числа в 1
//        System.out.println(resultOfMethodReturn);//Принтира съдържанието на стринга съдържащ върнатият резултат от метода

//        int resultStringToInt = Integer.parseInt(resultOfMethodReturn);//Превръщаме стринга в инт
//        System.out.println(resultStringToInt);//Принтираме резултата

//===================================================================================================================
// -------Допълнителни задачи----------------------------------------------------------------------------------------
//===================================================================================================================

        //Принтира числата от 1000 до 0 (низходящ ред)

        //numbersFromThousandToZero();

// =======================================================

        //Принтира числата от 0 до 1000 като замества всяко 10 то X

        //numbersFromZeroToThousandWithX();

// =======================================================

        //Принтира само нечетните числата от 0 до 1000

        //numbersFromZeroToThousandUnevenOnly();

// =======================================================

        //Принтира само четните числата от 0 до 1000

        //numbersFromThousandToZeroEvenOnlyOnKeyPress();

// =======================================================

        //Създаване на обекти от тип Joker чрез конструктор

        Joke funnyJokeOne = new Joke("TheJoker", "jokes@gmail.com",
                "Ivan", "Ivanov", "0899999991",
                "a1b2c3",
                "Algorithm. Word used by programmers when they don't want to explain what they did.");

        Joke funnyJokeTwo = new Joke("Joker", "asd@gmail.com",
                "John", "Wick", "0899999995",
                "b1b2c3",
                "How does NASA organise a party? They planet.");

        Joke funnyJokeThree = new Joke("Joker545", "dsa@gmail.com",
                "Stamat", "Stamatov", "0899999993",
                "c1b2c3",
                "Did you hear about the actor who fell through the floorboards? He was just going through a stage.");

        Joke funnyJokeFour = new Joke("Joker66", "wsa@gmail.com",
                "Petar", "Georgiev", "0899999994",
                "d1b2c3",
                "Sometimes I tuck my knees into my chest and lean forward. That’s just how I roll.");

        Joke funnyJokeFive = new Joke("Joker99", "dsaws@gmail.com",
                "Asen", "Petrov", "0899999995",
                "e1b2c3",
                "A soldier survived mustard gas in battle, and then pepper spray by the police. He's now a seasoned veteran.");

        //----добавяне на инициализираните нови обекти в динамичен масив---------
        jokerArray[0] = funnyJokeOne;
        jokerArray[1] = funnyJokeTwo;
        jokerArray[2] = funnyJokeThree;
        jokerArray[3] = funnyJokeFour;
        jokerArray[4] = funnyJokeFive;
        //-----край на добавянето-------------

//===========================================================

        //Метод който минава през масива с Joke елементи и принтира toString()

//        for (Joke joke : jokerArray) {//Итерираме през всеки елемент от масива jokerArray
//            System.out.println(joke.toString());//Принтираме toString()
//        }

// =======================================================

        //Търсене на username и принтиране на шегата

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//Четем вход от калвиатурата през конзолата
//        System.out.println("Изберете username");
//        String usernameSelectInput = reader.readLine();//Четем входа от клавиатурата и го записваме в стрингова променлива
//        selectUserAndPrintTheJoke(usernameSelectInput);//Викаме метод

        //=======================================================

        //Изтриване на елемент

        //------------добавяне на обекти в динамичният масив------
        arrayListJoke.add(funnyJokeOne);
        arrayListJoke.add(funnyJokeTwo);
        arrayListJoke.add(funnyJokeThree);
        arrayListJoke.add(funnyJokeFour);
        arrayListJoke.add(funnyJokeFive);
        //------------------------------------

//        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));//Четем вход от калвиатурата през конзолата
//        System.out.println("Изберете Joke ID което желаете да премахнете");
//        String jokeIdToRemove = read.readLine();//Премахва даденият елемент
//        removeSelectedJoke(jokeIdToRemove);//Премахваме обект от масива със съвпадащо ID

        //=======================================================

        //Добавя нова инстанция от обекта Joke с елементи

//        addNewJoke("jok", "asdad@gmail.com",
//                "Petar", "Petkov", "0899992395",
//                "f1b2c3", " joke HAHAHA Funny");

        //=======================================================

        //Викаме метод търсещ всички елементи на Joke обектите заредени в динамичният масив

        //searchInText("and");

        //=======================================================
    }

    public static void searchInText(String searchText) {

        //Метод търсещ всички елементи на Joke обектите заредени в динамичният масив

        for (Joke joke : arrayListJoke) {

            if (joke.getJokeText().contains(searchText)) {

                System.out.println(joke);//Принтира обектите съдържаши searchText в JokeText
            }

        }
    }

    public static void addNewJoke(String username, String email, String firstName, String lastName,
                                  String phoneNumber, String jokeID, String jokeText) {

        Joke nameOfTheNewJoke = new Joke(username, email, firstName, lastName, phoneNumber, jokeID, jokeText);

        arrayListJoke.add(nameOfTheNewJoke);

        System.out.println("\nУспешно се добави " + nameOfTheNewJoke);

    }

    public static void removeSelectedJoke(String selectedJokeIdToRemove) {
        //Метод който премахва даденият елемент

        boolean idMatches = false;//Променлва която използваме за да намерим дали имаме съвпадение с елемент от масива
        if (selectedJokeIdToRemove.length() > 0) {//Филтрира стринг с 0 елемента
            for (int i = 0; i < arrayListJoke.size(); i++) {//Итерира през всички елементи на масива
                if (arrayListJoke.get(i).getJokeID().equals(selectedJokeIdToRemove)) {//Ако елемента от арея е на определен индекс съвпада с търсения пропуска надолу
                    System.out.println("Изтрихте елемента ID :" + arrayListJoke.get(i).getJokeID());//Принтира съобщене
                    arrayListJoke.remove(i);//Премахва елемента на индекс I
                    idMatches = true;//Когато е намерено съвпадение
                    break;//Прекъсва цикъла след като изтрие елемента
                }
            }
            if (!idMatches) {//Влза тук когато резултата не е намерен в масива
                System.out.println("Няма намерен резултат");
            }
        } else {//Влиза тук когато входа е празен Стринг
            System.out.println("Невалидна информация");
        }

    }


    public static void selectUserAndPrintTheJoke(String userInput) {
//Търсим в масива jokerArray по User и принтираме шегата

        boolean isUsernameFound = false;//Променлива индикираша дали е намерено името на потребителя
        String joke = "";//Инициализирме стринг за


        for (Joke input : jokerArray) {//Итерираме през масива

            if (input.getUsername().equals(userInput)) {//когато Username на обекта е равно с Стринга ,който търсим подаден в метода

                joke = input.getJokeText();//Вземаме съдържанието на JokeText
                isUsernameFound = true;//Сетваме индикиращата намерен резултат променлива
            }
        }
        if (isUsernameFound) {//Ако има резултат принтираме съдържанието на елемента

            System.out.println(joke);//Съобшение ако има резултат от търсенето
        } else {//В противен случай съобщение за не намерен потребител

            System.out.printf("%n User not found");//Съобшение ако няма резултат от търсенето
        }


    }

    public static String returnsStringToThePowerOfTwo(int number) {

        //Задача 5

        String intToString = Integer.toString(number);//Кастваме инт към Стринг

        char[] chars = intToString.toCharArray();//Превръщаме инт в масив от chars

        ArrayList<Integer> list = new ArrayList<>();//Създаваме нов динамичен масив от интове

        String stringJoin = "";//Инициализираме стринг който да държи резултата

        for (char ch : chars) {//Итерираме през масива от символи

            int positionNumber = Integer.parseInt(String.valueOf(ch));

            double resultToPow = Math.pow(positionNumber, 2);//Повдигаме на 2 ра степен
            int dblToInt = (int) resultToPow;//Преобразуваме в инт

            list.add(dblToInt);//добавяме към масива

            stringJoin = list.toString().replaceAll("\\[|\\]|,\\s", "");//Заместваме празното пространсвто и скобите по регулярен израз с преазно пространство

        }
        return stringJoin;//Връщаме стринга съдържащ резултата
    }

    public static void numbersFromThousandToZeroEvenOnlyOnKeyPress() throws IOException {
        //Принтира  четните числа от 0 до 1000

        for (int i = 0; i <= 1000; i++) {

            if (i % 2 == 0) {

                System.out.println(i);
            }
        }

    }

    public static void numbersFromZeroToThousandUnevenOnly() {
        //Принтира само нечетните числата от 0 до 1000

        for (int i = 0; i <= 1000; i++) {

            if (i % 2 == 1) {

                System.out.println(i);
            }
        }
    }

    public static void numbersFromZeroToThousandWithX() {
        //Принтира числата от 0 до 1000 като заменя всяко 10 то с "Х"

        for (int i = 0; i <= 1000; i++) {//Фор цикъл започващ от 0 стигащ до 1000 като на всяко изпълнение инкрементира индекса i
            if (i == 0) {//Филтър за да не се принтира 0
                continue;
            }

            if (i % 10 == 0) {//Филтър който пропуска всяко 10 то число и го замества с "X"
                System.out.println("X");
                continue;
            }
            System.out.println(i);//Принтира текущата позиция на i
        }
    }

    public static void numbersFromThousandToZero() {
        //Принтира числата от 1000 до 0

        for (int i = 1000; i >= 0; i--) {//Фор цикъл започващ от 1000 стигащ до 0 като на всяко изпълнение декрементира индекса i с едно и го принтира на нов ред в конзолата

            System.out.println(i);//Принтира текущата позиция на i на нов ред в конзолата
        }
    }

    public static void printEvenNumbersFromZeroToHundredToThePowerOfTwo() {
        //Задача 4
        //Метод който принтира всички четни числа от 0 до 100 повдигнати на 2-ра степен

        for (int i = 0; i < 100; i++) {//Вземаме числата от 0 до 100

            if (i % 2 == 0) {//Филтрираме само четните числа
                double result = Math.pow(i, 2);//Повдигме всяко от тях на степен 2

                System.out.printf("%n Резултата от %d на степен 2 е : %.1f", i, result);//Принтираме резулатата
            }
        }
    }


    public static void calculateChange(double[] productPrices, double cash) {
        //Задача 1
        //Метод изчисляващ парите които трябва да върнем на клиента

        if (productPrices.length != 0 && cash != 0) {//Валидираме си входните данни да не са нула и тогава изпълняваме логиката

            double totalSumOfItems = 0;//Променлива от тип double в която съхраняваме сбора от елементите в масива

            for (double productPrice : productPrices) {//Foreach с който итерираме през масива от double-и в който се намират нашите цени на продуктите

                totalSumOfItems += productPrice;//Вземаме всеки един елемент на масива с продукти и го добавяме в totalSumOfItems за да получим сбора
            }
            if (totalSumOfItems > cash) {//Случай в който сумата от продуктите превишава получените пари

                double insufficientAmount = totalSumOfItems - cash;
                System.out.printf("Парите не стигат трябва дадете още %.2f лева", insufficientAmount);//Съобщение което се изписва в конзолата само когато получените пари са по малко от суамта на продуктите

            } else if (totalSumOfItems < cash) {//Случай в който сумата от продуктите не превишава получените пари и трябва да се върне остатъка

                double changeToBeReturned = cash - totalSumOfItems;
                System.out.printf("Ресто: %.2f лева", changeToBeReturned);//Съобщение което се изписва в конзолата само когато получените пари са повече от суамта на продуктите и трябва да се върне остатъка на клиента

            } else if (totalSumOfItems == cash) {

                System.out.printf("Благодаря, хубав ден");//Съобщение което се изписва в конзолата ако получените пари са равни на общата сметка на всички продукти
            }

        } else {

            System.out.println("Невалидна сума!");
        }
    }

    public static void calculateTipAmount(double billTotal, double tipPercentage) {
        //Задача 2
        //Изчислява процент от число
        if (billTotal != 0 && tipPercentage != 0) {//Валидатор за входни данни

            double percentage = (tipPercentage / 100) * billTotal;  //Смятаме процент от подадените параметри
            System.out.printf("За сметка от %.2f лева трябва да оставите %.2f лева", billTotal, percentage);

        } else {

            System.out.println("Невалидна сума или процент !");//Съобщение при грешни данни
        }
    }

    public static void socialMediaFilter(String string) {
        //Задача 3
        //Изрязва всички съгласни букви от подаденият стринг

        if (string != null && string.length() > 0) {//Валидатор за входни данни

            string = string.replaceAll("[AaEeIiOoUu]", "");//Преамахваме избраните буквите като ги намраме с регулярен израз и ги заместваме с празно пространство
            System.out.println(string);//Принтираме резултата

        } else {//Нулл вход или празен стринг

            System.out.println("Подайте текст!");
        }
    }

}
