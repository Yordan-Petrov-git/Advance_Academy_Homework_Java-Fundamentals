public class Vehicle {
    private String vehicleMake;
    private String vehicleModel;
    private String vehicleYear;
    private String vehiclePower;
    private String vehiclePrice;
    private String vehicleDescription;

    public Vehicle(String vehicleMake, String vehicleModel, String vehicleYear, String vehiclePower, String vehiclePrice, String vehicleDescription) {
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
        this.vehicleMake = vehicleMake;
    }

    public String getVehicleModel() {
        return this.vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleYear() {
        return this.vehicleYear;
    }

    public void setVehicleYear(String vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    public String getVehiclePrice() {
        return this.vehiclePrice;
    }

    public void setVehiclePrice(String vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public String getVehiclePower() {
        return this.vehiclePower;
    }

    public void setVehiclePower(String vehiclePower) {
        this.vehiclePower = vehiclePower;
    }

    public String getVehicleDescription() {
        return this.vehicleDescription;
    }

    public void setVehicleDescription(String vehicleDescription) {
        this.vehicleDescription = vehicleDescription;
    }


}
