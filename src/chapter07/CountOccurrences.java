package chapter07;

/*
* (Count occurrence of numbers) Write a program that reads the integers between 1 and 100
* and counts the occurrences of each. Assume the input ends with 0. Note that if a number
* occurs more than one time, the plural word “times” is used in the output.
* */

import java.util.Scanner;

public class CountOccurrences {

    public static void main(String[] args) {
        //prepare occurrences table for integers from 1 to 100
        //we also will count the zero just won't show it later
        int[] occurrences = new int[101];

        //ask for the numbers
        int[] numbers = getNumbersFromInput();

        //count the occurrences
        countOccurrences(numbers, occurrences);

        //show the numbers with their occurrences
        for (int i = 1; i < occurrences.length; i++) {
            String timeS = "time";
            if (occurrences[i] > 1) timeS += "s";
            if (occurrences[i] > 0) {
                System.out.printf("%d occurs %d %s%n", i, occurrences[i], timeS);
            }

        }
    }

    public static void countOccurrences (int[] numbers, int[] occurrences) {
        for (int i = 0; i < occurrences.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    occurrences[i]++;
                }
            }
        }
    }

    public static int[] getNumbersFromInput() {

        //ask for input that finishes with 0
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100: (indicate stop by entering 0)");
        String input = "";
        while (true) {
            input += scanner.nextLine();
            if (input.endsWith("0"))
                break;
        }

        //convert input string into array of integers
        String[] integersString = input.split("\\s+");
        int[] integers = new int[integersString.length];
        for (int i = 0; i < integersString.length; i++) {
            integers[i] = Integer.parseInt(integersString[i]);

            //validate input
            if (integers[i] > 100 || integers[i] < 0) {
                System.out.println("Invalid input");
                System.exit(1);
            }
        }

        return integers;
    }
}
