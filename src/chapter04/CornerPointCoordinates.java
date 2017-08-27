package chapter04;

/*
* (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point at the 0 o’clock position,
* as shown in Figure 4.7c. Write a program that prompts the user to enter the radius of the bounding circle
* of a pentagon and displays the coordinates of the five corner points on the pentagon.
* */

import java.util.Scanner;

public class CornerPointCoordinates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius of the bounding circle: ");
        double radius = 100;//scanner.nextDouble();

        //the size between points on the circle
        double sizeBetweenPoints = (2 * Math.PI) / 5;
        double zeroClockPoint = Math.PI / 2;

        for (double i = -1; i < 4; i++) {
            //for every point in the pentagon
            //get the coordinates
            double angle = zeroClockPoint + (sizeBetweenPoints * i);
            double[] coords = getPointCoordinates(radius, angle);
            //and display them
            System.out.printf("%f, %f%n", coords[0], coords[1]);
        }
    }


    public static double[] getPointCoordinates(double radius, double angle) {
        return new double[] {
                radius * Math.cos(angle),
                radius * Math.sin(angle)
        };
    }
}
