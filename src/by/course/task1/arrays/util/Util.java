package by.course.task1.arrays.util;

public class Util {

    public static double elementsAverage(int[] arr) {
        int size = arr.length;
        double avg = 0;

        for (int element : arr) {
            avg = avg + element;
        }

        return avg / size;
    }

    public static int elementsSum(int[] arr) {
        int sum = 0;

        for (int element : arr) {
            sum = sum + element;
        }

        return sum;
    }

    public static int[] replacementElementsLessThan(int element, int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (arr[i] < element) {
                arr[i] = element;
            }
        }

        return arr;
    }

    public static int maxElement(int[] arr) {
        int size = arr.length;
        int maxElement = arr[0];

        for (int element : arr) {
            if (maxElement < element) {
                maxElement = element;
            }
        }

        return maxElement;
    }

    public static int minElement(int[] arr) {
        int size = arr.length;
        int minElement = arr[0];

        for (int element : arr) {
            if (minElement > element) {
                minElement = element;
            }
        }

        return minElement;
    }

}
