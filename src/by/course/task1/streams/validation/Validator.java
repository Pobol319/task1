package by.course.task1.streams.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {


    public static boolean isValid(String temp) {

        temp = temp.trim();
        Pattern numberPattern = Pattern.compile("[0-9]+\\.?[0-9]*");
        String[] numbers = temp.split("[ ]+");
        Matcher numberMatcher;
        for (String number : numbers) {
            numberMatcher = numberPattern.matcher(number);
            if (!numberMatcher.matches()) {
                return false;
            }
        }

        return true;
    }

}


