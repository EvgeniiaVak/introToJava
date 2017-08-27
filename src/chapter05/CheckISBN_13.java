package chapter05;

import java.util.Scanner;

public class CheckISBN_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string:");
        String input = scanner.next();

        int sum = 0;
        if (input.length() != 12) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        for (int i = 0; i < input.length(); i++) {
            int digit = Integer.parseInt("" + input.charAt(i));
            if (i % 2 == 1) {
                digit *= 3;
            }
            sum += digit;
        }

        int number = 10 - sum % 10;
        number = (number == 10) ? 0 : number;
        System.out.println("The ISBN-13 number is " + input + number);
        char a = 'a';

    }
}
