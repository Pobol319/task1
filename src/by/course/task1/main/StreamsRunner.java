package by.course.task1.main;

import by.course.task1.converter.ConverterToArray;
import by.course.task1.exception.StreamsException;
import by.course.task1.parser.TxtReader;
import by.course.task1.sorter.ArraysSorter;
import by.course.task1.util.ArrayUtil;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class StreamsRunner {
    private static final String NUMBERS_FILE_PATH = "resources\\numbers.txt";

    public static void main(String[] args) throws StreamsException {

        File file = new File(NUMBERS_FILE_PATH);

        TxtReader fileParser = new TxtReader();

        List<String> listOfStringArrays = fileParser.getListOfArrays(file);
        List<double[]> listOfDoubleArrays = ConverterToArray.getListOfDoubleArrays(listOfStringArrays);

        for (double[] array : listOfDoubleArrays) {
            System.out.println("Array: " + Arrays.toString(array));
            System.out.println("Sorted array: " + Arrays.toString(ArraysSorter.bubbleSort(array)));
            System.out.println("Sum of elements: " + ArrayUtil.elementsSum(array));
            System.out.println("AVG of elements: " + ArrayUtil.elementsAverage(array));
            System.out.println("MAX element: " + ArrayUtil.maxElement(array));
            System.out.println("MIN element: " + ArrayUtil.minElement(array));
            System.out.println();
        }

    }
}
