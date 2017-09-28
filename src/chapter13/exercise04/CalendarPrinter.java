package chapter13.exercise04;

import chapter05.DisplayCalendars;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarPrinter {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        if (args.length > 0) {
            calendar.set(Calendar.MONTH, Integer.parseInt(args[0]));
        }
        if (args.length > 1) {
            calendar.set(Calendar.YEAR, Integer.parseInt(args[1]));
        }

        String month = DisplayCalendars.getMonthName(calendar.get(Calendar.MONTH));

        Calendar findFirstDayOfTheWeek = new GregorianCalendar(
                calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1);
        int startDay = findFirstDayOfTheWeek.get(Calendar.DAY_OF_WEEK);
        DisplayCalendars.displayMonth(month, calendar.get(Calendar.YEAR), startDay);
    }
}