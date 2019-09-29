package by.course.task1.creator;

import by.course.task1.constant.ArrayConstantsPool;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class ArraysCreator {

    public static int[] createRandomArray(final int size) {

        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(ArrayConstantsPool.DEFAULT_RANDOM_VALUE_BOUND);
        }
        return array;
    }

    public static IntStream createRandomIntStream(final int size) {
        return IntStream.generate(() -> ThreadLocalRandom.current().nextInt(ArrayConstantsPool.DEFAULT_RANDOM_VALUE_BOUND)).limit(size);
    }

}
