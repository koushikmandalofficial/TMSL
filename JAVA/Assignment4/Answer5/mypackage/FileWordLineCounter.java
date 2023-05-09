package mypackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWordLineCounter {
    private int wordCount;
    private int lineCount;

    public void countWordsAndLines(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from " + fileName);
            e.printStackTrace();
        }
    }

    public int getWordCount() {
        return wordCount;
    }

    public int getLineCount() {
        return lineCount;
    }
}

