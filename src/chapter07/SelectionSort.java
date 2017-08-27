package chapter07;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String x[]) {
//        //test sortArray
//        double[] array = {1, 12, 2, 19, 14, 3, 4, 7, 25, 8, 10};
//        System.out.println(Arrays.toString(array));
//        sortArrayAscending(array);
//        System.out.println(Arrays.toString(array));
//        sortArrayDescending(array);
//        System.out.println(Arrays.toString(array));

//        int[] list1 = {2, 4, 7, 10};
//        int[] list2 = {2, 4, 7, 7, 7, 10};
//        java.util.Arrays.fill(list1, 5); // Fill 5 to the whole array
//        java.util.Arrays.fill(list2, 1, 5, 8); // Fill 8 to a partial array
//        System.out.println(Arrays.toString(list1));
//        System.out.println(Arrays.toString(list2));
//        Arrays.sort();

//
//        int[] list1 = {2, 4, 7, 10};
//        java.util.Arrays.fill(list1, 7);
//        System.out.println(java.util.Arrays.toString(list1));
//        int[] list2 = {2, 4, 7, 10};
//        System.out.println(java.util.Arrays.toString(list2));
//        System.out.print(java.util.Arrays.equals(list1, list2));

        int[] array = {1, 12, 2, 19, 14, 3, 4, 7, 25, 8, 10};
        sortArrayAscendingFromEnd(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortArrayDescending(int[] array) {
        //look through all the array
        for (int i = 0; i < array.length - 1; i++) {

            //search for biggest value in rest of the array
            int biggestElementIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[biggestElementIndex])
                    biggestElementIndex = j;
            }

            //after finding such value swap it with next place
            swapElements(array, i, biggestElementIndex);
        }
    }

    public static void sortArrayAscending(int[] array) {

        //look through all the array
        for (int i = 0; i < array.length - 1; i++) {

            //search for smallest value in rest of the array
            int smallestElementIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallestElementIndex])
                    smallestElementIndex = j;
            }

            //after finding such value swap it with next place
            swapElements(array, i, smallestElementIndex);
        }
    }


//    (Revise selection sort) In Section 7.11, you used selection sort to sort an array. The selection-sort method
// repeatedly finds the smallest number in the current array and swaps it with the first. Rewrite this program by
// finding the largest number and swapping it with the last. Write a test program that reads in ten double numbers,
// invokes the method, and displays the sorted numbers.
    public static void sortArrayAscendingFromEnd(int[] array) {
        for (int i = array.length - 1; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[i]) {
                    swapElements(array, i, j);
                }
            }
        }
    }

    public static void swapElements (int[] array, int i, int j) {
        if (i == j) return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
