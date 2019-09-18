package by.course.lab.task1.arrays.util;

public class AvgSumElementsOfArray {

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

}
