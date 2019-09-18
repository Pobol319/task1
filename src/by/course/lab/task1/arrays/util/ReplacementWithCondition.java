package by.course.lab.task1.arrays.util;

public class ReplacementWithCondition {

    public static int[] replacementElementsLessThan(int element, int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (arr[i] < element) {
                arr[i] = element;
            }
        }

        return arr;
    }

}
