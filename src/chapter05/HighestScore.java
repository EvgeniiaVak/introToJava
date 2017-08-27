package chapter05;

/*
* (Find the highest score) Write a program that prompts the user to enter the number
* of students and each student’s name and score, and finally displays the name of the
* student with the highest score.
* */

import java.util.Scanner;

public class HighestScore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students?");
        int numberOfStudents = scanner.nextInt();

        String bestStudentName = "";
        int bestStudentScore = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter student's name:");
            String studentName = scanner.next();
            System.out.println("Enter student's score:");
            int score = scanner.nextInt();
            if (score > bestStudentScore) {
                bestStudentScore = score;
                bestStudentName = studentName;
            }
        }

        System.out.printf("Student with highest score of %d is %s.", bestStudentScore, bestStudentName);
    }
}
