package chapter12.exercise21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataSortChecker {

    public static void main(String[] args) {
        File file1 = new File("src/chapter12/exercise21/sorted.txt");
        File file2 = new File("src/chapter12/exercise21/unsortedDC.txt");

        try {
            System.out.println(isSorted(file1));
            System.out.println(isSorted(file2));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static boolean isSorted(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);

        String a = (scanner.hasNext()) ? scanner.next() : "";

        while (scanner.hasNext()) {
            String b = scanner.next();

            if (a.compareTo(b) > 0) {
                System.out.println(a + ", " + b);
                return false;
            }

            a = b;
        }

        return true;
    }
}
