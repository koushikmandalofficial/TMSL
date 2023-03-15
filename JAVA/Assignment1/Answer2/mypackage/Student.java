
package mypackage;

public class Student {
    private String stName_;
    private int stroll_;
    private int stMarks_;
    private String stYear_;

    public Student() {
        stroll_ = 0;
        stMarks_ = -1;
    }

    public Student(String name, int roll, int marks, String year) {
        this();
        setStName(name);
        setStRoll(roll);
        setStMarks(marks);
        setStYear(year);
    }

    public String getStName() {
        return stName_;
    }

    public void setStName(String stName) {
        this.stName_ = stName;
    }

    public int getStRoll() {
        return stroll_;
    }

    public void setStRoll(int stroll) {
        if (stroll >= 1 && stroll <= 60) {
            this.stroll_ = stroll;
        } else {
            System.out.println("Invalid roll number.");
        }
    }

    public int getStMarks() {
        return stMarks_;
    }

    public void setStMarks(int stMarks) {
        if (stMarks >= 0 && stMarks <= 100) {
            this.stMarks_ = stMarks;
        } else {
            System.out.println("Invalid marks.");
        }
    }

    public String getStYear() {
        return stYear_;
    }

    public void setStYear(String stYear) {
        this.stYear_ = stYear;
    }

    public void display() {
        System.out.println("Student Name: " + getStName());
        System.out.println("Student Roll: " + getStRoll());
        System.out.println("Marks obtained by Student: " + getStMarks());
        System.out.println("Student Year: " + getStYear());
    }

    public Student displayRollName() {
        System.out.println("Student Roll: " + getStRoll() + ", Name: " + getStName());
        return this;
    }
}
