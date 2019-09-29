package by.course.task1.util;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ArrayUtilTest {

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

    @DataProvider
    public Object[][] setUpReplacementElementsLessThan() {
        return new Object[][]{
                new Object[]{new int[]{3, 13, 125}, 25, new int[]{25, 25, 125}},
                new Object[]{new int[]{12, 32, 4}, 12, new int[]{12, 32, 12}}
        };
    }

    @Test(dataProvider = "setUpAvg")
    public void averageTest(int[] givenArray, double expectedAvg) {
        Assert.assertEquals(ArrayUtil.elementsAverage(givenArray), expectedAvg);
    }

    @Test(dataProvider = "setUpSum")
    public void sumTest(int[] givenArray, int expectedSum) {
        Assert.assertEquals(ArrayUtil.elementsSum(givenArray), expectedSum);
    }

    @Test(dataProvider = "setUpMax")
    public void maxTest(int[] givenArray, int expectedMax) {
        Assert.assertEquals(ArrayUtil.maxElement(givenArray), expectedMax);
    }

    @Test(dataProvider = "setUpMin")
    public void minTest(int[] givenArray, int expectedMin) {
        Assert.assertEquals(ArrayUtil.minElement(givenArray), expectedMin);
    }

    @Test(dataProvider = "setUpReplacementElementsLessThan")
    public void replacementElementsLessThanTest(int[] givenArray, int givenElement, int[] expectedArray) {
        Assert.assertEquals(ArrayUtil.replacementElementsLessThan(givenElement, givenArray), expectedArray);
    }

}
