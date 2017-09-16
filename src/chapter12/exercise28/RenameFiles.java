package chapter12.exercise28;

import chapter12.exercise27.ZeroAdder;

import java.io.File;
import java.io.IOException;

public class RenameFiles {
    public static void main(String[] args) throws IOException{
        if (args.length == 0) {
            System.out.println("usage: java RenameFiles <directory>");
            System.exit(1);
        }

        String path = args[0];
        File dir = new File(path);
        File[] files = dir.listFiles();

        for (File file : files) {
            String fileName = file.getName();

            if (fileName.endsWith(".java")) {
                String nameWithoutFormat = fileName.substring(0, fileName.length() - 5);
                String neededName = ZeroAdder.padZeroesToExerciseName(nameWithoutFormat);
                String neededNameWithJava = neededName + ".java";

                if (!nameWithoutFormat.equals(neededName)) {

                    System.out.println("Source: " + nameWithoutFormat);
                    System.out.println("Renamed: " + neededName);

                    boolean success = file.renameTo(new File(path + "/" + neededNameWithJava));
                    System.out.println(success);
                }
            }
        }

        ZeroAdder.main(new String[]{path});
    }
}
