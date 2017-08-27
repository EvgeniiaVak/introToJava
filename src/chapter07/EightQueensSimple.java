package chapter07;

/*
* (Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens on a chessboard
* such that no two queens can attack each other (i.e., no two queens are on the same row, same column,
* or same diagonal). There are many possible solutions. Write a program that displays one such solution.
* */

public class EightQueensSimple {
    public static void main(String[] args) {
        int numberOfChecks = 8;

        //display the chessboard
        for (int i = 0; i < numberOfChecks; i++) {
            generateLine(numberOfChecks, i);
        }


    }

    //prints one line of the checkbox
    private static void generateLine(int length, int indexOfLine) {
        String divider = "|";

        for (int i = 0; i < length; i++) {
            int positionOfQ = (indexOfLine + indexOfLine);
            if (positionOfQ > 7) positionOfQ = (positionOfQ + 1) % 8;
            String output = (i == positionOfQ) ? "Q" : " ";
            System.out.print(divider);
            System.out.print(output);
        }
        System.out.println(divider);

    }
}
