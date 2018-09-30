package chapter18;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{2, 9, 5, 4, 8, 1, 6};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void sort(int... array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = findMinIndex(Arrays.copyOfRange(array, i, array.length));
            swap(array, i, minIndex);
        }
    }

    private static int findMinIndex(int... array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[result]) {
                result = i;
            }
        }
        return 0;
    }

    private static void swap(int[] array, int indexA, int indexB){
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }
}
