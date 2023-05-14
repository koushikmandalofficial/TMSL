package wordfrequencycounterexample;
import mypackage.WordFrequencyCounter;

public class WordFrequencyCounterExample {
    public static void main(String[] args) {
        WordFrequencyCounter wordFrequencyCounter = new WordFrequencyCounter();
        wordFrequencyCounter.countWords("file4.txt");
        wordFrequencyCounter.printWordFrequencies();
    }
}
