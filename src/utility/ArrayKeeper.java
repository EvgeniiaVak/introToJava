package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayKeeper {

    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream(new File("src/chapter08/equal.txt"));
        Scanner scanner = new Scanner(is);

        int[][] m1 = readIntMatrix(scanner);
        int[][] m2 = readIntMatrix(scanner);
        System.out.println(equals(m1, m2));

        int[][] m3 = readIntMatrix(scanner);
        int[][] m4 = readIntMatrix(scanner);
        System.out.println(equals(m3, m4));

//        double[][] points = new double[5][2];
//        System.out.println("Enter five points: ");
//        for (int point = 0; point < points.length; point++) {
//            for (int coord = 0; coord < points[point].length; coord++) {
//                points[point][coord] = scanner.nextDouble();
//            }
//        }
//
//        String negation = (sameLine(points)) ? "" : "not ";
//
//        System.out.printf("The five points are %son the same line", negation);
//
//        double[][] toSort = {
//                {4, 2},
//                {1, 7},
//                {4, 5},
//                {1, 2},
//                {1, 1},
//                {4, 1}};
//
//        for (int i = 0; i < toSort.length; i++) {
//            System.out.println(Arrays.toString(toSort[i]));
//        }
//
//        double[][] sorted = {
//                {1, 1},
//                {1, 2},
//                {1, 7},
//                {4, 1},
//                {4, 2},
//                {4, 5}};



        scanner.close();
        is.close();

    }

    public static char[][] readCharMatrix(Scanner scanner) {
        System.out.println("Enter the number of rows in the matrix: ");
        int n = scanner.nextInt();
        char[][]result = new char[n][n];

        System.out.println("Enter the matrix row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = result[i][j] = (char) scanner.nextInt();
                System.out.printf("%3c ", k);
            }
            System.out.println();
        }
        System.out.println();

        return result;
    }

    public static int[][] readIntMatrix(Scanner scanner) {
        System.out.println("Enter the number of rows in the matrix: ");
        int n = scanner.nextInt();
        int[][]result = new int[n][n];

        System.out.println("Enter the matrix row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = result[i][j] = scanner.nextInt();
                System.out.printf("%3d ", k);
            }
            System.out.println();
        }
        System.out.println();

        return result;
    }


    /** The method performs a primary sort on rows and a secondary sort on columns */
    public static void sort(double m[][]) {
        // TODO: 8/12/17 do not change the arrays themselves, just sort
    }

    /** (Identical arrays) The two-dimensional arrays m1 and m2 are identical
     * if they have the same contents. */
    public static boolean equals(int[][] m1, int[][] m2) {
        if (!(m1.length == m2.length))
            return false;

        //take a value from m1
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {

                //compare it to every value from m2
                int occurred = 0;
                for (int k = 0; k < m2.length; k++) {
                    for (int l = 0; l < m2[k].length; l++) {

                        if (m1[i][j] == m2[k][l])
                            occurred ++;

                    }
                }
                //if there is no such value in m2 - return false
                if (occurred == 0)
                    return false;

            }
        }

        return true;
    }

    /** (Strictly identical arrays) The two-dimensional arrays m1 and m2
    * are strictly identical if their corresponding elements are equal.*/
    public static boolean strictlyEquals(int[][] m1, int[][] m2) {
        if (!(m1.length == m2.length))
            return false;

        for (int i = 0; i < m1.length; i++) {
            if (!(m1[i].length == m2[i].length))
                return false;
            for (int j = 0; j < m1[i].length; j++) {
                if (!(m1[i][j] == m2[i][j]))
                    return false;
            }
        }

        return true;
    }

    public static double[][] sortRows(double[][] m) {
        double[][] result = new double[m.length][];

        for (int i = 0; i < result.length; i++) {
            result[i] = m[i];
            Arrays.sort(result[i]);
        }

        return result;
    }

    public static double[][] sortColumns(double[][] m) {
        double[][] result = new double[m.length][];

        for (int j = 0; j < m[0].length; j++) {

            double[] column = new double[m.length];


            for (int i = 0; i < column.length; i++) {
                if (j == 0) {
                    result[i] = new double[m[0].length];
                }
                column[i] = m[i][j];
            }

            Arrays.sort(column);

            for (int i = 0; i < column.length; i++) {
                result[i][j] = column[i];
            }
        }

        System.out.println("\n");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\n");

        return result;
    }

    public static boolean sameLine(double[][] points) {
        //p0, p1 whether the p2 in on the same line:
        //(x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) == 0
        int size = points.length;
        double[] pointA = points[0]; //with x = pointA[0], and y = pointA[1]
        double[] pointB = points[1];

        for (int point = 0; point < size; point++) {
            double x0 = pointA[0];
            double x1 = pointB[0];
            double x2 = points[point][0];

            double y0 = pointA[1];
            double y1 = pointB[1];
            double y2 = points[point][1];

            double expression = (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
            if (expression != 0)
                return false;
        }

        return true;
    }

    public static int[] locateLargest(double[][] a) {
        int[] coords = new int[2];

        double maxValue = a[0][0];
        for (int row = 0; row < a.length; row++) {
            for (int cell = 0; cell < a[row].length; cell++) {
                if (maxValue < a[row][cell]) {
                    maxValue = a[row][cell];
                    coords[0] = row;
                    coords[1] = cell;
                }
            }
        }

        return coords;
    }

    public static int getSumOfIntElements (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+= array[i];
        }
        return sum;
    }

    public static void sortTwoDimensionalArray (int[][] array, int column) {
        for (int row = 0; row < array.length - 1; row++) {
            for (int nextRow = row + 1; nextRow < array.length; nextRow++) {
                if (array[row][column] > array[nextRow][column])
                    swapRows(array, row, nextRow);
            }
        }
    }

    public static void swapRows(int[][] array, int indexA, int indexB) {
        int[] temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }

    public static void swapRows(double[][] array, int indexA, int indexB) {
        double[] temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] result = new double[a.length][a[0].length];
        for (int row = 0; row < result.length; row++) {
            for (int cell = 0; cell < result[row].length; cell++) {
                result[row][cell] = a[row][cell] + b[row][cell];
            }
        }
        return result;
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        int n = a.length;
        double[][] c = new double[n][n];

        //where cij = ai1 * b1j + ai2 * b2j + ai3 * b3j till n.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

}
