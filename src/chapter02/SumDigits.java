package chapter02;

import javax.swing.*;

/**
 * Created by evgeniyavakarina on 7/16/17.
 *
 * (Sum the digits in an integer) Write a program that reads an integer between 0 and 1000
 * and adds all the digits in the integer. For example, if an integer is 932,
 * the sum of all its digits is 14.
 */
public class SumDigits {
    public static void main (String[] args) {
        String inputString = JOptionPane.showInputDialog(
                null,
                "Enter an integer between 0 and 1000",
                "Sum digits in a number",
                JOptionPane.QUESTION_MESSAGE
        );

        int input = Integer.parseInt(inputString);
        int sum = 0;

        while (input > sum) {
            sum += input%10;
            input /= 10;
        }
        sum += input%10;

        JOptionPane.showMessageDialog(null, String.valueOf(sum));

    }
}
