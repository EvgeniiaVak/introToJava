package chapter12.exercise24;

import java.util.Random;

public class FacultyMember {
    public static final String[] RANKS = {
            "assistant",
            "associate",
            "full"
    };

    public static final int[][] SALARY_BOUNDS = {
            {50000, 80000},
            {60000, 110000},
            {75000, 130000}
    };

    private String firstName, secondName, rank;
    private int salary;

    public FacultyMember(String firstName, String secondName, Random random) {
        this.firstName = firstName;
        this.secondName = secondName;

        int index = random.nextInt(3);
        rank = RANKS[index];

        int low = SALARY_BOUNDS[index][0];
        int high = SALARY_BOUNDS[index][1];

        salary = random.nextInt(high - low) + low;
    }

    @Override
    public String toString() {
        return firstName + " " + secondName + " " + rank + " " + salary;
    }
}
