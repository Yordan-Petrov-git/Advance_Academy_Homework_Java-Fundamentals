import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vehicle {

    private String vehicleMake;
    private String vehicleModel;
    private String vehicleYear;
    private String vehiclePower;
    private String vehiclePrice;
    private String vehicleDescription;

    public Vehicle(String vehicleMake, String vehicleModel, String vehicleYear,
                   String vehiclePower, String vehiclePrice, String vehicleDescription) {

        setVehicleMake(vehicleMake);
        setVehicleModel(vehicleModel);
        setVehicleYear(vehicleYear);
        setVehiclePower(vehiclePower);
        setVehiclePrice(vehiclePrice);
        setVehicleDescription(vehicleDescription);
    }


    public String getVehicleMake() {
        return this.vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        if (validateMake(vehicleMake)) {
            this.vehicleMake = vehicleMake;
        } else {
            JOptionPane.showMessageDialog(null, "Невалидна информация :Грешна марка", "Грещка", 2);
            throw new IllegalArgumentException("Грешна марка");
        }
    }

    public String getVehicleModel() {
        return this.vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        if (validateModel(vehicleModel)) {
            this.vehicleModel = vehicleModel;
        } else {
            JOptionPane.showMessageDialog(null, "Невалидна информация :Грешен модел", "Грещка", 2);
            throw new IllegalArgumentException("Грешен модел");
        }

    }

    public String getVehicleYear() {
        return this.vehicleYear;
    }

    public void setVehicleYear(String vehicleYear) {
        if (validateYear(vehicleYear)) {
            this.vehicleYear = vehicleYear;
        } else {
            JOptionPane.showMessageDialog(null, "Невалидна информация :Грешна година", "Грещка", 2);
            throw new IllegalArgumentException("Грешна година");
        }
    }

    public String getVehiclePrice() {
        return this.vehiclePrice;
    }

    public void setVehiclePrice(String vehiclePrice) {
        if (validatePrice(vehiclePrice)) {
            this.vehiclePrice = vehiclePrice;
        } else {
            JOptionPane.showMessageDialog(null, "Невалидна информация :Грешна цена", "Грещка", 2);
            throw new IllegalArgumentException("Грешна цена");
        }
    }

    public String getVehiclePower() {
        return this.vehiclePower;
    }

    public void setVehiclePower(String vehiclePower) {
        if (validatePower(vehiclePower)) {
            this.vehiclePower = vehiclePower;
        } else {
            JOptionPane.showMessageDialog(null, "Невалидна информация :Грешна мощност", "Грещка", 2);
            throw new IllegalArgumentException("Грешна мощност");
        }

    }

    public String getVehicleDescription() {
        return this.vehicleDescription;
    }

    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }

    public static boolean validateMake(String Input) {
        final String regex = "^[a-zA-Z]{2,20}$";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(Input);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    public static boolean validateModel(String Input) {
        final String regex = "^[a-zA-Z]{2,20}$";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(Input);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    public static boolean validateYear(String Input) {
        final String regex = "^\\d{4}$";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(Input);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    public static boolean validatePrice(String Input) {
        final String regex = "^\\d{0,9}$";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(Input);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    public static boolean validatePower(String Input) {
        final String regex = "^\\d{1,4}$";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(Input);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleMake='" + vehicleMake + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", vehicleYear='" + vehicleYear + '\'' +
                ", vehiclePower='" + vehiclePower + '\'' +
                ", vehiclePrice='" + vehiclePrice + '\'' +
                ", vehicleDescription='" + vehicleDescription + '\'' +
                '}';
    }

}
