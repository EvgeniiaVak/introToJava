package chapter03;

import java.util.Scanner;

/**
 * Created by evgeniyavakarina on 7/19/17.
 */
public class TryOutChapter {
    public final static int GLOBAL_VARIABLE = 1960;

    public static void main(String[] args) {
//        char grade = 0;
//        int x = 2, y = 2;
//        if (x > 2)
//            if (y > 2) {
//                int z = x + y;
//                System.out.println("z is " + z); }
//            else
//                grade = 'D';
//
//        //grade = 'F';
//        System.out.println("x is " + x);
//        System.out.println("Grade is " + grade);
//        randomInteger();
//        int x = 1;
//        int y = 2;
//        System.out.println((x != 1) == !(x == 1));
//        System.out.println((x != 0) || (x == 0));
//        char ch = '5';
//        System.out.println(ch >= 'A' && ch <= 'Z');
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a year ");
//        int year = scanner.nextInt();
//        int random = (int) (Math.random() * 2020);
//
//
//        boolean leapYear = (((year % 4) == 0) && !((year % 100) == 0) || (year % 400) == 0);
//        System.out.println("Is is a leap year? " + leapYear);
//
//        final int LOCAL_GLOBAL_VARIABLE = 1960; //+ random; - compiler error
//        switch (year) {
//            case LOCAL_GLOBAL_VARIABLE:
//                System.out.println("1960!!!");
//                break;
//        }
//
//        int a = 100;
//        switch (a) {
//            case 0:
//                System.out.println("0 case");
//                break;
//            case 100:
//                System.out.println("100 case");
//            case 200:
//                System.out.println("200 case");
//                break;
//            case 300:
//                System.out.println("200 case");
//                break;
//        }

        double largeNum = 1126481792;
        System.out.printf("this number is %10.2e%n", largeNum);
        double num = 1.126481792;
        System.out.printf("this number is %.2f%n", num);
        System.out.printf("%5d %f", 1);

        System.out.printf("amount is %f %e\n", 32.32, 32.32);
        System.out.printf("amount is %5.4f %5.4e\n", 32.32, 32.32);
        System.out.printf("%6b\n", (1 > 2));
        System.out.printf("%6s\n", "Java");
        System.out.printf("%-6b%s\n", (1 > 2), "Java");
        System.out.printf("%6b%-8s\n", (1 > 2), "Java");
    }

    /*
    * a. How do you generate a random integer i such that 0 <= i < 20?
    * b. How do you generate a random integer i such that 10 <= i < 20?
    * c. How do you generate a random integer i such that 10 <= i <= 50?
    * */
    private static void randomInteger() {
        double random = Math.random();
        int from0to20 = (int) (random * 20);
        random = Math.random();
        int from10to20 = (int) (int) (random * 10) + 10;
        random = Math.random();
        int from10to50 = (int) (((random * 41) % 41) + 10);

        System.out.println("from0to20 " + from0to20);
        for (double i = 0.0; i < 1.0; i += 0.1) {
            int steps = (int) (i * 20);
            System.out.println(steps);
        }
        System.out.println("from10to20 " + from10to20);
        for (double i = 0.0; i < 1.0; i += 0.1) {
            int steps = (int) (i * 10) + 10;
            System.out.println(steps);
        }

        System.out.println("from10to50 " + from10to50);
        for (double i = 0.0; i < 1.0; i += 0.1) {
            int steps = (int) (((i * 41) % 41) + 10);
            System.out.println(steps);
        }
    }
}
