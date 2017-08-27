package chapter08;

import java.io.*;
import java.util.Scanner;

public class FinancialTsunami {

    public static void main(String[] args) throws IOException {
        File initialFile = new File("src/chapter08/banks.txt");
        InputStream stream = new FileInputStream(initialFile);
        Scanner scanner = new Scanner(stream);

        // ------- get data ----------

        System.out.println("enter number of banks: ");
        int numberOfBanks = scanner.nextInt();

        System.out.println("enter the limit: ");
        double limit = scanner.nextDouble();

        double[] balances = new double[numberOfBanks];
        double[][] borrowers = new double[numberOfBanks][numberOfBanks];

        for (int i = 0; i < numberOfBanks; i++) {
            System.out.println("enter bank balance, number of its borrowers, borrower's index, sum:");
            balances[i] = scanner.nextDouble();
            int numberOfBorrowers = scanner.nextInt();
            for (int j = 0; j < numberOfBorrowers; j++) {
                int borrowerIndex = scanner.nextInt();
                borrowers[i][borrowerIndex] = scanner.nextDouble();
            }
        }
        //------------------------------

        System.out.println("limit " + limit + ", number of banks " + numberOfBanks);

        System.out.println("banks balances:");
        for (int i = 0; i < balances.length; i++) {
            System.out.println(i + " " + balances[i]);
        }

        System.out.println("borrowers:");
        for (int i = 0; i < borrowers.length; i++) {
            for (int j = 0; j < borrowers[i].length; j++) {
                System.out.print(borrowers[i][j] + " ");
            }
            System.out.println();
        }

        //output unsafe banks
        System.out.print("unsafe banks are");
        int[] unsafeBanks = new int[numberOfBanks];
        for (int i = 0; i < numberOfBanks; i++) {
            unsafeBanks[i] = -1;
        }
        boolean needAnotherRound = false;

        do {
            needAnotherRound = false; // assume we won't find any more unsafe banks
            //check all the banks for safety
            for (int i = 0; i < numberOfBanks; i++) {
                //skip all the banks that were already marked as unsafe
                if (unsafeBanks[i] == -1) { // if the bank is not already in list of unsafe banks
                    if (totalAssets(i, balances, borrowers) < limit) {
                        unsafeBanks[i] = i;
                        dropUnsafeAssets(i, borrowers);
                        needAnotherRound = true;
                        System.out.print(" " + i);
                    }
                }
            }
        } while (needAnotherRound);

        stream.close();
    }

    private static void dropUnsafeAssets(int bank, double[][] borrowers) {
        for (int i = 0; i < borrowers.length; i++) {
            for (int j = 0; j < borrowers[i].length; j++) {
                if (j == bank)
                    borrowers[i][j] = 0;
            }
        }
    }

    private static double totalAssets(int bank, double[] balances, double[][] borrowers) {
        double assets = balances[bank];

        for (int i = 0; i < borrowers[bank].length; i++) {
            assets += borrowers[bank][i];
        }

        return assets;
    }

}
