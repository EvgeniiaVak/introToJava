package chapter07;

/*
* (Sort students) Write a program that prompts the user to enter the number of students,
* the students’ names, and their scores, and prints student names in decreasing order of their scores.
* */

import java.util.Scanner;

public class SortStudents {
    public static void main(String[] args) {

        //get the input
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of students");
        int numberOfStudents = scanner.nextInt();
        String[] studentsNames = new String[numberOfStudents];
        int[] studentsScores = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("enter student's name:");
            studentsNames[i] = scanner.next();
            System.out.println("enter student's score:");
            studentsScores[i] = scanner.nextInt();
        }

        //sort students on basis of their scores
        //for every place in sortedArray
        for (int i = 0; i < numberOfStudents; i++) {

            //look through the rest (still unchecked) array of students
            for (int j = i + 1; j < numberOfStudents; j++) {
                // if we find a better score, we put it on top
                if (studentsScores[j] > studentsScores[i]) {
                    swapElements(i, j, studentsScores);
                    swapElements(i, j, studentsNames);
                }
            }
        }

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(studentsNames[i]);
        }

    }

    public static void swapElements(int i, int j, int... array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void swapElements(int i, int j, String... array) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
