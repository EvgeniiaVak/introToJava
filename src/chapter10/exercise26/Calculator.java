package chapter10.exercise26;

/*
* (Calculator) Revise Listing 7.9, Calculator.java, to accept an expression as a string in
* which the operands and operator are separated by zero or more spaces. For example, 3+4 and
* 3 + 4 are acceptable expressions.
* */

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    private static int[] operands;
    private static char operator;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression:");
        String expression = scanner.nextLine();

        String[] operandsString = expression.split("([\\D\\s])+");
        operands = new int[operandsString.length];

        for (int i = 0; i < operands.length; i++) {
            operands[i] = Integer.parseInt(operandsString[i]);
        }

        String[] op = expression.split("([^-+*/])+", 2);
        operator = op[1].charAt(0);

        switch (operator) {
            case '+':
                System.out.println(operands[0] + operands[1]);
                break;
            case '-':
                System.out.println(operands[0] - operands[1]);
                break;
            case '*':
                System.out.println(operands[0] * operands[1]);
                break;
            case '/':
                System.out.println((double)operands[0] / operands[1]);
                break;

            default:
                System.out.println("unknown operation");

        }
    }
}
