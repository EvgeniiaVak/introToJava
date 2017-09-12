package chapter12.exercise18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PackagePrinter {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("usage: java PackagePrinter <directory to edit files in>");
            System.exit(1);
        }

        String path = args[0];

        try {
            //find the requested directory
            File directory = new File(path);
            File[] files = directory.listFiles();

            //if there are no files there - exit the program
            if (files == null || files.length == 0) {
                System.out.println("there are no files in the directory");
                System.exit(2);
            }

            String statement = getStatement(path);

            //for every file that ends with .txt
            //(the exercise asks for .java but it's not possible, because we already have package statements)
            //put the statement in the beginning of the file
            for (File file : files) {

                if (file.getName().endsWith(".txt")) {
                    //if file already has the statement do nothing
                    Scanner fileScanner = new Scanner(file);
                    if (hasPackageStatement(statement, file))
                        continue;

                    //copy everything to append later
                    String copy = copyFromFile(file);
                    PrintWriter writer = new PrintWriter(file);

                    writer.println(statement);
                    writer.print(copy);

                    fileScanner.close();
                    writer.close();
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("couldn't find files");
        }
    }

    public static boolean hasPackageStatement(String statement, File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        return scanner.hasNext() && scanner.nextLine().trim().equals(statement.trim());
    }

    public static String getStatement(String pathForDirectory) {
        String[] dirs = pathForDirectory.split(File.separator);

        String statement = "package ";
        //as we build in IntelliJ IDEA we don't need "src", so i starts with 1
        for (int i = 1; i < dirs.length; i++) {
            statement += dirs[i];
            if (i < dirs.length - 1) {
                statement += ".";
            } else {
                statement += ";";
            }
        }
        statement += "\n";

        return statement;
    }

    public static String copyFromFile (File file) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            builder.append(line);

            if (scanner.hasNext())
                builder.append(System.getProperty("line.separator"));
        }

        scanner.close();
        return builder.toString();
    }
}
