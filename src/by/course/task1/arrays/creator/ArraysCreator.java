package by.course.task1.arrays.creator;

import java.util.Random;

public class ArraysCreator {

    public static int[] createRandomArray(int size) {
        Random random = new Random();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }

}
