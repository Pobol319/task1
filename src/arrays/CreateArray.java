package arrays;

import java.util.Random;

public class CreateArray {

    public static int[] randomCrete(int size) {
        Random random = new Random();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }

}
