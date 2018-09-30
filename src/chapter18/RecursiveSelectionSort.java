package chapter18;

import java.util.Arrays;

public class RecursiveSelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{2, 9, 5, 4, 8, 1, 6};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void sort(int... array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int begin, int end) {

        if (begin >= end)
            return;

        int min = array[begin];
        int indexOfMin = begin;

        for (int i = begin + 1; i <= end; i++) {
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }
        }

        array[indexOfMin] = array[begin];
        array[begin] = min;

        sort(array, begin + 1, end);
    }
}
