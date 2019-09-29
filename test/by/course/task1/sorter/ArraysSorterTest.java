package by.course.task1.sorter;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArraysSorterTest {

    @DataProvider
    public Object[][] setUpDouble() {
        return new Object[][]{
                new Object[]{
                        new double[]{18.6, 100.00, 0.6, 25.16},
                        new double[]{0.6, 18.6, 25.16, 100.00},
                },
                new Object[]{
                        new double[]{11.5, 21.16, 1.0, 251.3, 58.5},
                        new double[]{1.0, 11.5, 21.16, 58.5, 251.3},
                },
        };
    }

    @DataProvider
    public Object[][] setUpInt() {
        return new Object[][]{
                new Object[]{
                        new int[]{18, 100, 0, 25},
                        new int[]{0, 18, 25, 100},
                },
                new Object[]{
                        new int[]{11, 21, 1, 251, 58},
                        new int[]{1, 11, 21, 58, 251},
                },
        };
    }

    @Test(dataProvider = "setUpDouble")
    public void bubbleSortTest(double[] given, double[] expected) {
        ArraysSorter.bubbleSort(given);
        Assert.assertEquals(given, expected);
    }

    @Test(dataProvider = "setUpDouble")
    public void insertionSortTest(double[] given, double[] expected) {
        ArraysSorter.insertionSort(given);
        Assert.assertEquals(given, expected);
    }

    @Test(dataProvider = "setUpDouble")
    public void selectionSortTest(double[] given, double[] expected) {
        ArraysSorter.insertionSort(given);
        Assert.assertEquals(given, expected);
    }

    @Test(dataProvider = "setUpInt")
    public void bubbleSortTest(int[] given, int[] expected) {
        ArraysSorter.bubbleSort(given);
        Assert.assertEquals(given, expected);
    }

    @Test(dataProvider = "setUpInt")
    public void insertionSortTest(int[] given, int[] expected) {
        ArraysSorter.insertionSort(given);
        Assert.assertEquals(given, expected);
    }

    @Test(dataProvider = "setUpInt")
    public void selectionSortTest(int[] given, int[] expected) {
        ArraysSorter.insertionSort(given);
        Assert.assertEquals(given ,expected);
    }

}
