package by.course.task1.main;

import by.course.task1.creator.ArraysCreator;
import by.course.task1.sorter.SortArray;
import by.course.task1.util.UtilArray;
import jdk.jshell.execution.Util;

import java.util.Arrays;

public class RunnerArray {

    public static void main(String[] args) {

        int size = 10;
        int[] array = ArraysCreator.createRandomArray(size);
        int[] array2 = ArraysCreator.createRandomArray(size);
        int[] array3 = ArraysCreator.createRandomArray(size);

        /* Сортировка */
        System.out.println(Arrays.toString(SortArray.bubbleSort(array)));
        System.out.println(Arrays.toString(SortArray.insertionSort(array2)));
        System.out.println(Arrays.toString(SortArray.selectionSort(array3)));

        /* Поиск мин и макс значения */
        System.out.println("Мин. элемент: " + UtilArray.minElement(array));
        System.out.println("Макс. элемент: " + UtilArray.maxElement(array));

        /* Поиск суммы и среднего значения */
        System.out.println("AVG: " + UtilArray.elementsAverage(array));
        System.out.println("Sum: " + UtilArray.elementsSum(array));

        /* Замена элементов по условию*/
        System.out.println(Arrays.toString(UtilArray.replacementElementsLessThan(50, array)));


    }

}
