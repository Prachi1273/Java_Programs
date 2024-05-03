import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <file or directory path>");
            return;
        }

        File file = new File(args[0]);

        if (file.isDirectory()) {
            File[] files = file.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return name.toLowerCase().endsWith(".txt");
                }
            });

            Scanner scanner = new Scanner(System.in);
            System.out.println("Are you sure you want to delete all text files in the directory? (yes/no)");
            String response = scanner.next();

            if (response.equalsIgnoreCase("yes")) {
                int count = 0;
                for (File f : files) {
                    if (f.delete()) {
                        count++;
                    }
                }
                System.out.println(count + " files deleted.");
            }
        } else if (file.isFile()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("File Path: " + file.getPath());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("Last Modified: " + new Date(file.lastModified()));
        } else {
            System.out.println("The specified path does not exist or is not a file or directory.");
        }
    }
}

