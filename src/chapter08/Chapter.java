package chapter08;

import utility.ArrayKeeper;
import utility.InputReader;

import java.util.Arrays;

public class Chapter {
    public static void main(String[] args) {
//        int[][] array = new int[5][5];
//        array[0][0] = 1;
//
//
//        int[][] r = new int[2];
//        int[] x = new int[];
//        int[][] y = new int[3][];
//        int[][] z = {{1, 2}};
//        int[][] m = {{1, 2}, {2, 3}};
//        int[][] n = {{1, 2}, {2, 3}, };

//
//        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
//        for (int i = array.length - 1; i >= 0; i--) {
//            for (int j = array[i].length - 1; j >= 0; j--) System.out.print(array[i][j] + " ");
//            System.out.println();
//        }
//
//        int[][] array = {{1, 2}, {3, 4}, {5, 6}}; int sum = 0;
//        for (int i = 0; i < array.length; i++)
//            sum += array[i][0]; System.out.println(sum);

//        double[][] array = {
//                {1, 2, 3, 4.0},
//                {5, 6.5, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}};
//
//        for (int column = 0; column < array[0].length; column++) {
//            System.out.println(sumColumn(array, column));
//        }

//        System.out.println(sumMajorDiagonal(array));
//
//        double[][] a = InputReader.getDoubleArrayFromFile("src/chapter08/matrix1.txt", 3, 3);
//        double[][] b = InputReader.getDoubleArrayFromFile("src/chapter08/matrix2.txt", 3, 3);
//
//        double[][] c = ArrayKeeper.addMatrix(a, b);
//
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(Arrays.toString(c[i]));
//        }
//
//        double[][] d = ArrayKeeper.multiplyMatrix(a, b);
//        for (int i = 0; i < c.length; i++) {
//            System.out.println(Arrays.toString(d[i]));
//        }

//        System.out.println('\u0000');

        double[][] a = {
                {23.5, 35, 2, 10},
                {4.5, 3, 45, 3.5},
                {35, 44, 5.5, 9.6}
        };

        int[] coords = ArrayKeeper.locateLargest(a);

        System.out.println(Arrays.toString(coords));


    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
    }

    public static int[] m1(int[][] m) {
        int[] result = new int[2];
        result[0] = m.length;
        result[1] = m[0].length;
        return result;
    }
}
