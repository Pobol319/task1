package by.course.task1.converter;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ConverterToArrayTest {

    @Test
    public void getListOfArraysTest() {
        List<String> givenListOfStringArrays = new ArrayList<>();
        givenListOfStringArrays.add("10.1 21 25");

        List<double[]> expectedListOfDoubleArrays = new ArrayList<>();
        expectedListOfDoubleArrays.add(new double[]{10.1, 21.0, 25.0});

        Assert.assertEquals(ConverterToArray.getListOfDoubleArrays(givenListOfStringArrays).get(0), expectedListOfDoubleArrays.get(0));
    }

}
