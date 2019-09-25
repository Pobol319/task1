package by.course.task1.util;

public class Util {

    public static double elementsAverage(int[] array) {
        int size = array.length;
        double avg = 0;

        for (int element : array) {
            avg = avg + element;
        }

        return avg / size;
    }

    public static int elementsSum(int[] array) {
        int sum = 0;

        for (int element : array) {
            sum = sum + element;
        }

        return sum;
    }

    public static int[] replacementElementsLessThan(int element, int[] array) {
        int size = array.length;

        for (int i = 0; i < size; i++) {
            if (array[i] < element) {
                array[i] = element;
            }
        }

        return array;
    }

    public static int maxElement(int[] array) {
        int size = array.length;
        int maxElement = array[0];

        for (int element : array) {
            if (maxElement < element) {
                maxElement = element;
            }
        }

        return maxElement;
    }

    public static int minElement(int[] array) {
        int size = array.length;
        int minElement = array[0];

        for (int element : array) {
            if (minElement > element) {
                minElement = element;
            }
        }

        return minElement;
    }

}
