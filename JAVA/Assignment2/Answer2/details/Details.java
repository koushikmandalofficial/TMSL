package details;
import mypackage.MathTeacher;
import mypackage.Teacher;

public class Details {

    
    public static void main(String[] args) {
      
        Teacher teacher = new Teacher("Koushik Mandal", "Techno Main Salt Lake");
        MathTeacher mathTeacher = new MathTeacher("Koushik Mandal", "Techno Main Salt Lake", "Algebra");

        System.out.println("Details of the Teacher:");
        teacher.display();

        System.out.println();

        System.out.println("Details of the Math Teacher:");
        mathTeacher.display();
    }
}