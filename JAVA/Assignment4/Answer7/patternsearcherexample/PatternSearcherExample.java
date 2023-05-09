package patternsearcherexample;
import mypackage.PatternSearcher;

public class PatternSearcherExample {
    public static void main(String[] args) {
        String fileName = "file4.txt";
        String pattern = "Java";
        PatternSearcher searcher = new PatternSearcher();
        searcher.searchForPattern(fileName, pattern);
    }
}
