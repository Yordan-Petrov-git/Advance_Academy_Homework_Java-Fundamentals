package Models;

public class Waiter extends User {


    private String waitressUsername;
    private String waitressPassword;

    public Waiter(String userFullName, String waitressUsername, String waitressPassword) {
        super(userFullName);
        setWaitressUsername(waitressUsername);
        setWaitressPassword(waitressPassword);
    }



    public String getWaitressUsername() {
        return this.waitressUsername;
    }

    public void setWaitressUsername(String waitressUsername) {
        this.waitressUsername = waitressUsername;
    }

    public String getWaitressPassword() {
        return this.waitressPassword;
    }

    public void setWaitressPassword(String waitressPassword) {
        this.waitressPassword = waitressPassword;
    }


}
