package chapter12.exercise01;

import java.util.Scanner;

public class CalculatorWithExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter expression with integers");

        try {
            String aString = scanner.next();
            int a = Integer.parseInt(aString);

            char operator = scanner.next().charAt(0);

            String bString = scanner.next();
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
        } catch (NumberFormatException e) {
            System.out.println("invalid input");
        }

    }
}
