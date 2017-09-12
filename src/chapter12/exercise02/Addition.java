package chapter12.exercise02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter two integers");

            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("their sum is " + (a + b));
                break;
            } catch (InputMismatchException e) {
                System.out.println("wrong input");
            }
        }
    }
}
