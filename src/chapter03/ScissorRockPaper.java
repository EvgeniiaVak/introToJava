package chapter03;

/*
* (Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that plays the
* scissor-rock-paper game. Revise the program to let the user continuously play
* until either the user or the computer wins more than two times than its opponent.
* */

import java.util.Scanner;

public class ScissorRockPaper {
    private int computerWeapon, playerWeapon = 0;

    public static void main(String[] args) {
        ScissorRockPaper game = new ScissorRockPaper();
        game.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int computerScore = 0;
        int playerScore = 0;

        do {
            System.out.println(computerScore - playerScore);
            System.out.println(Math.abs(computerScore - playerScore));

            computerWeapon = generateComputerGuess();

            System.out.printf("Pick your weapon:%nscissor (0), rock (1), paper (2):%n");
            playerWeapon = scanner.nextInt();

            //make sure user puts in valid choice
            if (playerWeapon > 2 || playerWeapon < 0) {
                System.out.println("There is no such weapon! YOU LOSE!");
                return;
            }

            //the game logic
            if (playerWeapon == computerWeapon) {
                printResult("It's a draw.");

                //you win if:
            } else if (((playerWeapon == 0 && computerWeapon == 2)//you're scissor and computer is paper
                    ||
                    playerWeapon > computerWeapon) // or when in general your weapon number is larger then computer's
                    &&
                    !(playerWeapon == 2 && computerWeapon == 0)// but not when your paper and computer is scissor
                    ) {
                printResult("You win!!!");
                playerScore++;
            } else {
                printResult("You lose!!!");
                computerScore++;
            }
        } while (Math.abs(computerScore - playerScore) <= 2);
    }

    private void printResult(String result) {
        System.out.printf("The computer is %s. You are %s. %s%n",
                getWeaponName(computerWeapon),
                getWeaponName(playerWeapon),
                result);
    }

    private int generateComputerGuess() {
        return (int) (Math.random() * 3);
    }

    private String getWeaponName (int weaponId) {
        switch (weaponId) {
            case 0:
                return "scissor";
            case 1:
                return "rock";
            case 2:
                return "paper";
            default:
                return "... There is no such weapon! YOU LOSE!";

        }
    }
}
