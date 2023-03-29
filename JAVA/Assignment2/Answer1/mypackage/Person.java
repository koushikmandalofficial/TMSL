package mypackage;

public class Person {
    protected String name;
    protected String aadharNumber;

    public Person() {
        this.name = "";
        this.aadharNumber = "";
        System.out.println("Person default constructor called.");
    }

    public Person(String name, String aadharNumber) {
        this.name = name;
        this.aadharNumber = aadharNumber;
        System.out.println("Person parameterized constructor called.");
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadharNumber);
    }
}
