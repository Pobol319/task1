package by.course.task1.streams.conventer;

import java.io.IOException;
import java.util.ArrayList;

public class ConverterFromStringToArray {


    public static double[] getDoubleArray(String temp)  {

        String[] arrayOfStringNumbers = temp.split("[ ]+");
        double[] arrayOfDoubleNumbers = new double[arrayOfStringNumbers.length];

        for (int i = 0; i < arrayOfStringNumbers.length; i++) {
            arrayOfDoubleNumbers[i] = Double.parseDouble(arrayOfStringNumbers[i]);
        }

        return arrayOfDoubleNumbers;
    }


}
