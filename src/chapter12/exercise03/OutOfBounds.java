package chapter12.exercise03;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class OutOfBounds {
    public static void main(String[] args) {
        //create an array with 100 randomly chosen integers
        Random random = new Random();
        int[] randomInts = new int[100];
        for (int i = 0; i < randomInts.length; i++) {
            randomInts[i] = random.nextInt();
        }

        //prompt the user to enter the index of the array
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the index of the array: ");

        try {
            //displays the corresponding element value
            int index = scanner.nextInt();

            System.out.println("The element is " + randomInts[index]);

        } catch (InputMismatchException e) {
            System.out.println("invalid input, index is an integer");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("there is no such index as " + e.getMessage());
        }
    }
}
