package arrays;

import java.util.Arrays;
import java.util.Random;

public class Array {

    public static void main(String[] args) {

        int size = 5;

        int[] array = CreateArray.randomCrete(size);
        SortArray.bubbleSort(array);

        System.out.println(Arrays.toString(array));


        /*
        int a1 = 5;
        int a2 = 5;
        int num[][] = new int[a1][a2];
        Random random = new Random();


        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < a2; j++) {
                num[i][j] = random.nextInt(50);
            }
        }


        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < a2; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println(" ");

        int c = num.length;
        for (int j = 0; j < c; j++) {
            int i = 1;
            while (i < c) {
                if (i == 0 || num[i - 1][j] <= num[i][j]) {
                    i++;
                } else {
                    int b = num[i][j];
                    num[i][j] = num[i - 1][j];
                    num[i - 1][j] = b;
                    i--;
                }

            }
        }
        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < a2; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        */

    }

}
