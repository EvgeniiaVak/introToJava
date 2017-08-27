package chapter05;

/*
* (Display calendars) Write a program that prompts the user to enter the year and first day of the year and displays
* the calendar table for the year on the console. For example, if the user entered the year 2013, and 2 for Tuesday,
* January 1, 2013, your program should display the calendar for each month in the year.
* */

import java.util.Scanner;

public class DisplayCalendars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt();
        System.out.println("Enter first day (e.g. 1 for Sunday, or 3 for Tuesday");
        int startDayInput = scanner.nextInt();
        int startDay = 1;

        for (int i = 0; i < 12; i++) {

            if (i == 0) {
                startDay = startDayInput;
            } else {
                int numberOfDaysInPreviousMonth = getNumberOfDays(getMonthName(i - 1), year);
                startDay = (numberOfDaysInPreviousMonth + startDay) % 7;
            }

            displayMonth(getMonthName(i), year, startDay);
        }
    }

    public static void displayMonth (String month, int year, int startDay) {

        System.out.println("\n");
        System.out.printf("____________________  %-10s %-6d____________________%n", month, year);
        System.out.println();
        System.out.printf("%7s%7s%7s%7s%7s%7s%7s%n", "Sun", "Mon","Tue", "Wed", "Thu", "Fri","Sat");

        int numberOfDays = getNumberOfDays(month, year);

        for (int i = 1; i < startDay; i++) {
            System.out.print("       ");
        }
        for (int i = 1; i <= numberOfDays; i++) {
            System.out.printf("%7d", i);
            if ((startDay + i - 1) % 7 == 0) System.out.println();
        }
    }

    public static String getMonthName(int i) {
        switch (i) {
            case 0:
                return "January";
            case 1:
                return "February";
            case 2:
                return "March";
            case 3:
                return "April";
            case 4:
                return "May";
            case 5:
                return "June";
            case 6:
                return "July";
            case 7:
                return "August";
            case 8:
                return "September";
            case 9:
                return "October";
            case 10:
                return "November";
            case 11:
                return "December";
            default:
                return "Not a month";
        }
    }

    public static int getNumberOfDays (String month, int year) {
        month = month.toLowerCase();
        switch (month) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                return 31;
            case "february":
                return (DisplayLeapYears.isLeapYear(year)) ? 29 : 28;
            default:
                return 30;
        }
    }
}
