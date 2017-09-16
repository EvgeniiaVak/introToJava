package chapter12.exercise27;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ZeroAdder {
    public static void main(String[] args) throws FileNotFoundException {
        File dir = new File("src/chapter12/exercise27/data");
        File[] files = dir.listFiles();

        for (File file : files) {
            //scan every file
            Scanner scanner = new Scanner(file);
            StringBuilder copy = new StringBuilder();

            while (scanner.hasNext()) {
                //in every file search every line
                StringBuilder line = new StringBuilder();
                String[] words = scanner.nextLine().split("\\s");

                for (String word : words) {
                    //in every line search for an exercise name
                    if (word.matches("Exercise(\\d)+_(\\d)+")) {
                        String[] numberPartsOfExerciseName = word.split("(\\D)+");

                        //check every number in the exercise name
                        for (String number : numberPartsOfExerciseName) {
                            //if it has only one digit
                            if (number.length() == 1) {
                                //replace it with the 0 and the digit
                                word = word.replace(number, "0" + number);
                            }
                        }
                    }

                    line.append(word);
                    line.append(" ");
                }


                copy.append(line);
                if (scanner.hasNext())
                    copy.append("\n");
            }

            PrintWriter writer = new PrintWriter(file);
            writer.print(copy);
            writer.close();
        }
    }
}
