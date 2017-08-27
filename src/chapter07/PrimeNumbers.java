package chapter07;

/*
* Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a num- ber n
* is prime by checking whether 2, 3, 4, 5, 6, ..., n/2 is a divisor. If a divisor is found, n is not prime.
*
* A more efficient approach is to check whether any of the prime numbers
* less than or equal to Math.sqrt(n) can divide n evenly. If not, n is prime.
*
* Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
* You need to use an array to store the prime numbers and later use them to check whether
* they are possible divisors for n.
* */

public class PrimeNumbers {

    public static void main(String[] args) {
        int[] primeNumbers = new int[50];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;

        int number = 4;
        int index = 2;
        while (primeNumbers[primeNumbers.length - 1] == 0) {
            if (isPrime(number, primeNumbers)) {
                primeNumbers[index] = number;
                index++;
            }
            number++;
        }

        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.printf("%-4d", primeNumbers[i]);
            if ((i + 1) % 10 == 0)
                System.out.println();
        }
    }


    public static boolean isPrime (int number, int... primeNumbersArray){
        int index = 0;
        while (primeNumbersArray[index] <= Math.sqrt(number)) {
            if (number % primeNumbersArray[index] == 0) {
                return false;
            }
            index++;
        }
        return true;
    }
}
