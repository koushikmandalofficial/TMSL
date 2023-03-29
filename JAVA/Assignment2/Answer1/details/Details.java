package details;
import mypackage.Person;
import mypackage.Student;

public class Details {
    public static void main(String[] args) {
        Person p = new Person("Koushik Mnadal", "123456789012");
        p.display();

        System.out.println();

        Student s = new Student("Koushik Mandal", "098765432109", "123", "XYZ987");
        s.display();
    }
}