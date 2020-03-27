package Models;

public class Waiter extends User {


    private String waiterUsername;
    private String waiterPassword;

    public Waiter(String userFullName, String waitressUsername, String waiterPassword) {
        super(userFullName);
        setWaitressUsername(waitressUsername);
        setWaiterPassword(waiterPassword);
    }

    public String getWaitressUsername() {
        return this.waiterUsername;
    }

    public void setWaitressUsername(String waitressUsername) {
        this.waiterUsername = waitressUsername;
    }

    public String getWaiterPassword() {
        return this.waiterPassword;
    }

    public void setWaiterPassword(String waiterPassword) {
        this.waiterPassword = waiterPassword;
    }


    @Override
    public String toString() {
        return "Waiter{" +
                "waiterUsername='" + waiterUsername + '\'' +
                ", waiterPassword='" + waiterPassword + '\'' +
                '}';
    }

}
