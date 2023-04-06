package mypackage;
public class Student {
    private int roll;
    private String name;
    private String stream;
    private int admissionYear;
    private double marks;
    private College college;

    public Student(int roll, String name, String stream, int admissionYear, double marks) {
        this.roll = roll;
        this.name = name;
        this.stream = stream;
        this.admissionYear = admissionYear;
        this.marks = marks;
        this.college = null;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getStream() {
        return stream;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public double getMarks() {
        return marks;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }
}
