package chapter05;

/*
* (Display leap years) Write a program that displays all the leap years,
* ten per line, from 101 to 2100, separated by exactly one space. Also display
* the number of leap years in this period.
* */

public class DisplayLeapYears {
    public static void main(String[] args) {
        int leapCount = 0;
        for (int year = 101; year <= 2100; year++) {
            if (isLeapYear(year)) {
                leapCount++;
                System.out.print(" " + year);
                if (leapCount % 10 == 0) System.out.println();
            }
        }
    }

    public static boolean isLeapYear (int year) {
        return year % 400 == 0 || ((!(year % 100 == 0)) && (year % 4 == 0)) ;
    }
}
