package chapter11.exercise01;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter three sides of the triangle");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println("enter a color");
        String color = scanner.next();

        System.out.println("is the triangle filled?");
        boolean isFilled = scanner.nextBoolean();

        Triangle triangle = new Triangle(a, b, c);
        triangle.setColor(color);
        triangle.setFilled(isFilled);

        System.out.println(triangle);
        System.out.println("has color: " + triangle.getColor());
        System.out.println("is filled = " + triangle.isFilled());
    }
}
