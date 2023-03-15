package studentimp;
import mypackage.Student;

public class StudentImp {
    public static void main(String[] args) {
        Student s1 = new Student("Sutapa Sen", 25, 76, "2010");
        Student s2 = new Student("Amal Basu", 15, 85, "2010");
        Student s3 = new Student("Hitesh Bagchi", 31, 66, "2010");

        s1.display();
        s2.display();
        s3.display();

        Student[] students = {s1, s2, s3};
        int maxMarks = -1;
        Student topStudent = null;
        for (Student s : students) {
            if (s.getStMarks() > maxMarks) {
                maxMarks = s.getStMarks();
                topStudent = s;
            }
        }
        if (topStudent != null) {
            System.out.println("Student with highest marks: Roll " + topStudent.getStRoll() +
                    ", Name " + topStudent.getStName() + ", Marks " + topStudent.getStMarks());
        }
    }
}

