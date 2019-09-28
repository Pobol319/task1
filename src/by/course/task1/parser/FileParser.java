package by.course.task1.parser;

import by.course.task1.exception.StreamsException;
import by.course.task1.util.ConverterToArray;
import by.course.task1.validation.Validator;


import java.io.*;
import java.util.ArrayList;


public class FileParser {
    private ArrayList<String> textFromFile = new ArrayList<>();

    public void getTextFromFile(File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                textFromFile.add(temp);
            }
            if (textFromFile.isEmpty()) throw new StreamsException("В файле нет записей", file.getName());
        } catch (FileNotFoundException e1) {
            System.err.println("Файл не найден");
        } catch (IOException e2) {
            System.err.println("Ошибка чтения из файла");
        } catch (StreamsException e3){
            System.err.println(e3.getMessage());
            System.err.println(e3.getText());
        }
    }


    public ArrayList<double[]> getListOfArrays() {

        ArrayList<double[]> listOfArrays = new ArrayList<>();

        for (String temp : textFromFile) {
            if (Validator.isValid(temp)) {
                listOfArrays.add(ConverterToArray.getDoubleArray(temp));
            }
        }
        return listOfArrays;
    }

}

