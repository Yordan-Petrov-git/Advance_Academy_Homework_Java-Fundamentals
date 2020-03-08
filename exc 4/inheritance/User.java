package inheritance;

public class User {

    private String fullName;
    private String age;
    private String email;
    private String phoneNumber;
    private String address;

    public User(String fullName, String age, String
            email, String phoneNumber, String address) {

        this.setFullNameName(fullName);
        this.setAge(age);
        this.setEmail(email);
        this.setPhoneNumber(phoneNumber);
        this.setAddress(address);
    }

    //=============GET================
    public String getFullName() {
        return fullName;
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    //=======================================================

    //=============SET================
    public void setFullNameName(String fullName) {

        if (fullName.length() >=2 && fullName.length() <=60) {
            this.fullName = fullName;
        } else {
            throw new IllegalArgumentException("Моля въведете валидно име");
        }
    }

    public void setAge(String age) {
        if (!age.equals(" ".trim())) {
            this.age = age;
        }else {
            throw new IllegalArgumentException("Моля въведете години над 0");
        }
    }

    public void setEmail(String email) {

        if (!email.equals(" ".trim())) {
            this.email = email;
        }else {
            throw new IllegalArgumentException("Моля въведете валиден имейл");
        }
    }

    public void setPhoneNumber(String phoneNumber) {

        if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        }else {
            throw new IllegalArgumentException("Моля въведете валиден телефонен номер");
        }
    }

    public void setAddress(String address) {

        if (!address.equals(" ".trim())) {
            this.address = address;
        }
    }

//=============Methods======================

    public void printsUserInformation() {
        System.out.println("Name: " + getFullName() +
                " Age: " + getAge() + " Email : " + getEmail() +
                " Phone : " + getPhoneNumber() + " Address : " + getAddress());
    }
}
