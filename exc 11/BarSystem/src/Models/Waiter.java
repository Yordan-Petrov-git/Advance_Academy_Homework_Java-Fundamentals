package Models;

import org.w3c.dom.ls.LSOutput;

public class Waiter {


    private String waitressName;
    private String waitressUsername;
    private String waitressPassword;

    public Waiter(String waitressName, String waitressUsername, String waitressPassword) {

        setWaitressName(waitressName);
        setWaitressUsername(waitressUsername);
        setWaitressPassword(waitressPassword);
    }

    public String getWaitressName() {
        return this.waitressName;
    }

    public void setWaitressName(String waitressName) {
        this.waitressName = waitressName;
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

    public void printWaiterName() {
        System.out.println(getWaitressName());
    }
}
