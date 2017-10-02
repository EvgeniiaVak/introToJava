package chapter13.exercise16;

import chapter13.exercise15.BigRational;

import java.util.Scanner;

public class RationalCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter an expression: (e.g. 3/4 - 6/7)");
            String[] elements = scanner.nextLine().split("\\s");

            if (elements[0].equals("/quit"))
                break;

            if (elements.length != 3) {
                System.out.println("incorrect input");
                continue;
            }

            String aString = elements[0], bString = elements[2];
            char operator = elements[1].charAt(0);

            BigRational a = new BigRational(aString.split("/"));
            BigRational b = new BigRational(bString.split("/"));

            switch (operator) {
                case '+':
                    System.out.println(a.add(b));
                    break;
                case '-':
                    System.out.println(a.subtract(b));
                    break;
                case '*':
                    System.out.println(a.multiply(b));
                    break;
                case '/':
                    System.out.println(a.divide(b));
                    break;

                default:
                    System.out.println("unknown operation");

            }
        }
    }


}
