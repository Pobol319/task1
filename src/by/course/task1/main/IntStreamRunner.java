package by.course.task1.main;

import by.course.task1.constant.ArrayConstantsPool;
import by.course.task1.creator.ArraysCreator;
import by.course.task1.sorter.ArraysSorter;
import by.course.task1.converter.ConverterToArray;
import by.course.task1.util.ArrayUtil;


import java.util.Arrays;
import java.util.stream.IntStream;

public class IntStreamRunner {
    public static void main(String[] args) {

        final IntStream intStream = ArraysCreator.createRandomIntStream(ArrayConstantsPool.DEFAULT_ARRAY_SIZE);

        int[] array = ConverterToArray.getIntArrayFromIntStream(intStream);

        System.out.println(Arrays.toString(array));

        /* Сортировка */
        System.out.println(Arrays.toString(ArraysSorter.sortByIntStream(array)));

        /*Поиск min*/
        System.out.println(ArrayUtil.minElementByIntStream(array));

        /*Поиск max*/
        System.out.println(ArrayUtil.maxElementByIntStream(array));

        /*Поиск среденего*/
        System.out.println(ArrayUtil.elementsAverageByIntStream(array));

        /*Поиск суммы*/
        System.out.println(ArrayUtil.elementsSumByIntStream(array));

    }
}
