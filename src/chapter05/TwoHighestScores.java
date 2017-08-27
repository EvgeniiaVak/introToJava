package chapter05;

/*
* (Find the two highest scores) Write a program that prompts the user to enter the number
* of students and each student’s name and score, and finally displays the student with the
* highest score and the student with the second-highest score.
* */

import java.util.Scanner;

public class TwoHighestScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many students?");
        int numberOfStudents = scanner.nextInt();

        String bestStudentName = "";
        int bestStudentScore = 0;

        String secondToBestStudentName = "";
        int secondToBestStudentScore = 0;


        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter student's name:");
            String name = scanner.next();
            System.out.println("Enter student's score:");
            int score = scanner.nextInt();
            if (score > bestStudentScore) {
                bestStudentScore = score;
                bestStudentName = name;
                continue;
            } else if (score > secondToBestStudentScore) {
                secondToBestStudentScore = score;
                secondToBestStudentName = name;
            }
        }

        System.out.printf("Student with highest score of %d is %s.%n", bestStudentScore, bestStudentName);
        System.out.printf("Student with second highest score of %d is %s.%n", secondToBestStudentScore, secondToBestStudentName);
    }
}
