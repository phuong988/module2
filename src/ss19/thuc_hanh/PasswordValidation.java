package src.ss19.thuc_hanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static boolean checkPassword(String password) {
        Pattern pattern = Pattern.compile("[0-9]{4,10}");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
