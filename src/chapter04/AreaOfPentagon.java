package chapter04;

import java.util.Scanner;

public class AreaOfPentagon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ask for the r
        System.out.println("Enter the length from the center to a vertex:");
        double r = scanner.nextDouble();

        //compute
        double side = 2 * r * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));

        //output the result
        System.out.printf("The area of the pentagon is %.2f%n", area);
    }
}
