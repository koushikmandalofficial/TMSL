package register;
import mypackage.College;
import mypackage.Student;
public class Register {

    
    public static void main(String[] args) {
        
        
        College college1 = new College(130, "Techno Main Salt Lake");
        College college2 = new College(779, "Techno India University");

        Student student1 = new Student(1, "Koushik Mandal", "MCA", 2022,90);
        Student student2 = new Student(1, "Snahangshu Sarkar", "MCA", 2022,92);
        Student student3 = new Student(3, "Sutanu Mahata", "MCA", 2022, 92);
        Student student4 = new Student(3, "Rishav Mandal", "B.Tech (CS)", 2022, 92);
        
        college1.addStudent(student1);  
        college1.addStudent(student2);
        college1.addStudent(student3); 
        college2.addStudent(student4); 
        college1.addStudent(student3); 
       
    }
    
}
