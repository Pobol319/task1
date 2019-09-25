package by.course.task1.main;


import by.course.task1.reader.NumbersGetterFromFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class RunnerStreams {

    public static void main(String[] args) throws IOException {


        File file = new File("resources\\numbers.txt");

        NumbersGetterFromFile numbersGetterFromFile = new NumbersGetterFromFile();

        ArrayList<double[]> arrayList = numbersGetterFromFile.getListOfArrays(file);

        for (double[] array : arrayList) {
            System.out.println(Arrays.toString(array));
        }


    }
}
