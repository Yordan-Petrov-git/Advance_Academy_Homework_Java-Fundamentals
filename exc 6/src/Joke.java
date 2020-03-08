
public class Joke {

    private String Username;
    private String Email;
    private String FirstName;
    private String LastName;
    private String PhoneNumber;
    private String JokeID;
    private String JokeText;


    public Joke(String username, String email, String firstName,
                String lastName, String phoneNumber, String jokeID, String jokeText) {

        setUsername(username);
        setEmail(email);
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
        setJokeID(jokeID);
        setJokeText(jokeText);
    }

    public String getUsername() {
        return this.Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getJokeID() {
        return this.JokeID;
    }

    public void setJokeID(String jokeID) {
        JokeID = jokeID;
    }

    public String getJokeText() {
        return this.JokeText;
    }

    public void setJokeText(String jokeText) {
        JokeText = jokeText;
    }

    @Override
    public String toString() {
        return "Author :" + getFirstName() + " " +
                "LastName :" + getLastName() + " " +
                "posted a joke :" + " " +
                getJokeText();
    }

}

