package chapter11.exercise15;

import chapter10.exercise04.MyPoint;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPolygon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the points: ");
        int numberOfPoints = scanner.nextInt();
        System.out.println("Enter the coordinates of the points: ");

        ArrayList<MyPoint> points = new ArrayList<>();
        for (int i = 0; i < numberOfPoints; i++) {
            points.add(new MyPoint(scanner.nextDouble(), scanner.nextDouble()));
        }

        Polygon polygon = new Polygon(points);
        System.out.println("Area: " + polygon.getArea());
    }
}
