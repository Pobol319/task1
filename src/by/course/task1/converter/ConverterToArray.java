package by.course.task1.converter;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ConverterToArray {

    public static List<double[]> getListOfDoubleArrays(List<String> listOfStringArrays) {
        List<double[]> listOfDoubleArrays = new ArrayList<>();

        for (String temp : listOfStringArrays) {

            String[] arrayOfStringNumbers = temp.split("[ ]+");
            double[] arrayOfDoubleNumbers = new double[arrayOfStringNumbers.length];

            for (int i = 0; i < arrayOfStringNumbers.length; i++) {
                arrayOfDoubleNumbers[i] = Double.parseDouble(arrayOfStringNumbers[i]);
            }
            listOfDoubleArrays.add(arrayOfDoubleNumbers);
        }
        return listOfDoubleArrays;
    }

    public static int[] getIntArrayFromIntStream(IntStream intStream) {
        return intStream.toArray();
    }

}
