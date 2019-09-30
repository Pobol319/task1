package by.course.task1.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static boolean isValid(String temp) {
        temp = temp.trim();
        String regex = "[0-9]+\\.?[0-9]*";
        Pattern pattern = Pattern.compile(regex);
        String[] numbers = temp.split("[ ]+");
        Matcher matcher;
        for (String number : numbers) {
            matcher = pattern.matcher(number);
            if (!matcher.matches()) {
                return false;
            }
        }
        return true;
    }

}


