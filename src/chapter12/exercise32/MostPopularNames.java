package chapter12.exercise32;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MostPopularNames {
    public static final int NUMBER_OF_NAMES = 5;

    public static void main(String[] args) throws FileNotFoundException {
        File dir = new File("src/chapter12/exercise31/data");
        File[] files = dir.listFiles();


        for (int i = 0; i < NUMBER_OF_NAMES; i++) {
            System.out.print("-------------------------");
        }
        System.out.println();

        System.out.print("Year\t");
        for (int i = 1; i <= NUMBER_OF_NAMES; i++) {
            System.out.print("Rank" + i + "\t\t");
        }
        for (int i = 1; i <= NUMBER_OF_NAMES; i++) {
            System.out.print("Rank" + i + "\t\t");
        }
        System.out.println();

        for (int i = 0; i < NUMBER_OF_NAMES; i++) {
            System.out.print("-------------------------");
        }
        System.out.println();

        for (File file : files) {
            //babynameranking2010.txt
            String year = file.getName().substring(15, 19);
            Scanner scanner = new Scanner(file);

            String[] boys = new String[NUMBER_OF_NAMES];
            String[] girls = new String[NUMBER_OF_NAMES];
            for (int i = 0; i < NUMBER_OF_NAMES; i++) {
                if (scanner.hasNext()) {
                    String[] line = scanner.nextLine().split("\\s");

                    boys[i] = line[1];
                    girls[i] = line[3];
                }
            }

            System.out.print(year + "\t");
            for (int i = 0; i < NUMBER_OF_NAMES; i++) {
                printName(boys[i]);
            }
            for (int i = 0; i < NUMBER_OF_NAMES; i++) {
                printName(girls[i]);
            }
            System.out.println();
        }
    }

    private static void printName(String name) {
        if (name.length() < 4) {
            System.out.print(name + "\t\t\t");
        } else if (name.length() > 7) {
            System.out.print(name + "\t");
        } else {
            System.out.print(name + "\t\t");
        }
    }
}
