package arrays;

public class SortArray {

    public static int[] bubbleSort(int[] arr) {

        int size = arr.length;
        int element;

        for (int i = 0; i < size; ) {
            if (i == 0 || arr[i - 1] <= arr[i]) {
                i++;
            } else {
                element = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = element;

                i--;

            }
        }

        return arr;
    }


}
