package chapter05;

import java.util.Scanner;

public class Chapter {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        //fiveQuestions();
//        //System.out.println("main");
//        for (int i = 0; i < 5; i++) {
//            System.out.println(scanner.nextInt());
//        }
//
//        int x = 2147483640;
//        while (x > 0) x++;
//        System.out.println("x is " + x);
//        int y = Integer.MAX_VALUE;
////        System.out.println(y);
//        int sum1 = 0;
//        for (int i = 0; i < 10; ++i) {
//            sum1 += i;
//        }
//        int sum2 = 0;
//        for (int i = 0; i < 10; i++) {
//            sum2 += i;
//        }
//        System.out.println(sum1);
//        System.out.println(sum2);
//
//        int count = 0;
//        while (++count < 10) {
//            System.out.println("Welcome to Java " + count);
//        }
        double sum = 0;
        double d = 0;
        while (d != 10.0) {
            d += 0.1;
            sum += sum + d;
        }
    }



    /*Listing 5.4 gives a program that generates five questions and, after a student answers all five,
     * reports the number of correct answers. The program also displays the time spent on the test and
     * lists all the questions.*/
    private static void fiveQuestions() {
        Scanner scanner = new Scanner(System.in);
//
//        int rightAnswers = 0;
//        long startTime = System.currentTimeMillis();
//        for (int i = 0; i < 5; i++) {
//            //generate random question
//            int a = (int) (Math.random() * 7);
//            int b = (int) (Math.random() * 7);
//            int answer = a + b;
//
//            System.out.printf(" %d + %d = ?%n", a, b);
//            int input = scanner.nextInt();
//            if (input == answer) rightAnswers++;
//        }
//        long endTime = System.currentTimeMillis();
//        long timeSpendInSeconds = (endTime - startTime) / 1000;
//        int seconds = (int) (timeSpendInSeconds % 60);
//        int minutes = (int) (timeSpendInSeconds / 60) % 60;
//        int hours = (int) (timeSpendInSeconds / 3600);
//        System.out.printf("Number of right answers: %d%n", rightAnswers);
//        System.out.printf("Time spent: %d:%d:%d%n", hours, minutes, seconds);
//
//        //int i = 1;
//        int sum = 0;
//        while (sum < 10000) {
//            sum = sum + i;
//            i++;
//        }
//        int hexValue = 4;
//        char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
//                (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
//        char b = (char) hexValue;
//        int a = b;
    }
}
