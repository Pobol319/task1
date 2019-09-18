package workWithArray;

public class AvgSumElementsOfArray {

    public static double avgElementsArray(int[] arr) {
        int size = arr.length;
        double avg = 0;

        for (int element : arr) {
            avg = avg + element;
        }

        return avg / size;
    }

    public static int sumElementsArray(int[] arr) {
        int sum = 0;

        for (int element : arr) {
            sum = sum + element;
        }

        return sum;
    }

}
