package mypackage;

import java.io.*;
import java.util.*;

public class Student implements Serializable {
    private String name;
    private int roll;
    private double marks;
    private String year;

    public Student(String name, int roll, double marks, String year) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public double getMarks() {
        return marks;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll: " + roll + ", Marks: " + marks + ", Year: " + year;
    }
}




