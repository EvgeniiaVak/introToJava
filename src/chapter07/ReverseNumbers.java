package chapter07;

import java.util.Arrays;

public class ReverseNumbers {

    public static void main(String[] args) {
        //test
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(array));
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            SelectionSort.swapElements(array, i, j);
        }
    }
}
