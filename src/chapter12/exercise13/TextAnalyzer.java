package chapter12.exercise13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Count characters, words, and lines in a file
public class TextAnalyzer {
    public static void main(String[] args) {
        //Generated 5 paragraphs, 489 words, 3323 bytes of Lorem Ipsum in text.txt

        if (args.length != 1) {
            System.out.println("usage: java TextRemover <file to analyze>");
            System.exit(1);
        }

        try {
            File file = new File(args[0]);
            Scanner scanner = new Scanner(file);

            int numberOfCharacters = 0, numberOfWords = 0, numberOfLines = 0;

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                numberOfLines++;

                String[] words = line.split("\\s");
                numberOfWords += words.length;

                for (String word : words) {
                    for (int j = 0; j < word.length(); j++) {
                        if (Character.isLetterOrDigit(word.charAt(j))){
                            numberOfCharacters++;
                        }
                    }
                }
            }

            System.out.println("Number of characters: " + numberOfCharacters);
            System.out.println("Number of words: " + numberOfWords);
            System.out.println("Number of lines: " + numberOfLines);

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("no such file " + args[0]);
        }
    }
}
