package chapter08;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

import static chapter08.Exercise_34.X;
import static chapter08.Exercise_34.Y;

public class RightmostLowestPoint {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File("src/chapter08/rightmost.txt"));
        Scanner scanner = new Scanner(is);

        //Enter 6 points: 1.5 2.5 -3 4.5 5.6 -7 6.5 -7 8 1 10 2.5
        //The rightmost lowest point is (6.5, -7.0)
        double[][] points = read4x2matrix(scanner);
        double[] rightmostLowestPoint = getRightMostLowestPoint(points);
        System.out.println("The rightmost lowest point is " + Arrays.toString(rightmostLowestPoint));


        scanner.close();
        is.close();
    }

    public static double[] getRightMostLowestPoint(double[][] p) {

        double[] rightMost;
        rightMost = p[0];

        for (int i = 1; i < p.length; i++) {

            if (p[i][Y] < rightMost[Y]) {

                rightMost = p[i];
            } else if (p[i][Y] == rightMost[Y] && p[i][X] > rightMost[X]) {

                rightMost = p[i];
            }
        }
        return new double[] {rightMost[X], rightMost[Y]};

    }

    public static double[] getLowestRightmostPoint (double[][] points) {
        double[] rightmostLowestPoint = points[0];
        int rightmostCount = 1;

        //compare to all the rest points
        //find the rightest (may be several)
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > rightmostLowestPoint[0]) {
                rightmostCount = 1;
                rightmostLowestPoint = points[i];
            } else if (points[i][0] == rightmostLowestPoint[0]){
                rightmostCount++;
            }
        }

        //if there was only one rightest point, return it
        if (rightmostCount == 1)
            return rightmostLowestPoint;


        //else pick the rightmost points
        double[][] rightest = new double[rightmostCount][];
        int index = 0;
        for (int i = 0; i < points.length; i++) {
            if (rightmostLowestPoint[0] == points[i][0]) {
                rightest[index] = points[i];
                index++;
            }
        }

        //among them find the lowest
        for (double[] point : rightest) {
            if (point[1] < rightmostLowestPoint[1]) {
                rightmostLowestPoint = point;
            }
        }

        return rightmostLowestPoint;
    }

    public static double[][] read4x2matrix(Scanner scanner) {
        double[][] result = new double[4][2];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = scanner.nextDouble();
            }
        }

        return result;
    }
}
