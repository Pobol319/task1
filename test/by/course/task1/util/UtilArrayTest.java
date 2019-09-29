package by.course.task1.util;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class UtilArrayTest {

    @DataProvider
    public Object[][] setUpAvg() {
        return new Object[][]{
                new Object[]{new int[]{1, 10}, 5.5},
                new Object[]{new int[]{10, 20, 30}, 20},
        };
    }

    @DataProvider
    public Object[][] setUpSum() {
        return new Object[][]{
                new Object[]{new int[]{13, 14}, 27},
                new Object[]{new int[]{20, 13}, 33},
        };
    }

    @DataProvider
    public Object[][] setUpMax() {
        return new Object[][]{
                new Object[]{new int[]{0, 3}, 3},
                new Object[]{new int[]{12, 22}, 22},
        };
    }

    @DataProvider
    public Object[][] setUpMin() {
        return new Object[][]{
                new Object[]{new int[]{3, 13}, 3},
                new Object[]{new int[]{12, 32}, 12},
        };
    }

    @Test(dataProvider = "setUpAvg")
    public void averageTest(int[] given, double expected) {
        Assert.assertEquals(UtilArray.elementsAverage(given), expected);
    }

    @Test(dataProvider = "setUpSum")
    public void sumTest(int[] given, int expected) {
        Assert.assertEquals(UtilArray.elementsSum(given), expected);
    }

    @Test(dataProvider = "setUpMax")
    public void maxTest(int[] given, int expected) {
        Assert.assertEquals(UtilArray.maxElement(given), expected);
    }

    @Test(dataProvider = "setUpMin")
    public void minTest(int[] given, int expected) {
        Assert.assertEquals(UtilArray.minElement(given), expected);
    }

}
