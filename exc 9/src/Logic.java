import javax.swing.*;
import java.util.ArrayList;


public class Logic {

    public static ArrayList<Advertisment> arrayListAds = new ArrayList<>();

    public static void addNewAdvert(String vehicleMake, String vehicleModel, String vehicleYear
            , String vehiclePower, String vehiclePrice, String vehicleDescription
            , String adTitle) {

        //Creates Advert Id with length 8
        String adID = Logic.RandomString
                .getAlphaNumericString(8);

        try {
            Advertisment addNewAd = new Advertisment(vehicleMake, vehicleModel, vehicleYear, vehiclePower, vehiclePrice, vehicleDescription, adTitle, adID);
            arrayListAds.add(addNewAd);
            JFrameAds.clearTextFields();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }


    public static class RandomString {

        // function to generate a random string of length n
        static String getAlphaNumericString(int n) {
            // chose a Character random from this String
            String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                    + "0123456789"
                    + "abcdefghijklmnopqrstuvxyz";

            // create StringBuffer size of AlphaNumericString
            StringBuilder sb = new StringBuilder(n);

            for (int i = 0; i < n; i++) {
                // generate a random number between
                // 0 to AlphaNumericString variable length
                int index
                        = (int) (AlphaNumericString.length()
                        * Math.random());

                // add Character one by one in end of sb
                sb.append(AlphaNumericString
                        .charAt(index));
            }

            return sb.toString();
        }
    }


    public static void removeById(String selectedAdIdToRemove) {
        //Метод който премахва даденият елемент

        boolean idMatches = false;//Променлва която използваме за да намерим дали имаме съвпадение с елемент от масива
        if (selectedAdIdToRemove.length() > 0) {//Филтрира стринг с 0 елемента
            for (int i = 0; i < arrayListAds.size(); i++) {//Итерира през всички елементи на масива
                if (arrayListAds.get(i).getAdID().equals(selectedAdIdToRemove)) {//Ако елемента от арея е на определен индекс съвпада с търсения пропуска надолу
                    System.out.println("Изтрихте елемента ID :" + arrayListAds.get(i).getAdID());//Принтира съобщене
                    JOptionPane.showMessageDialog(null, "Изтрихте елемента ", arrayListAds.get(i).getAdID(), 1);
                    arrayListAds.remove(i);//Премахва елемента на индекс I
                    idMatches = true;//Когато е намерено съвпадение
                    break;//Прекъсва цикъла след като изтрие елемента
                }
            }
            if (!idMatches) {//Влза тук когато резултата не е намерен в масива
                JOptionPane.showMessageDialog(null, "Няма намерен резултат", "Резултат", 1);
                System.out.println("Няма намерен резултат");
            }
        } else {//Влиза тук когато входа е празен Стринг
            JOptionPane.showMessageDialog(null, "Невалидна информация", "Грещка", 1);
            System.out.println("Невалидна информация");
        }

    }

}
