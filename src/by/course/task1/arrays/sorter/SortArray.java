package by.course.task1.arrays.sorter;

public class SortArray {

    public static int[] bubbleSort(int[] array) {

        int size = array.length;
        int element;

        for (int i = 0; i < size; ) {
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


}
