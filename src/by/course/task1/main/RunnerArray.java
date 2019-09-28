package by.course.task1.main;

import by.course.task1.creator.ArraysCreator;
import by.course.task1.sorter.ArraysSorter;
import by.course.task1.util.UtilArray;

import java.util.Arrays;

public class RunnerArray {

    public static void main(String[] args) {

        int size = 10;
        int[] array = ArraysCreator.createRandomArray(size);

        /* Сортировка */
        System.out.println(Arrays.toString(ArraysSorter.bubbleSort(array)));
        System.out.println(Arrays.toString(ArraysSorter.insertionSort(array)));
        System.out.println(Arrays.toString(ArraysSorter.selectionSort(array)));

        /* Поиск мин и макс значения */
        System.out.println("Min element: " + UtilArray.minElement(array));
        System.out.println("Max element: " + UtilArray.maxElement(array));

        /* Поиск суммы и среднего значения */
        System.out.println("AVG: " + UtilArray.elementsAverage(array));
        System.out.println("Sum: " + UtilArray.elementsSum(array));

        /* Замена элементов по условию*/
        System.out.println(Arrays.toString(UtilArray.replacementElementsLessThan(50, array)));


    }

}
