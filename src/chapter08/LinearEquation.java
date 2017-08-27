package chapter08;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/*8.30*/
public class LinearEquation {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File("src/chapter08/linear.txt"));
        Scanner scanner = new Scanner(is);

        //Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
        //x is -2.0 and y is 3.0
        double[][] firstA = read2x2matrix(scanner);
        double[] firstB = readB(scanner);
        double[] solution1 = linearEquation(firstA, firstB);
        outputSolution(solution1);

        //Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
        //The equation has no solution
        double[][] secondA = read2x2matrix(scanner);
        double[] secondB = readB(scanner);
        double[] solution2 = linearEquation(secondA, secondB);
        outputSolution(solution2);

        scanner.close();
        is.close();
    }

    private static void outputSolution(double[] solution) {
        if (solution == null) {
            System.out.println("There are no solutions");
        } else {
            System.out.printf("the solution is at %.2f, %.2f%n", solution[0], solution[1]);
        }
    }

    public static double[] readB (Scanner scanner) {
        double[] result = new double[2];

        for (int i = 0; i < 2; i++) {
            result[i] = scanner.nextDouble();
        }

        return result;
    }

    public static double[][] read2x2matrix(Scanner scanner) {
        double[][] result = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = scanner.nextDouble();
            }
        }

        return result;
    }

    public static double[] linearEquation(double[][] a, double[] b) {
        //a00 * x +a01 * y = b0
        //ax + by = c
        //a10 * x + a11 * y = b1
        //dx + ey = f

        //return null if a00*a11 - a01*a10 is 0
        if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0) {

            return null;
        }

        double[] result = new double[2];
        double x = result[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        double y = result[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);

        return result;
    }
}
