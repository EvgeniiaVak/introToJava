package chapter08;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File("src/chapter08/triangle.txt"));
        Scanner scanner = new Scanner(is);

        //Enter x1, y1, x2, y2, x3, y3: 2.5 2 5 -1.0 4.0 2.0
        //The area of the triangle is 2.25
        double[][] triangle1 = read3x2matrix(scanner);
        System.out.println(getTriangleArea(triangle1));

        //Enter x1, y1, x2, y2, x3, y3: 2 2 4.5 4.5 6 6
        //The three points are on the same line
        double[][] triangle2 = read3x2matrix(scanner);
        System.out.println(getTriangleArea(triangle2));


        scanner.close();
        is.close();
    }
    public static double getTriangleArea(double[] a, double[] b, double[] c) {
        if (PointPosition.find(a, b, c) == PointPosition.ON_THE_SAME_LINE) {
            return 0;
        }

        double side1 = NearestPoints.getDistance(a, b);
        double side2 = NearestPoints.getDistance(b, c);
        double side3 = NearestPoints.getDistance(c, a);

        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    //method returns 0 if the three points are on the same line
    public static double getTriangleArea(double[][] points) {
        return getTriangleArea(points[0], points[1], points[2]);
    }


    public static double[][] read3x2matrix(Scanner scanner) {
        double[][] result = new double[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = scanner.nextDouble();
            }
        }

        return result;
    }
}
