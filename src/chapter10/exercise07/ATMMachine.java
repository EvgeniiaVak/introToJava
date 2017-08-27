package chapter10.exercise07;

import chapter09.exercise_07.Account;

import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] actions = {
                "check balance",
                "withdraw",
                "deposit",
                "exit"
        };

        // Create ten accounts
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            //with id 0, 1, . . . , 9, and initial balance $100
            accounts[i] = new Account(i, 100);
        }


        while (true) {
            //prompt the user to enter an id
            int id = -1;

            while (!isValid(id, 0, 9)) {
                System.out.println("Enter an id: (from 0 to 9)");
                id = scanner.nextInt();
            }

            while (true) {
                int choice = promptForAction(scanner, actions);

                if (choice == 1) { // "check balance"
                    System.out.println("The balance is " + accounts[id].getBalance());

                } else if (choice == 2) { // "withdraw"
                    System.out.println("Enter an amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    accounts[id].withdraw(amount);

                } else if (choice == 3) { // "deposit"
                    System.out.print("Enter an amount to deposit: ");
                    double amountToDeposit = scanner.nextDouble();
                    accounts[id].deposit(amountToDeposit);

                } else if (choice == 4) { // "exit"
                    break;
                }
            }

        }
    }

    private static int promptForAction(Scanner scanner, String... options) {
        while (true) {
            showMenu(options);
            System.out.print("Enter a choice:");
            int input = scanner.nextInt();

            if (isValid(input, 1, options.length)) {
                return input;
            }
        }
    }

    private static void showMenu(String... options) {
        System.out.println("\n");
        System.out.println("Main menu");

        for (int i = 0; i < options.length; i++) {
            System.out.printf("%d: %s%n", i + 1, options[i]);
        }
    }

    private static boolean isValid(int input, int... range) {
        if (input >= range[0] && input <= range[1])
            return true;
        else
            return false;
    }
}
