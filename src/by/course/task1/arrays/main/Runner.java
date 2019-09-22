package by.course.task1.arrays.main;


import by.course.task1.arrays.creator.ArraysCreator;
import by.course.task1.arrays.sorter.SortArray;
import by.course.task1.arrays.util.Util;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        int size = 10;
        int[] array = ArraysCreator.createRandomArray(size);

        /* Сортировка */
        System.out.println(Arrays.toString(SortArray.bubbleSort(array)));

        /* Поиск мин и макс значения */
        System.out.println("Мин. элемент: " + Util.minElement(array));
        System.out.println("Макс. элемент: " + Util.maxElement(array));

        /* Поиск суммы и среднего значения */
        System.out.println("AVG: " + Util.elementsAverage(array));
        System.out.println("Sum: " + Util.elementsSum(array));

        /* Замена элементов по условию*/
        System.out.println(Arrays.toString(Util.replacementElementsLessThan(50, array)));


    }

}
