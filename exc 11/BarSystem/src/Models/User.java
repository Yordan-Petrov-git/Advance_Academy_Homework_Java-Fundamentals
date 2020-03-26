package Models;

import Helpers.Validators;

public class User {

    private String userFullName;

    public User(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserFullName() {
        return this.userFullName;
    }

    public void setUserFullName(String userFullName) {

        if (Validators.validateUserName(userFullName)) {
            this.userFullName = userFullName;
        } else {
            throw new IllegalArgumentException("Invalid full name");
        }
    }

    public void printWaiterName() {
        System.out.println(getUserFullName());
    }
}
