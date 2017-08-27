package chapter08;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/*********************************************************************************
 * (Geometry: intersecting point) Write a method that returns the intersecting    *
 * point of two lines. The intersecting point of the two lines can be found by    *
 * using the formula shown in Programming Exercise 3.25. Assume that (x1, y1) and *
 * (x2, y2) are the two points on line 1 and (x3, y3) and (x4, y4) are on line 2. *
 * The method header is                                                           *
 *                                                                                *
 * public static double[] getIntersectingPoint(double[][] points)                 *
 *                                                                                *
 * The points are stored in a 4-by-2 two-dimensional array points with            *
 * (points[0][0], points[0][1]) for (x1, y1). The method returns the intersecting *
 * point or null if the two lines are parallel. Write a program that prompts      *
 * the user to enter four points and displays the intersecting point. See         *
 * Programming Exercise 3.25 for a sample run.
 * *
 *********************************************************************************/

public class IntersectingPoint {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File("src/chapter08/intersecting.txt"));
        Scanner scanner = new Scanner(is);

        //Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
        //The intersecting point is at (2.88889, 1.1111)
        double[][] points1 = read4x2matrix(scanner);
        double[] solution1 = getIntersectingPoint(points1);
        outputSolution(solution1);

        //Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
        //The two lines are parallel
        double[][] points2 = read4x2matrix(scanner);
        double[] solution2 = getIntersectingPoint(points2);
        outputSolution(solution2);


        scanner.close();
        is.close();
    }

    private static void outputSolution(double[] solution) {
        if (solution == null) {
            System.out.println("The two lines are parallel");
        } else {
            System.out.printf("The intersecting point is at (%.5f, %.5f)%n", solution[0], solution[1]);
        }
    }

    public static double[] getIntersectingPoint(double[][] points) {

        /*
         * Cramer’s rule
         *
         * ax + by = e
         * cx + dy = f
         *
         * If ad - bc is 0, report that “The equation has no solution.”
         * x= (ed-bf)/(ad - bc)
         * y= (af-ec)/(ad - bc)
         * */

        //(y1 -y2)x-(x1 -x2)y=(y1 -y2)x1 -(x1 -x2)y1
        //(y3 -y4)x-(x3 -x4)y=(y3 -y4)x3 -(x3 -x4)y3
        double  x1 = points[0][0],
                x2 = points[1][0],
                x3 = points[2][0],
                x4 = points[3][0],
                y1 = points[0][1],
                y2 = points[1][1],
                y3 = points[2][1],
                y4 = points[3][1];

        double[][] aPoints = new double[2][2];
        double[] bPoint = new double[2];
        //a
        aPoints[0][0] = (y1 - y2);
        //b
        aPoints[0][1] = - (x1 - x2);
        //c
        aPoints[1][0] = (y3 - y4);
        //d
        aPoints[1][1] = - (x3 - x4);
        //e
        bPoint[0] = (y1 -y2) * x1 - (x1 -x2) * y1;
        //f
        bPoint[1] = (y3 -y4) * x3 - (x3 -x4) * y3;

        return LinearEquation.linearEquation(aPoints, bPoint);
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
