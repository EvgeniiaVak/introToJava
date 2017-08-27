package chapter03;

/*(Science: day of the week) Zeller’s congruence is an algorithm developed by
Christian Zeller to calculate the day of the week. The formula is
h = (q + (26(m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7
where
■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday).
■ q is the day of the month.
■ m is the month (3: March, 4: April, ..., 12: December). January and February
are counted as months 13 and 14 of the previous year.
■ j is the century (i.e., year / 100)
■ k is the year of the century (i.e., year % 100).*/

import java.util.Scanner;

public class DayOfTheWeek {
    //h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday)
    private int h = 0;

    //q is the day of the month.
    private int q = 25;

    // m is the month (3: March, 4: April, ..., 12: December)
    // January and February are counted as months 13 and 14 of the previous year
    private int m = 13;

    //j is the century (i.e., year / 100)
    private int j = 20;

    //k is the year of the century (i.e., year % 100)
    private int k = 14;

    public static void main(String[] args) {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        dayOfTheWeek.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year (e.g. 2012): ");
        int year = scanner.nextInt();

        System.out.println("Enter month: 1-12:");
        int month = scanner.nextInt();

        System.out.println("Enter the day of the month: 1-31:");
        q = scanner.nextInt();

        //adjust data
        if (month == 1) {
            year--;
            m = 13;
        }
        if (month == 2) {
            year--;
            m = 14;
        }
        j = year / 100;
        k = year % 100;

        calculateTheDayOfTheWeek();

        System.out.println("The day is " + getDayTitle(h));
    }

    private void calculateTheDayOfTheWeek() {
        //Christian Zeller's formula
        h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
    }

    private String getDayTitle (int h) {
        switch (h) {
            case 0:
                return "Saturday";
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            default:
                return "Something went wrong - no such day of the week";
        }
    }
}
