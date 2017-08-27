package chapter05;

public class Combinations {

    public static void main(String[] args) {

        int totalCombinations = 0;
        for (int fistDigit = 1; fistDigit < 8; fistDigit++) {
            for (int secondDigit = fistDigit; secondDigit < 8; secondDigit++) {
                if (secondDigit != fistDigit) {
                    totalCombinations++;
                    System.out.println(fistDigit + " " + secondDigit);
                }
            }
        }

        System.out.println("Total combinations: " + totalCombinations);
    }
}
