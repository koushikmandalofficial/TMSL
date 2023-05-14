package studentexample;
import mypackage.Student;
import mypackage.StudentManager;

public class StudentExample {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(new Student("Alice", 1, 95.0, "2022"));
        studentManager.addStudent(new Student("Bob", 2, 80.0, "2022"));
        studentManager.addStudent(new Student("Charlie", 3, 70.0, "2022"));
        studentManager.addStudent(new Student("David", 4, 85.0, "2022"));
        studentManager.addStudent(new Student("Eve", 5, 90.0, "2022"));

        studentManager.writeToFile("file8.txt");
        studentManager.readFromFile("file8.txt");
    }
}
