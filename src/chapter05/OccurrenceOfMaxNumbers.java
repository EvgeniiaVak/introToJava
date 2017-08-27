package chapter05;

/*
* (Occurrence of max numbers) Write a program that reads integers, finds the largest
* of them, and counts its occurrences. Assume that the input ends with number 0.
* Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest is 5 and the
* occurrence count for 5 is 4.
* */

import java.util.Scanner;

public class OccurrenceOfMaxNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = -1;

        int max = 0;
        int maxCount = 0;

        System.out.println("Enter integers: (finish with 0)");
        while (input != 0) {

            input = scanner.nextInt();

            if (input > max) {
                maxCount = 1;
                max = input;
            } else if (input == max) {
                maxCount++;
            }
        }

        System.out.println("The maximum number was " + max);
        System.out.println("It occurred " + maxCount + " time(s).");
    }
}
