package by.course.task1.main;

import by.course.task1.constant.ArrayConstantsPool;
import by.course.task1.creator.ArraysCreator;
import by.course.task1.sorter.ArraysSorter;
import by.course.task1.util.ArrayUtil;

import java.util.Arrays;

public class ArrayRunner {

    public static void main(String[] args) {

        int[] array = ArraysCreator.createRandomArray(ArrayConstantsPool.DEFAULT_ARRAY_SIZE);

        /* Сортировка */
        System.out.println(Arrays.toString(ArraysSorter.bubbleSort(array)));
        System.out.println(Arrays.toString(ArraysSorter.insertionSort(array)));
        System.out.println(Arrays.toString(ArraysSorter.selectionSort(array)));

        /* Поиск мин и макс значения */
        System.out.println("Min element: " + ArrayUtil.minElement(array));
        System.out.println("Max element: " + ArrayUtil.maxElement(array));

        /* Поиск суммы и среднего значения */
        System.out.println("AVG: " + ArrayUtil.elementsAverage(array));
        System.out.println("Sum: " + ArrayUtil.elementsSum(array));

        /* Замена элементов по условию*/
        System.out.println(Arrays.toString(ArrayUtil.replacementElementsLessThan(50, array)));
    }

}
