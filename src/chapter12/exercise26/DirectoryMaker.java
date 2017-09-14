package chapter12.exercise26;

import java.io.File;
import java.util.Scanner;

public class DirectoryMaker {
    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("enter directory name");
        String path = consoleScanner.next();

        File file = new File(path);

        if (file.mkdirs()) {
            System.out.println("success");
        } else {
            System.out.println("failure");
        }
    }
}
