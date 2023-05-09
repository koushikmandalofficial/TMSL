package filecharreader;
import java.io.FileReader;
import java.io.IOException;

public class FileCharReader {
    public static void main(String[] args) {
        String fileName = "file4.txt";

        try (FileReader reader = new FileReader(fileName)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from " + fileName);
            e.printStackTrace();
        }
    }
}
