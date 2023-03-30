package mypackage;

public class Teacher {
    private String name;
    private String collegeName;

    public Teacher() {
        this.name = "";
        this.collegeName = "";
    }

    public Teacher(String name, String collegeName) {
        this.name = name;
        this.collegeName = collegeName;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("College Name: " + collegeName);
    }
}
