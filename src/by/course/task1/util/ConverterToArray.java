package by.course.task1.util;


import java.util.stream.IntStream;

public class ConverterToArray {

    public static double[] getDoubleArray(String temp) {

        String[] arrayOfStringNumbers = temp.split("[ ]+");
        double[] arrayOfDoubleNumbers = new double[arrayOfStringNumbers.length];

        for (int i = 0; i < arrayOfStringNumbers.length; i++) {
            arrayOfDoubleNumbers[i] = Double.parseDouble(arrayOfStringNumbers[i]);
        }
        return arrayOfDoubleNumbers;
    }

    public static int[] getIntArrayFromIntStream(IntStream intStream) {
        return intStream.toArray();
    }

}
