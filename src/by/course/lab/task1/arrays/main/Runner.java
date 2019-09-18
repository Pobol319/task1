package by.course.lab.task1.arrays.main;

import by.course.lab.task1.arrays.util.AvgSumElementsOfArray;
import by.course.lab.task1.arrays.creation.ArraysCreator;
import by.course.lab.task1.arrays.util.ReplacementWithCondition;
import by.course.lab.task1.arrays.util.SearchMinMaxElements;
import by.course.lab.task1.arrays.util.SortArray;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {

        int size = 10;
        int[] array = ArraysCreator.createRandomArray(size);

        /* Сортировка */
        System.out.println(Arrays.toString(SortArray.bubbleSort(array)));

        /* Поиск мин и макс значения */
        System.out.println("Мин. элемент: " + SearchMinMaxElements.minElement(array));
        System.out.println("Макс. элемент: " + SearchMinMaxElements.maxElement(array));

        /* Поиск суммы и среднего значения */
        System.out.println("AVG: " + AvgSumElementsOfArray.elementsAverage(array));
        System.out.println("Sum: " + AvgSumElementsOfArray.elementsSum(array));

        /* Замена элементов по условию*/
        System.out.println(Arrays.toString(ReplacementWithCondition.replacementElementsLessThan(50, array)));


    }

}
