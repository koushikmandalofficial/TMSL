package mypackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PatternSearcher {
    public void searchForPattern(String fileName, String pattern) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int totalOccurrences = 0;
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                int index = 0;
                while ((index = line.indexOf(pattern, index)) != -1) {
                    totalOccurrences++;
                    System.out.println("Line " + lineNumber + ", Position " + index);
                    index += pattern.length();
                }
            }
            System.out.println("Total occurrences of pattern '" + pattern + "': " + totalOccurrences);
        } catch (IOException e) {
            System.out.println("An error occurred while reading from " + fileName);
            e.printStackTrace();
        }
    }
}
