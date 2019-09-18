package arrays;

import java.util.Arrays;
import java.util.Random;

public class Array {

    public static void main(String[] args) {

        int size = 10;
        int[] array = CreateArray.randomCrete(size);

        /* Сортировка */
        System.out.println(Arrays.toString(SortArray.bubbleSort(array)));

        /* Поиск мин и макс значения */
        System.out.println("Мин. элемент: " + SearchMinMaxElements.searchMinElement(array));
        System.out.println("Макс. элемент: " + SearchMinMaxElements.searchMaxElement(array));

        /* Поиск суммы и среднего значения */
        System.out.println("AVG: " + AvgSumElementsOfArray.avgElementsArray(array));
        System.out.println("Sum: " + AvgSumElementsOfArray.sumElementsArray(array));

        /* Замена элементов по условию*/
        System.out.println(Arrays.toString(ReplacementWithCondition.replacementElementsLessThen(50, array)));


    }

}
