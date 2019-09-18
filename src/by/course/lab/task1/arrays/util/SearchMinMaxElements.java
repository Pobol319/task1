package by.course.lab.task1.arrays.util;

public class SearchMinMaxElements {

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
