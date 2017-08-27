package chapter08;

import utility.ArrayKeeper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;


public class PolygonSubareas {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(new File("src/chapter08/polygon.txt"));
        Scanner scanner = new Scanner(is);

        //Enter x1, y1, x2, y2, x3, y3, x4, y4:
        //-2.5 2 4 4 3 -2 -2 -3.5
        //The areas are 6.17 7.96 8.08 10.42

        //read input
        double[][] vertexes = new double[4][2];
        for (int i = 0; i < vertexes.length; i++) {
            vertexes[i] = PointPosition.readPoint(scanner);
            System.out.println(Arrays.toString(vertexes[i]));
        }

        double[][] lines = new double[4][2];
        lines[0] = vertexes[0];
        lines[1] = vertexes[2];
        lines[2] = vertexes[1];
        lines[3] = vertexes[3];

        //find the common point of all triangles
        double[] center = IntersectingPoint.getIntersectingPoint(lines);
        System.out.println("center is " + Arrays.toString(center));

        System.out.printf("The areas are: ");

        for (int i = 0; i < 4; i++) {
            double[] a = vertexes[i],
                    b = vertexes[(i < 3) ? i + 1 : 0];

            double area = TriangleArea.getTriangleArea(a, b, center);

            System.out.print(area + " ");
        }


        scanner.close();
        is.close();
    }

}
