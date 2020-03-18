import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Advertisment extends Vehicle {


    private String adTitle;
    private String adID;

    public Advertisment(String vehicleMake, String vehicleModel, String vehicleYear
            , String vehiclePower, String vehiclePrice, String vehicleDescription
            ,String adTitle, String adID) {

        super(vehicleMake,vehicleModel,vehicleYear,vehiclePower,vehiclePrice,vehicleDescription);

        setAdTitle(adTitle);
        setAdID(adID);
    }


    public String getAdTitle() {
        return this.adTitle;
    }

    public void setAdTitle(String adTitle) {
        if(validateTitle(adTitle)){
            this.adTitle = adTitle;
        }else{
            JOptionPane.showMessageDialog(null, "Невалидна информация :Грешно заглавие", "Грещка", 2);
            throw  new IllegalArgumentException("Грешно заглавие");
        }

    }

    public String getAdID() {
        return this.adID;
    }

    public void setAdID(String adID) {
        if(validateId(adID)){
            this.adID = adID;
        }else {
            JOptionPane.showMessageDialog(null, "Невалидна информация :Грешно ID", "Грещка", 2);
            throw  new IllegalArgumentException("Грешно ID");
        }

    }

    public static boolean validateTitle(String Input) {
        final String regex = "^[A-Z]{1}[a-zA-Z]{3,30}$";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(Input);
        if (matcher.find()) {
            return true;
        }
        return false;
    }
    public static boolean validateId(String Input) {
        final String regex = "^[a-zA-Z0-9]{8}$";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(Input);
        if (matcher.find()) {
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return super.toString() + "Advertisment{" +
                "adTitle='" + adTitle + '\'' +
                ", adID='" + adID + '\'' +
                '}';
    }

}
