package mypackage;

public class Student extends Person {
    protected String roll;
    protected String regNumber;

    public Student() {
        this.roll = "";
        this.regNumber = "";
        System.out.println("Student default constructor called.");
    }

    public Student(String name, String aadharNumber, String roll, String regNumber) {
        super(name, aadharNumber);
        this.roll = roll;
        this.regNumber = regNumber;
        System.out.println("Student parameterized constructor called.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll: " + roll);
        System.out.println("Registration Number: " + regNumber);
    }
}
