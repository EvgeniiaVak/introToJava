package chapter12.exercise27;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ZeroAdder {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length == 0) {
            System.out.println("usage: java RenameFiles <directory>");
            System.exit(1);
        }

        File dir = new File(args[0]);
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
                    word = padZeroesToExerciseName(word);

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

    public static String padZeroesToExerciseName (String string) {
        StringBuilder builder = new StringBuilder(string);

        if (string.matches("Exercise(\\d)+_(\\d)+")) {

            int firstSize = builder.indexOf("_") - 8;
            if (firstSize == 1)
                builder.insert(8, '0');

            int secondSize = builder.length() - 1 - builder.indexOf("_");
            if (secondSize == 1) {
                builder.insert(builder.indexOf("_") + 1, '0');
            }
        }

        return builder.toString();
    }
}
