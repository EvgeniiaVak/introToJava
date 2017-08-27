package chapter07;

import java.util.Arrays;

public class PartitionOfAList {
    public static void main(String[] args) {
        int[] list = {10, 1, 5, 16, 10, 61, 9, 11, 1};

        System.out.println("The index of pivot is " + partition(list));
        System.out.println(Arrays.toString(list));
    }

    public static int partition(int[] list) {
        int indexesOfThePivot = 0;
        int indexOfNextLarge = list.length - 1;
        int numberOfComparisons = 0;

        for (int i = 1; i < list.length; i++, numberOfComparisons++) {

            //find those numbers less than pivot
            if (list[i] <= list[indexesOfThePivot]) {
                swap(list, i, indexesOfThePivot);
                indexesOfThePivot = i;
            }
            //on encountering numbers larger than pivot
            else {
                //place them in the end of the array
                swap(list, i, indexOfNextLarge);
                indexOfNextLarge--;
                //on the next iteration we should check the same index again
                i--;
            }

            //stop if all numbers were already looked through
            if (indexesOfThePivot == indexOfNextLarge)
                break;
        }
        System.out.println("Number of comparisons is " + numberOfComparisons);
        return indexesOfThePivot;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
