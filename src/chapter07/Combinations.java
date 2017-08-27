package chapter07;

import java.util.Arrays;

public class Combinations {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5, 4, 5, 7, 8, 5, 10};//new int[10];


//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                System.out.printf("%2d and %2d%n", numbers[i], numbers[j]);
//            }
//        }
//
//        System.out.println(isConsecutiveFour(numbers));

        int[] a = {1, 5, 16, 61, 111};
        int[] b = {2, 4, 5, 6};

        System.out.println(Arrays.toString(merge(a, b)));
        System.out.println(Arrays.toString(merge2(a, b)));
    }

    public static boolean isConsecutiveFour(int[] values) {
        int sum = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i - 1] == values[i]) {
                sum++;
            } else {
                sum = 0;
            }
            if (sum >= 3) {
                return true;
            }
        }
        return false;
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] newList = new int[list1.length + list2.length];

        int count1 = 0;
        int count2 = 0;
        int countNew = 0;

        int sumCompareTo = 0;
        for (int i = 0; i < newList.length; i++) {
            int a = list1[count1];
            int b = list2[count2];

            if (a < b) {
                newList[i] = a;
                count1++;
                sumCompareTo++;
            } else {
                newList[i] = b;
                count2++;
                sumCompareTo++;
            }

            countNew++;
            if (count1 == list1.length || count2 == list2.length)
                break;
        }

        if (count1 == list1.length) {
            for (int i = countNew; i < newList.length; i++) {
                newList[i] = list2[count2];
                count2++;
            }
        } else if (count2 == list2.length) {
            for (int i = countNew; i < newList.length; i++) {
                newList[i] = list1[count1];
                count1++;
            }
        }

        System.out.printf("Compare to was %d times%n", sumCompareTo);
        return newList;
    }

    /** merge merges two sorted lists into a new sorted list.*/
    public static int[] merge2(int[] list1, int[] list2)  {
        int[] list3 = new int[list1.length + list2.length];

        for (int i = 0; i < list1.length; i++)
            list3[i] = list1[i];

        for (int i = 0, j = list1.length; i < list2.length; i++, j++) {
            list3[j] = list2[i];
        }

        sort(list3);

        return list3;
    }

    /** sort sorts a list in accending order*/
    public static void sort(int[] list) {
        int numberOfCompareTo = 0;
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                numberOfCompareTo++;
                if (list[j] < min) {
                    min = list[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }

        System.out.println("Number of compare to in merge2 was " + numberOfCompareTo);
    }

}
