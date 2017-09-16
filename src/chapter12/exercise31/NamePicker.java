package chapter12.exercise31;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NamePicker {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        int year = 0;
        while (!(year >= 2010 && year <= 2016)) {
            System.out.println("Enter the year: (from 2010 to 2016)");
            try {
                year = userInputScanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("a year might only be an integer");
                userInputScanner.nextLine();
            }
        }

        char gender = 0;
        while (!(gender == 'M' || gender == 'F')) {
            System.out.println("Enter gender: (M/F)");
            gender = Character.toUpperCase(userInputScanner.next().charAt(0));
        }

        System.out.println("Enter the name: ");
        String name = userInputScanner.next();

        String path = "src/chapter12/exercise31/data/babynameranking" + year + ".txt";
        File file = new File(path);
        try {
            Scanner fileScanner = new Scanner(file);
            int rank = 0;

            while (fileScanner.hasNext()) {
                String[] line = fileScanner.nextLine().split("\\s");
                int index = (gender == 'M') ? 1 : 3;
                rank++;
                if (line[index].equals(name)) {
                    System.out.printf("%s is ranked #%d in year %d", name, rank, year);
                    System.exit(0);
                }
            }

            System.out.printf("%s was not ranked in year %d", name, year);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
