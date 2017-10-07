package chapter13.exercise21;

import chapter13.exercise15.BigRational;

import java.util.Scanner;

public class VertexFormEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //(y = ax2 + bx + c)
        //(y = a(x - h)^2 + k)
        //h = b / 2
        //k = - h^2 + c

        System.out.println("enter a, b, and c as integers in standard form");
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble();
//        double a = 1, b = 3, c = 1;
//        double a = 2, b = 3, c = 4;

        double h = (-b) / (2 * a);
        double k = a * Math.pow(h, 2) + b * h + c;

        System.out.printf("h = %s, k = %s%n", BigRational.valueOf(h), BigRational.valueOf(k));
    }
}
