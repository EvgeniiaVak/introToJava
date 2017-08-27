package chapter07;

import java.util.Scanner;

public class AssignGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int[] studentsScores = /*{40, 55, 70, 58};*/ new int[scanner.nextInt()];
        System.out.println("Enter 4 scores:");
        for (int i = 0; i < studentsScores.length; i++) {
            studentsScores[i] = scanner.nextInt();
        }

        for (int i = 0; i < studentsScores.length; i++) {
            System.out.printf("Student %d score is %d and grade is %s%n", i, studentsScores[i], getGrade(i, studentsScores));
        }



//        //test getGrade
//        for (int i = 0; i < studentsScores.length; i++) {
//            System.out.println(getGrade(i, studentsScores));
//        }


    }


    public static String getGrade(int studentIndex, int[] studentsScores) {
        String[] grades = {"A", "B", "C", "D", "E", "F"};
        String grade = grades[4];

        int bestScore = findLargestScore(studentsScores);
        int studentScore = studentsScores[studentIndex];

        for (int gradeThreshold = bestScore - 10, j = 0; j < grades.length; gradeThreshold -= 10, j++) {
            if (studentScore >= gradeThreshold)
                return grades[j];
        }
        return grade;
    }

    public static int findLargestScore(int[] array) {
        if (array.length == 0)
            return -1;

        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest)
                largest = array[i];
        }
        return largest;
    }
}
