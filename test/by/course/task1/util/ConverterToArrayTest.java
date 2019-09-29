package by.course.task1.util;

import by.course.task1.parser.FileParser;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ConverterToArrayTest {

    @DataProvider
    public Object[][] setUp() {
        return new Object[][]{
                new Object[]{"10.1 21 25", new double[]{10.1, 21.0, 25.0}},
                new Object[]{"22 123.22 0.5", new double[]{22, 123.22, 0.5}}
        };
    }

    @Test(dataProvider = "setUp")
    public void getListOfArraysTest(String given, double[] expected) {
        Assert.assertEquals(ConverterToArray.getDoubleArray(given), expected);
    }

}
