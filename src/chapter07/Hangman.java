package chapter07;

/*********************************************************************************
 * (Game: hangman) Write a hangman game that randomly generates a word and        *
 * prompts the user to guess one letter at a time, as shown in the sample run.    *
 * Each letter in the word is displayed as an asterisk. When the user makes a     *
 * correct guess, the actual letter is then displayed. When the user finishes a   *
 * word, display the number of misses and ask the user whether to continue to     *
 * play with another word. Declare an array to store words, as follows:           *
 *********************************************************************************/

import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        //set up the game environment
        Scanner scanner = new Scanner(System.in);
        String string = "write hangman game randomly generate word prompt user guess letter time sample run each letter displayed asterisk when make correct guess actual letter then display finish word";
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
                char guess = promptForLetter(guessedLetters, scanner);

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
            anotherGame = scanner.next().charAt(0) == 'y';
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
