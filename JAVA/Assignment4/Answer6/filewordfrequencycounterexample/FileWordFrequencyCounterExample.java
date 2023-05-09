package filewordfrequencycounterexample;
import mypackage.FileWordFrequencyCounter;
public class FileWordFrequencyCounterExample {
    public static void main(String[] args) {
        String fileName = "file4.txt";
        FileWordFrequencyCounter counter = new FileWordFrequencyCounter();
        counter.countWordFrequency(fileName);
    }
}

