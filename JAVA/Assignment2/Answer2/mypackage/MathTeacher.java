package mypackage;

public class MathTeacher extends Teacher {
    private String subjectOfInterest;

    public MathTeacher() {
        this.subjectOfInterest = "";
    }

    public MathTeacher(String name, String collegeName, String subjectOfInterest) {
        super(name, collegeName);
        this.subjectOfInterest = subjectOfInterest;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Subject of Interest: " + subjectOfInterest);
    }
}
