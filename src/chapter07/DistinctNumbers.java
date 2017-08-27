package chapter07;

/*
* (Print distinct numbers) Write a program that reads in ten numbers and displays
* the number of distinct numbers and the distinct numbers separated by exactly
* one space (i.e., if a number appears multiple times, it is displayed only once).
* (Hint: Read a number and store it to an array if it is new. If the number is already
* in the array, ignore it.) After the input, the array contains the distinct numbers.
* */

import java.util.Arrays;
import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        int[] distinctNumbers = new int[10];

        int distinctCount = 0;
        for (int i = 0; i < distinctNumbers.length; i++) {
            int number = scanner.nextInt();
            if (isDistinct(number, distinctNumbers)) {
                distinctNumbers[distinctCount] = number;
                distinctCount++;
            }
        }

        int[] purifiedDistinctNumbers = Arrays.copyOf(distinctNumbers, distinctCount);
        System.out.println("The number of distinct number is " + purifiedDistinctNumbers.length);
        System.out.println("The distinct numbers are: " + Arrays.toString(purifiedDistinctNumbers));
    }

    public static boolean isDistinct(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                return false;
        }
        return true;
    }
}
