package studentexample;
import mypackage.Student;
import mypackage.StudentManager;

public class StudentExample {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(new Student("Ram", 1, 95.0, "2022"));
        studentManager.addStudent(new Student("Shyam", 2, 80.0, "2022"));
        studentManager.addStudent(new Student("Jodu", 3, 70.0, "2022"));
        studentManager.addStudent(new Student("Modhu", 4, 85.0, "2022"));
        studentManager.addStudent(new Student("Gopal", 5, 90.0, "2022"));
        studentManager.writeToFile("file8.txt");
        studentManager.readFromFile("file8.txt");
    }
}
