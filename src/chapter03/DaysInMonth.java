package chapter03;

import java.util.Scanner;

/**
 * Created by evgeniyavakarina on 7/19/17.
 */
public class DaysInMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt();
        System.out.println("Enter a month");
        int month = scanner.nextInt();

        int days = 0;

        boolean leapYear = (((year % 4) == 0) && !((year % 100) == 0) || (year % 400) == 0);

        switch (month) {
            case 2:
                days = (leapYear) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
        }

        System.out.printf("the month had %d days", days);
    }
}
