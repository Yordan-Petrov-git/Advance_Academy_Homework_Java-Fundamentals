package arrays;

public class User {


    private String firstName;
    private String familyName;
    private String phoneNumber;
    private String email;
    private String homeAddress;

    public User(String firstName, String familyName,
                String phoneNumber, String email, String homeAddress) {

        setFirstName(firstName);
        setFamilyName(familyName);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setHomeAddress(homeAddress);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() != 0) {
            this.firstName = firstName;
        } else {
            throw new IllegalArgumentException("Моля въведете валидно име");
        }
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        if (familyName.length() != 0) {
            this.familyName = familyName;
        } else {
            throw new IllegalArgumentException("Моля въведете валидно фамилно име");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Моля въведете валиден телефонен номер");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.length() != 0) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Моля въведете валиден имейл");
        }

    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        if (homeAddress.length() != 0) {
            this.homeAddress = homeAddress;
        } else {
            throw new IllegalArgumentException("Моля въведете валиден домашен адрес");
        }

    }


}
