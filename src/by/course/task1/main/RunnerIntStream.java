package by.course.task1.main;

import by.course.task1.creator.ArraysCreator;
import by.course.task1.sorter.SortArray;
import by.course.task1.util.UtilArray;


import java.util.Arrays;
import java.util.stream.IntStream;

public class RunnerIntStream {
    public static void main(String[] args) {

        int size = 10;

        int[] array = ArraysCreator.createRandomArrayByIntStream(size);

        System.out.println(Arrays.toString(array));

        /* Сортировка */
        System.out.println(Arrays.toString(SortArray.sortByIntStream(array)));

        /*Поиск min*/
        System.out.println(UtilArray.minElementByIntStream(array));

        /*Поиск max*/
        System.out.println(UtilArray.maxElementByIntStream(array));

        /*Поиск среденего*/
        System.out.println(UtilArray.elementsAverageByIntStream(array));

        /*Поиск суммы*/
        System.out.println(UtilArray.elementsSumByIntStream(array));

        /*Поиск по условию*/
        System.out.println(UtilArray.containElement(array, 54));


    }
}
