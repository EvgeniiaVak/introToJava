package chapter13.exercise01;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter three sides of the triangle");
        Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());

        System.out.println("enter a color");
        triangle.setColor(scanner.next());

        System.out.println("enter a Boolean value to indicate whether the triangle is filled");
        triangle.setFilled(scanner.nextBoolean());

        //The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.
        System.out.println("the area: " + triangle.getArea());
        System.out.println("perimeter: " + triangle.getPerimeter());
        System.out.println("color: " + triangle.getColor());
        System.out.println("is filled: " + triangle.isFilled());
    }
}
