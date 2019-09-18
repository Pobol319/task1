package arrays;

public class ReplacementWithCondition {

    public static int[] replacementElementsLessThen(int element, int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (arr[i] < element) {
                arr[i] = element;
            }
        }

        return arr;
    }

}
