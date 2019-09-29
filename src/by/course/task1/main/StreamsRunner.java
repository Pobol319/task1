package by.course.task1.main;

import by.course.task1.parser.FileParser;
import by.course.task1.sorter.ArraysSorter;
import by.course.task1.util.ArrayUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class StreamsRunner {
    private static final String NUMBERS_FILE_PATH = "resources\\numbers.txt";

    public static void main(String[] args) {

        File file = new File(NUMBERS_FILE_PATH);

        FileParser fileParser = new FileParser();

        ArrayList<double[]> arrayList = fileParser.getListOfArrays(file);

        for (double[] array : arrayList) {
            System.out.println("Array: " + Arrays.toString(array));
            System.out.println("Sorted array: " + Arrays.toString(ArraysSorter.bubbleSort(array)));
            System.out.println("Sum of elements: " + ArrayUtil.elementsSum(array));
            System.out.println("AVG of elements: " + ArrayUtil.elementsAverage(array));
            System.out.println("MAX element: " + ArrayUtil.maxElement(array));
            System.out.println("MIN element: " + ArrayUtil.minElement(array));
        }

    }
}
