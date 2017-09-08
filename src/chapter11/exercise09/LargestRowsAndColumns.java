package chapter11.exercise09;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestRowsAndColumns {

    private static ArrayList<Integer> largestRows = new ArrayList<>();
    private static ArrayList<Integer> largestColumns = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int size = scanner.nextInt();

        Integer[][] matrix = createRandomMatrix(size);
        printMatrix(matrix);

        System.out.println("Most ones in row(s): " + mostOnesRows(matrix));
        System.out.println("Most ones in column(s): " + mostOnesColumns(matrix));

    }

    private static ArrayList<Integer> mostOnesColumns(Integer[][] matrix) {
        return mostOnesRows(getRevertedMatrix(matrix));
    }

    private static ArrayList<Integer> mostOnesRows(Integer[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        Integer[] maxRow = matrix[0];
        int maxSum = countSum(maxRow);
        result.add(0);

        for (int i = 1; i < matrix.length; i++) {
            int sum = countSum(matrix[i]);

            if (sum > maxSum) {
                maxSum = sum;
                result.clear();
                result.add(i);
            } else if (sum == maxSum) {
                result.add(i);
            }
        }
        return result;
    }

    private static Integer[][] getRevertedMatrix(Integer[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != size)
                return null;
        }

        Integer[][] result = new Integer[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrix[j][i];
            }
        }

        return result;
    }

    private static int countSum (Integer[] line) {
        int sum = 0;
        for (int i = 0; i < line.length; i++) {
            sum += line[i];
        }
        return sum;
    }

    private static void printMatrix(Integer[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print((matrix[i][j]) + " ");
            }
            System.out.println();
        }
    }


    private static Integer[][] createRandomMatrix(int size) {
        Integer[][] matrix = new Integer[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }

        return matrix;
    }

}
