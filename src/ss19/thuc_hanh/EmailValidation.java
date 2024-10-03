package src.ss19.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9]+@+[A-Za-z0-9.-]+.(com|)+$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
