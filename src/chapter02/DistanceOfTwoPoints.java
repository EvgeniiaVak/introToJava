package chapter02;

/*
* (Geometry: distance of two points) Write a program that prompts the user to enter two points (x1, y1)
* and (x2, y2) and displays their distance between them.
* The formula for computing the distance is Math.sqrt((x2 - x1)2 + (y2 - y1)).
* */

public class DistanceOfTwoPoints {
    public static void main(String[] args) {
        System.out.println(getDistanceOfTwoPoints(1.5, -3.4, 4, 5));
    }

    public static double getDistanceOfTwoPoints(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
