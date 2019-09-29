package by.course.task1.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {


    public static boolean isValid(String temp) {

        temp = temp.trim();
        Pattern pattern = Pattern.compile("[0-9]+\\.?[0-9]*");
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


