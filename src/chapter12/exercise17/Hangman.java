package chapter12.exercise17;

/*
 **********************************************************************************
 * words are generated here - https://randomwordgenerator.com                     *
 **********************************************************************************
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        //set up the game environment
        Scanner userInputScanner = new Scanner(System.in);

        //try to get data from file
        StringBuilder wordPool = new StringBuilder();
        try {
            File file = new File("src/chapter12/exercise17/words.txt");
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNext()) {
                wordPool.append(" ");
                wordPool.append(fileScanner.next());
            }

        } catch (FileNotFoundException e) {
            //exit if there is no such file
            System.out.println("couldn't open source file");

            e.printStackTrace();
            System.exit(1);
        }


        String string = wordPool.toString();
        String[] words = string.split("\\s");
        boolean anotherGame = false;

        do {
            //initialize current game variables
            String word = words[(int) (Math.random() * words.length)];
            char[] guessedLetters = new char[word.length()];
            for (int i = 0; i < guessedLetters.length; i++) {
                guessedLetters[i] = '*';
            }
            int misses = 0;

            // while word is not fully guessed
            while (contains(guessedLetters, '*')) {
                // ask for the user to guess a letter
                char guess = promptForLetter(guessedLetters, userInputScanner);

                //if user already guessed the letter, tell him so
                if (contains(guessedLetters, guess)) {
                    System.out.println(guess + " is already in the word");
                }
                //if not
                else {
                    //look for the guess in the word
                    int index = word.indexOf(guess);
                    if (index >= 0) {
                        //if it's there put the guess in guessedLetters array
                        for (int i = index; i < guessedLetters.length; i++) {
                            if (word.charAt(i) == guess) {
                                guessedLetters[i] = guess;
                            }
                        }
                    } else {
                        System.out.println(guess + " is not in the word");
                        misses++;
                    }
                }
            }
            // after the word is guessed
            System.out.printf("The word is \"%s\". You missed %d %s.%n",
                    word, misses, (misses == 1) ? "time" : "times");

            // ask user if he wants another round
            System.out.print("Do you want to guess another word? Enter y or n > ");
            anotherGame = userInputScanner.next().charAt(0) == 'y';
        } while (anotherGame);

    }

    private static boolean contains (char[] guessedLetters, char guess) {
        for (char letter : guessedLetters) {
            if (letter == guess) {
                return true;
            }
        }
        return false;
    }

    private static char promptForLetter(char[] guessedLetters, Scanner scanner) {
        String guessedPart = "";
        for (int i = 0; i < guessedLetters.length; i++) {
            guessedPart += guessedLetters[i];
        }
        System.out.printf("(Guess) Enter a letter in word %s > ", guessedPart);
        return scanner.next().charAt(0);
    }
}
