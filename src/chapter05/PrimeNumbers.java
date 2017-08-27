package chapter05;

/*
* (Display prime numbers between 2 and 1,000) Modify Listing 5.15 to display all
* the prime numbers between 2 and 1,000, inclusive. Display eight prime numbers
* per line. Numbers are separated by exactly one space.
* */

public class PrimeNumbers {

    public static void main(String[] args) {
        int counter = 0;
        for (int i = 2; i < 1000; i++) {
            if (isPrime(i)) {
                counter++;
                System.out.print(i + " ");
                if ((counter % 8) == 0) System.out.println();
            }
        }
    }


    public static boolean isPrime(long number) {
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
