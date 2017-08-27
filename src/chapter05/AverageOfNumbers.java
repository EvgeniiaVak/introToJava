package chapter05;

/*
* (Count positive and negative numbers and compute the average of numbers) Write a program
* that reads an unspecified number of integers, determines how many positive and negative
* values have been read, and computes the total and average of the input values (not counting
* zeros). Your program ends with the input 0. Display the average as a floating-point number.
*
* Enter an integer, the input ends if it is 0: 1 2 -1 3 0
* The number of positives is 3
* The number of negatives is 1
* The total is 5.0
* The average is 1.25
* Enter an integer, the input ends if it is 0: 0
* No numbers are entered except 0
* */

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int counter = 0;
        int positives = 0;
        int negatives = 0;

        //ask for integers
        System.out.println("Enter an integer, the input ends if it is 0:");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) break;

            if (input > 0) positives++;
            else negatives++;

            sum += input;
            counter++;
        }

        //check if there were any integers except 0
        if (sum == 0) {
            System.out.println("No numbers are entered except 0");
            System.exit(0);
        }

        //compute the average
        double average = sum / counter;

        //output results
        System.out.printf("The number of positives is %d%n", positives);
        System.out.printf("The number of negatives is %d%n", negatives);
        System.out.printf("The total is %.2f%n", sum);
        System.out.printf("The average is %.2f%n", average);
    }
}
