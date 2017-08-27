package chapter03;


/*
* (Compute the perimeter of a triangle) Write a program that reads three edges for a triangle
* and computes the perimeter if the input is valid. Otherwise, display that the input is invalid.
* The input is valid if the sum of every pair of two edges is greater than the remaining edge.
* */

import java.util.Scanner;

public class TrianglePerimeter {
    private int a, b, c;

    public static void main(String[] args) {
        TrianglePerimeter tp = new TrianglePerimeter();
        tp.run();
    }

    public void run() {
        requestParams();

        String output = "";
        if (isValid()) {
            output = "The perimeter is " + calculatePerimeter();
        } else {
            output = "The input is invalid.";
        }

        System.out.println(output);
    }

    private int calculatePerimeter () {
        return a + b + c;
    }

    private void requestParams() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    }

    private boolean isValid () {
        return (a + b) > c && (a + c) > b && (b + c ) > a;
    }
}
