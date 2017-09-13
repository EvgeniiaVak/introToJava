package chapter12.exercise20;

import chapter12.exercise18.PackagePrinter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static chapter12.exercise18.PackagePrinter.getStatement;
import static chapter12.exercise18.PackagePrinter.hasPackageStatement;

public class PackageRemover {
    public static void main(String[] args) {
        //try to find path input
        if (args.length != 1) {
            System.out.println("usage: java PackagePrinter <directory to edit files in>");
            System.exit(1);
        }
        String path = args[0];

        //check the the path is for directory
        File directory = new File(path);
        if (!directory.exists()) {
            System.out.println("no such directory");
            System.exit(2);
        }
        if (!directory.isDirectory()) {
            System.out.println("the path argument was not a directory");
            System.exit(3);
        }

        //try to get files
        File[] files = directory.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("there are no files in the directory");
            System.exit(4);
        }

        //for each file in the directory
        //compare first line to the statement
        String statement = getStatement(path);

        try {
            for (File file : files) {

                if (file.getName().endsWith(".txt")) {
                    if (hasPackageStatement(statement, file)) {
                        String copy = copyFromFileWithoutPackage(file);

                        //clear all and print the new version without the statement
                        PrintWriter writer = new PrintWriter(file);
                        writer.print(copy);
                        writer.close();
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static String copyFromFileWithoutPackage(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        StringBuilder builder = new StringBuilder();

        //omit first line because it's the package statement
        scanner.nextLine();

        //omit empty lines after the package statement
        String nextValidLine = "";
        while (nextValidLine.isEmpty() && scanner.hasNext()) {
            nextValidLine = scanner.nextLine();
        }

        //append first not empty line
        builder.append(nextValidLine);

        //append the rest of the lines
        while (scanner.hasNext()) {
            builder.append(System.getProperty("line.separator"));

            String line = scanner.nextLine();
            builder.append(line);
        }

        return builder.toString();
    }
}
