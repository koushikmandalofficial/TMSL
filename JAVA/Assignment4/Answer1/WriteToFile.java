import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        String fileName = "demofile.txt";
        String data = "Object Oriented Programming world.\n"
                    + "Java is Object Oriented Programming Language.\n"
                    + "Java is Platform independent language.\n"
                    + "Java supports Multithreading. Java virtual machine is important.";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(data);
            writer.close();
            System.out.println("Data has been written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to " + fileName);
            e.printStackTrace();
        }
    }
}
