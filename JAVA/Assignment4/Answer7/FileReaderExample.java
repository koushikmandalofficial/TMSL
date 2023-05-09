package filereaderexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\HP\\Desktop\\JavaTest";
        int totalFiles = 0;

        // List all files in the folder
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        // Loop through each file and print its content
        for (File file : files) {
            if (file.isFile() && (file.getName().endsWith(".txt") || file.getName().endsWith(".TXT"))) {
                totalFiles++;
                System.out.println("File name: " + file.getName());
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred while reading from " + file.getName());
                    e.printStackTrace();
                }
                System.out.println("-------------------------------");
            }
        }

        // Print the total number of .txt or .TXT files in the folder
        System.out.println("Total number of .txt or .TXT files: " + totalFiles);
    }
}
