package filewordlinecounterexample;
import mypackage.FileWordLineCounter;

public class FileWordLineCounterExample {
    public static void main(String[] args) {
        String fileName = "file4.txt";
        FileWordLineCounter counter = new FileWordLineCounter();
        counter.countWordsAndLines(fileName);
        System.out.println("Total number of words: " + counter.getWordCount());
        System.out.println("Total number of lines: " + counter.getLineCount());
    }
}

