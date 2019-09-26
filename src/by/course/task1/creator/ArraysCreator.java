package by.course.task1.creator;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class ArraysCreator {

    public static int[] createRandomArray(int size) {

        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }

    public static int[] createRandomArrayByIntStream(int size) {

        int[] array = IntStream.generate(() -> ThreadLocalRandom.current().nextInt(100)).limit(size).toArray();

        return array;
    }

}
