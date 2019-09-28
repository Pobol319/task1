package by.course.task1.main;

import by.course.task1.parser.FileParser;
import by.course.task1.sorter.ArraysSorter;
import by.course.task1.util.UtilArray;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class RunnerStreams {

    public static void main(String[] args) {

        File file = new File("resources\\numbers.txt");

        FileParser fileParser = new FileParser();
        fileParser.getTextFromFile(file);

        ArrayList<double[]> arrayList = fileParser.getListOfArrays();

        for (double[] array : arrayList) {
            System.out.println("Array: " + Arrays.toString(array));
            System.out.println("Sorted array: " + Arrays.toString(ArraysSorter.bubbleSort(array)));
            System.out.println("Sum of elements: " + UtilArray.elementsSum(array));
            System.out.println("AVG of elements: " + UtilArray.elementsAverage(array));
            System.out.println("MAX element: " + UtilArray.maxElement(array));
            System.out.println("MIN element: " + UtilArray.minElement(array));
        }

    }
}
