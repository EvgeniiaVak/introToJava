package chapter09;

import chapter09.exercise_02.Stock;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

//        9.3
//        Date date = new Date();
//
//        for (int i = 0; i < 8; i++) {
//            long elapsedTime = 10000 * (long)(Math.pow(10, i));
//            date.setTime(elapsedTime);
//            System.out.println(elapsedTime);
//            System.out.println(date.toString());
//        }

//        //9.4
//        Random random = new Random(1000);
//        for (int i = 0; i < 50; i++) {
//            System.out.println(random.nextInt(100));
//        }
//
//        //9.5
//        GregorianCalendar gc = new GregorianCalendar();
//        outputCalendar(gc);
//
//        gc.setTimeInMillis(1234567898765L);
//        outputCalendar(gc);



    }

    private static void outputCalendar(GregorianCalendar gc) {
        System.out.println("Year: " + gc.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + gc.get(GregorianCalendar.MONTH));
        System.out.println("Day: " + gc.get(GregorianCalendar.DAY_OF_MONTH));
    }
}