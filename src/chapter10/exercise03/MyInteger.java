package chapter10.exercise03;

import chapter05.PrimeNumbers;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static int parseInt(String number) {
        if (number.startsWith("-"))
            return - parseInt(number.toCharArray());
        else
            return parseInt(number.toCharArray());
    }

    public static int parseInt(char[] digits) {
        int result = 0;
        for (int i = 0; i < digits.length; i++) {
            if (Character.isDigit(digits[i])) {
                result *= 10;
                result += digits[i] - '0';
            }
        }

        return result;
    }

    public boolean equals(MyInteger myInteger) {
        return equals(myInteger.getValue());
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isPrime(MyInteger myInteger) {
        return isPrime(myInteger.getValue());
    }

    public static boolean isPrime(int value) {
        return PrimeNumbers.isPrime(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public static boolean isOdd(MyInteger myInteger) {
        return isOdd(myInteger.getValue());
    }

    public static boolean isOdd(int value) {
        return !isEven(value);
    }

    public boolean isEven() {
        return isEven(value);
    }

    public static boolean isEven(MyInteger myInteger) {
        return isEven(myInteger.getValue());
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }
}
