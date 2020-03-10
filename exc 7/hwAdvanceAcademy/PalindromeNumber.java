package hwAdvanceAcademy;

public class PalindromeNumber {

    static int larrgestPalindrome(int numbers)
    //Изчисляваме най-големният палиндорм от умножението на н брой числа
    //Задача 4
    {
        int upperLimit = 0;//Горен лимит за най- голямото число от н
        for (int i = 1; i <= numbers; i++) {
            upperLimit *= 10;
            upperLimit += 9;
        }
        int lowerLimit = 1 + upperLimit / 10;
        // Инициализираме резултата
        int maxProduct = 0;
        for (int i = upperLimit; i >= lowerLimit; i--) {
            for (int j = i; j >= lowerLimit; j--) {
                int product = i * j;
                if (product < maxProduct)
                    break;
                int number = product;
                int reverse = 0;
                //Проверява дали е палиндом
                while (number != 0) {
                    reverse = reverse * 10 + number % 10;
                    number /= 10;
                }
                //Ъпдейт
                if (product == reverse && product > maxProduct)
                    maxProduct = product;
            }
        }
        return maxProduct;
    }
}
