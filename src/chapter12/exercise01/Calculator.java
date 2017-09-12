package chapter12.exercise01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter expression with integers");

        String aString = scanner.next();
        if (!isInteger(aString)) {
            System.out.println("invalid input");
            System.exit(1);
        }
        int a = Integer.parseInt(aString);

        char operator = scanner.next().charAt(0);

        String bString = scanner.next();
        if (!isInteger(bString)) {
            System.out.println("invalid input");
            System.exit(2);
        }
        int b = Integer.parseInt(bString);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println((double) a / b);
                break;

            default:
                System.out.println("unknown operation");

        }
    }

    private static boolean isInteger(String input) {
        char[] array = input.toCharArray();
        for (char digit : array) {
            if (!Character.isDigit(digit))
                return false;
        }
        return true;
    }
}
