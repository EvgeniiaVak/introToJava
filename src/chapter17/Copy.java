package chapter17;

import java.io.*;

public class Copy {

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("usage: java Copy <source> <target>");
            System.exit(1);
        }

        File source = new File(args[0]);
        if (!source.exists()) {
            System.out.println("source does not exist");
            System.exit(2);
        }

        File target = new File(args[1]);
        if (target.exists()) {
            System.out.println("target already exist");
            System.exit(3);
        }

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(source));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(target));

        long bytesCount = 0;
        int input = 0;

        while ((input = bufferedInputStream.read()) != -1) {
            bytesCount++;
            bufferedOutputStream.write(input);
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();

        System.out.println("copied " + bytesCount + " bytes");
    }
}
