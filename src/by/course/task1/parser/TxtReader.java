package by.course.task1.parser;

import by.course.task1.exception.StreamsException;
import by.course.task1.validator.Validator;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TxtReader {

    public List<String> getListOfArrays(File file) throws StreamsException {
        List<String> textFromFile = getTextFromFile(file);

        List<String> listOfArrays = new ArrayList<>();

        for (String temp : textFromFile) {
            if (Validator.isValid(temp)) {
                listOfArrays.add(temp);
            }
        }
        return listOfArrays;
    }

    private List<String> getTextFromFile(File file) throws StreamsException {

        ArrayList<String> textFromFile = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                textFromFile.add(temp);
            }
            if (textFromFile.isEmpty()) {
                throw new StreamsException("File is empty", file.getName());
            }
        } catch (IOException e2) {
            throw new StreamsException("Exception", e2);
        }
        return textFromFile;
    }

}

