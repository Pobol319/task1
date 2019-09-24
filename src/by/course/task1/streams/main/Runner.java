package by.course.task1.streams.main;


import by.course.task1.streams.conventer.ConverterFromStringToArray;
import by.course.task1.streams.file_handler.NumbersGetterFromFile;
import by.course.task1.streams.validation.Validator;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws IOException {


        File file = new File("resources\\numbers.txt");

        NumbersGetterFromFile numbersGetterFromFile = new NumbersGetterFromFile();

        ArrayList<double[]> arrayList = numbersGetterFromFile.getListOfArrays(file);

        for (double[] array : arrayList) {
            System.out.println(Arrays.toString(array));
        }


    }
}
