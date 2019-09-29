package by.course.task1.parser;

import by.course.task1.exception.StreamsException;
import by.course.task1.util.ConverterToArray;
import by.course.task1.validation.Validator;


import java.io.*;
import java.util.ArrayList;

public class FileParser {

    public ArrayList<double[]> getListOfArrays(File file) {
        final ArrayList<String> textFromFile = getTextLinesFromFile(file);

        final ArrayList<double[]> listOfArrays = new ArrayList<>();

        for (final String textLine : textFromFile) {
            if (Validator.isValid(textLine)) {
                listOfArrays.add(ConverterToArray.getDoubleArray(textLine));
            }
        }
        return listOfArrays;
    }

    private ArrayList<String> getTextLinesFromFile(File file) {

        final ArrayList<String> textLinesFromFile = new ArrayList<>();

        try (final BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                textLinesFromFile.add(temp);
            }
            if (textLinesFromFile.isEmpty()) {//do we really need to throw an exception in case file is empty? is it an exceptional case?
                throw new StreamsException("File is empty", file.getName());
            }
        } catch (FileNotFoundException e1) {
            System.err.println("File not found");
        } catch (IOException e2) {
            System.err.println("Error while reading from file");
        } catch (StreamsException e3) {
            System.err.println(e3.getMessage());
            System.err.println(e3.getText());
        }
        return textLinesFromFile;
    }

}

