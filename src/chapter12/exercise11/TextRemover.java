package chapter12.exercise11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TextRemover {
    public static void main(String[] args) {
        //java TextRemover John filename
        if (args.length != 2) {
            System.out.println("usage: java TextRemover <string to remove> <filename>");
            System.exit(1);
        }

        //try to find the file
        String path = args[1];
        File file = new File(path);

        //the word we need to remove
        String word = args[0];

        //create an array list to store the new lines for the file
        ArrayList<String> lines = new ArrayList<>();

        try {
            //read all the lines in the file
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                //remove the word
                String lineWithoutTheWord = line.replaceAll(word, "");
                //store the new line in the list
                lines.add(lineWithoutTheWord);
            }

            //create the writer and clear the file
            PrintWriter writer = new PrintWriter(file);

            //print the new lines into the file
            for (int i = 0; i < lines.size(); i++) {
                writer.print(lines.get(i));
                if (i != lines.size() - 1) {
                    writer.println();
                }
            }

            //do not forget to close the file to save changes properly
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.printf("no %s file exists", path);
            e.printStackTrace();
            System.exit(2);
        }

    }
}
