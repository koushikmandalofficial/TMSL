package mypackage;
import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    private Map<String, Integer> wordFrequencyMap;

    public WordFrequencyCounter() {
        wordFrequencyMap = new HashMap<>();
    }

    public void countWords(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
                    if (!cleanWord.isEmpty()) {
                        int frequency = wordFrequencyMap.getOrDefault(cleanWord, 0);
                        wordFrequencyMap.put(cleanWord, frequency + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    public void printWordFrequencies() {
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
