package mypackage;
import java.util.ArrayList;
import java.util.List;

public class College {
    private int id;
    private String name;
    private List<Student> students;

    public College(int id, String name) {
        this.id = id;
        this.name = name;
        this.students = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if (student.getCollege() != null) {
            System.out.println("Error: Student " + student.getName() + " is already registered in another college.");
            return;
        }
        
        student.setCollege(this);
        this.students.add(student);
        System.out.println("Student " + student.getName() + " added in "+this.name);
    }
}
