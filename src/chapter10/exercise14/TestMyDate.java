package chapter10.exercise14;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate[] dates = {
                new MyDate(),
                new MyDate(34355555133101L),
                new MyDate(561555550000L)
        };

        for (int i = 0; i < dates.length; i++) {
            System.out.printf("Year: %d, month: %d, day: %d%n",
                    dates[i].getYear(),
                    dates[i].getMonth(),
                    dates[i].getDay()
            );
        }

    }
}
