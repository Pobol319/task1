package by.course.task1.creator;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class ArraysCreator {
    private static int BOUND = 100;

    public static int[] createRandomArray(int size) {

        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(BOUND);
        }
        return arr;
    }

    public static IntStream createRandomIntStream(int size) {
        return IntStream.generate(() -> ThreadLocalRandom.current().nextInt(BOUND)).limit(size);
    }

}
