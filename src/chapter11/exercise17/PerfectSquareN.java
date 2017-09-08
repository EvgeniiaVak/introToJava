package chapter11.exercise17;

import chapter05.FactorsOfInteger;
import chapter10.exercise05.StackOfIntegers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PerfectSquareN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer m: ");
        int m = scanner.nextInt();

        //Store all smallest factors of m into an array list
        ArrayList<Integer> smallestFactorsOfM = findSmallestFactors(m);

        //n is the product of the factors that appear an odd number of times in the array list
        int n = findN(smallestFactorsOfM);

        System.out.println("The smallest number n for m * n to be a perfect square is " + n);

        System.out.println("m * n is " + (m * n));
    }

    private static int findN(ArrayList<Integer> smallestFactorsOfM) {
        ArrayList<Integer> resource = new ArrayList<>(smallestFactorsOfM);
        ArrayList<Integer> oddTimesAppearedSmallFactors = new ArrayList<>();

        for (Integer smallFactor : smallestFactorsOfM) {
            int appeared = 0;

            while (resource.contains(smallFactor)) {
                appeared++;
                resource.remove(smallFactor);
            }

            if (appeared % 2 != 0) {
                oddTimesAppearedSmallFactors.add(smallFactor);
            }
        }

        int result = 1;
        for (Integer odd :
                oddTimesAppearedSmallFactors) {
            result *= odd;
        }

        return result;
    }

    private static ArrayList<Integer> findSmallestFactors(int m) {
        int[] factors = FactorsOfInteger.getFactors(m);
        ArrayList<Integer> result = new ArrayList<>();

        for (int factor : factors) {
            //check if it's also the smallest factor
            if (isAlsoSmallFactor(factor, result))
                result.add(factor);
        }
        return result;
    }

    private static boolean isAlsoSmallFactor(int i, ArrayList<Integer> listOfSmallFactors) {
        for (Integer small : listOfSmallFactors) {
            if (i % small == 0 && i != small)
                return false;
        }
        return true;
    }

}
