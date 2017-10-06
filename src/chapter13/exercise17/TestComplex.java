package chapter13.exercise17;

import java.util.Scanner;

public class TestComplex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first complex number:");
        Complex first = new Complex(scanner.nextDouble(), scanner.nextDouble());
//        Complex first = new Complex(3.5, 5.5);
        System.out.println("Enter the second complex number:");
        Complex second = new Complex(scanner.nextDouble(), scanner.nextDouble());
//        Complex second = new Complex(-3.5, 1);

        System.out.printf("(%s) + (%s) = %s%n", first, second, first.add(second));
        System.out.printf("(%s) - (%s) = %s%n", first, second, first.subtract(second));
        System.out.printf("(%s) * (%s) = %s%n", first, second, first.multiply(second));
        System.out.printf("(%s) / (%s) = %s%n", first, second, first.divide(second));
        System.out.printf("|%s| = %f", first, first.abs());
    }
}
