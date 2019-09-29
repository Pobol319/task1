package by.course.task1.parser;

import by.course.task1.exception.StreamsException;
import by.course.task1.util.ConverterToArray;
import by.course.task1.validation.Validator;


import java.io.*;
import java.util.ArrayList;

public class FileParser {

    private ArrayList<String> getTextFromFile(File file) {

        ArrayList<String> textFromFile = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                textFromFile.add(temp);
            }
            if (textFromFile.isEmpty()) throw new StreamsException("File is empty", file.getName());
        } catch (FileNotFoundException e1) {
            System.err.println("File not found");
        } catch (IOException e2) {
            System.err.println("Error while reading from file");
        } catch (StreamsException e3) {
            System.err.println(e3.getMessage());
            System.err.println(e3.getText());
        }
        return textFromFile;
    }

    public ArrayList<double[]> getListOfArrays(File file) {
        ArrayList<String> textFromFile = getTextFromFile(file);

        ArrayList<double[]> listOfArrays = new ArrayList<>();

        for (String temp : textFromFile) {
            if (Validator.isValid(temp)) {
                listOfArrays.add(ConverterToArray.getDoubleArray(temp));
            }
        }
        return listOfArrays;
    }

}

