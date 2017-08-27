package chapter03;

/*
*
* (Game: lottery) Revise Listing 3.9, Lottery.java, to generate a lottery of a three- digit number.
* The program prompts the user to enter a three-digit number and determines whether the user
* wins according to the following rules:
* 1. If the user input matches the lottery number in the exact order, the award is $10,000.
* 2. If all the digits in the user input match all the digits in the lottery number, the award is $3,000.
* 3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
*
*
* */


import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
    private int winningNumber, guess, award;

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        lottery.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        //generate winning number
        winningNumber = (int) ((Math.random() * 900) + 100);
        //System.out.println("DEBUG: winningNumber = " + winningNumber);

        //ask for a guess
        System.out.println("Enter a three digit number:");
        guess = scanner.nextInt();

        //decide the award
        if (winningNumber == guess) {
            award = 10000;
        } else if (countDigitsMatch(winningNumber, guess) == 3) {
            award = 3000;
        } else if (countDigitsMatch(winningNumber, guess) >= 1) {
            award = 1000;
        }
        System.out.println("Your award is $" + award);
    }

    private int countDigitsMatch (int winningNumber, int guess) {
        int result = 0;
        int[] winningDigits = getDigitsFromNumber(winningNumber);
        int[] guessDigits = getDigitsFromNumber(guess);

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (winningDigits[i] == guessDigits[j]) {
                    result++;
                    winningDigits[i] = -1;
                    guessDigits[j] = -2;
                    break;
                }

            }
        }
        return result;
    }

    private int[] getDigitsFromNumber(int number) {
        int[] result = new int[3];
        if (number == 0)
            return result;
        else if (number < 10){
            result[2] = number;
            return result;
        }

        result[0] = (number / 100) % 10;
        result[1] = (number / 10) % 10;
        result[2] = number % 10;
        return result;
    }

}
