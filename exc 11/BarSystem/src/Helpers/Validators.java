package Helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validators {

    public static boolean validateUserName(String Input) {
        //Validates username of the waiter
        //Username must contain only letters min
        final String regex = "^[a-zA-Z]{2,30}$";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(Input);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

    public static boolean validatePassword(String Input) {
        //Validate password of the waiter
        //Valid password is any 4 digit combination
        //Example : 1234 , 2345 , 5896 , 5555 , 8754 , 9658 ...
        final String regex = "^\\d{4}$";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(Input);
        if (matcher.find()) {
            return true;
        }
        return false;
    }

}
