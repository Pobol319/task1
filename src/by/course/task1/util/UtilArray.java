package by.course.task1.util;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class UtilArray {

    public static double elementsAverage(int[] array) {
        int size = array.length;
        double avg = 0;

        for (int element : array) {
            avg = avg + element;
        }
        return avg / size;
    }

    public static double elementsAverageByIntStream(int[] array) {
        return IntStream.of(array).average().getAsDouble();
    }

    public static int elementsSum(int[] array) {
        int sum = 0;

        for (int element : array) {
            sum = sum + element;
        }
        return sum;
    }

    public static int elementsSumByIntStream(int[] array) {
        return IntStream.of(array).sum();
    }

    public static int[] replacementElementsLessThan(int element, int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < element) {
                array[i] = element;
            }
        }
        return array;
    }

    public static boolean containElement(int[] array, int element) {
        return IntStream.of(array).anyMatch(i -> i == element);
    }

    public static int maxElement(int[] array) {

        int maxElement = array[0];

        for (int element : array) {
            if (maxElement < element) {
                maxElement = element;
            }
        }
        return maxElement;
    }

    public static int maxElementByIntStream(int[] array) {
        return IntStream.of(array).max().getAsInt();
    }

    public static int minElement(int[] array) {
        int minElement = array[0];

        for (int element : array) {
            if (minElement > element) {
                minElement = element;
            }
        }
        return minElement;
    }

    public static int minElementByIntStream(int[] array) {
        return IntStream.of(array).min().getAsInt();
    }

}
