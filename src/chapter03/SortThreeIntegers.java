package chapter03;

import javax.swing.*;

/**
 * Created by evgeniyavakarina on 7/19/17.
 *
 * (Sort three integers) Write a program that sorts three integers.
 * The integers are entered from the input dialogs and stored in variables num1, num2, and num3, respectively.
 * The program sorts the numbers so that num1 <= num2 <= num3.
 */
public class SortThreeIntegers {

    public static void main(String[] args) {
        SortThreeIntegers sortThreeIntegers = new SortThreeIntegers();

        sortThreeIntegers.run();
    }

    private void run() {
        int num1 = requestForAnInteger();
        int num2 = requestForAnInteger();
        int num3 = requestForAnInteger();

        int term = (num1 > num2) ? num1 : num2;
        num1 = (num1 < num2) ? num1 : num2;
        num2 = term;

        term = (num2 > num3) ? num2 : num3;
        num2 = (num2 < num3) ? num2 : num3;
        num3 = term;

        term = (num1 > num2) ? num1 : num2;
        num1 = (num1 < num2) ? num1 : num2;
        num2 = term;

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }

    private int requestForAnInteger() {
        String resultString = JOptionPane.showInputDialog("Please enter a number: ");
        return Integer.parseInt(resultString);
    }

}
