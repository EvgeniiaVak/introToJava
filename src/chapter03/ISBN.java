package chapter03;

import java.util.Scanner;

/**
 * Created by evgeniyavakarina on 7/19/17.
 *
 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
 * consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
 * which is calculated from the other nine digits using the following formula:
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
 * Write a program that prompts the user to enter the first 9 digits and displays the 10-digit
 * ISBN (including leading zeros). Your program should read the input as an integer.
 */
public class ISBN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first 9 digits: ");
        int input = scanner.nextInt();
        System.out.println(input);

        int checksum = 0;
        String output = "";

        //loop through all the digits
        for (int place = 1, currentDigit, divisor = 100000000;
             place < 10;
             place++, divisor /= 10)
        {
            // current digit is
            currentDigit = (input / divisor) % 10;

            // output
            output += currentDigit;
            checksum += currentDigit * place;
        }

        //solve for the tenth number
        checksum %= 11;

        //if it's 10 replace it with X and add to the output
        output += "-" + ((checksum == 10) ? "X" : checksum);

        System.out.println(output);
    }
}
