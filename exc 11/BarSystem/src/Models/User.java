package Models;

public class User {

    private String userFullName;

    public User(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserFullName() {
        return this.userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public void printWaiterName() {
        System.out.println(getUserFullName());
    }
}
