package by.course.task1.sorter;

import java.util.stream.IntStream;

public class ArraysSorter {

    public static int[] bubbleSort(int[] array) {

        int element;

        for (int i = 0; i < array.length; ) {
            if (i == 0 || array[i - 1] <= array[i]) {
                i++;
            } else {
                element = array[i];
                array[i] = array[i - 1];
                array[i - 1] = element;

                i--;
            }
        }
        return array;
    }


    public static int[] insertionSort(int[] array) {

        int element;

        for (int i = 1; i < array.length; i++) {
            element = array[i];
            int j = i - 1;
            while (j >= 0 && element < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;
        }
        return array;
    }


    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }

    public static int[] sortByIntStream(int[] array) {
        return IntStream.of(array).sorted().toArray();
    }

    public static double[] bubbleSort(double[] array) {

        double element;

        for (int i = 0; i < array.length; ) {
            if (i == 0 || array[i - 1] <= array[i]) {
                i++;
            } else {
                element = array[i];
                array[i] = array[i - 1];
                array[i - 1] = element;

                i--;
            }
        }
        return array;
    }


    public static double[] insertionSort(double[] array) {

        double element;

        for (int i = 1; i < array.length; i++) {
            element = array[i];
            int j = i - 1;
            while (j >= 0 && element < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;
        }
        return array;
    }


    public static double[] selectionSort(double[] array) {
        for (int i = 0; i < array.length; i++) {
            double min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            double temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }


}
