package mypackage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWordFrequencyCounter {
    public void countWordFrequency(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int wordCount = 0;
            int lineCount = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
            System.out.println("Total number of words: " + wordCount);
            System.out.println("Total number of lines: " + lineCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading from " + fileName);
            e.printStackTrace();
        }
    }
}
