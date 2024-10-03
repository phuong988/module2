package src.ss19.bai_tap.validate_name_classroom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Classroom {
    public static boolean checkNameClassroom(String nameClassroom) {
        Pattern pattern = Pattern.compile("^[CAP][0-9]{4}+[GHIK]$");
        Matcher matcher = pattern.matcher(nameClassroom);
        return matcher.matches();
    }
}
