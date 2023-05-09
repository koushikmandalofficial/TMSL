package wordcounterexample;
import java.util.Scanner;
import mypackage.WordCounter;

public class WordCounterExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = sc.nextLine();  
        int wordCount = WordCounter.countWords(input);
        System.out.println("The input string contains " + wordCount + " words.");
    }
}

