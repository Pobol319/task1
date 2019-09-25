package by.course.task1.read;

import javax.xml.validation.Validator;
import java.io.*;
import java.util.ArrayList;

public class NumbersGetterFromFile {


    public ArrayList<double[]> getListOfArrays(File file) throws IOException {

        ArrayList<double[]> listOfArrays = new ArrayList<double[]>();

        String temp = null;
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            while ((temp = bufferedReader.readLine()) != null) {
                if (Validator.isValid(temp)) {
                    listOfArrays.add(ConverterFromStringToArray.getDoubleArray(temp));

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            if (bufferedReader != null) {
                bufferedReader.close();

            }
        }

        return listOfArrays;

    }

}

