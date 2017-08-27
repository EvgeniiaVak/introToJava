package chapter07;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 numbers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("the gcd is " + gcd(numbers));
    }

    public static int gcd(int... numbers) {
        int gcd = 1;
        int min = findMin(numbers);

        // start with min number and check if it or something smaller is gcd
        for (int i = min; i > 1; i--) {
            if (dividesAll(i, numbers)) {
                gcd = i;
                break;
            }
        }

        return gcd;
    }

    public static boolean dividesAll(int divider, int... numbers) {
        for (int number : numbers) {
            if (!(number % divider == 0))
                return false;
        }
        return true;
    }

    public static int findMin(int... numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        return min;
    }
}
