
package mypackage;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    // Default constructor
    public Complex() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    // Constructor with parameters
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // Method to add two complex numbers
    public Complex add(Complex otherNumber) {
        double real = this.realPart + otherNumber.realPart;
        double imaginary = this.imaginaryPart + otherNumber.imaginaryPart;
        return new Complex(real, imaginary);
    }

    // Method to subtract two complex numbers
    public Complex subtract(Complex otherNumber) {
        double real = this.realPart - otherNumber.realPart;
        double imaginary = this.imaginaryPart - otherNumber.imaginaryPart;
        return new Complex(real, imaginary);
    }

    // Method to multiply two complex numbers
    public Complex multiply(Complex otherNumber) {
        double real = this.realPart * otherNumber.realPart - this.imaginaryPart * otherNumber.imaginaryPart;
        double imaginary = this.realPart * otherNumber.imaginaryPart + this.imaginaryPart * otherNumber.realPart;
        return new Complex(real, imaginary);
    }

    // Setter method for realPart
    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    // Setter method for imaginaryPart
    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    // Getter method for realPart
    public double getRealPart() {
        return realPart;
    }

    // Getter method for imaginaryPart
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    // toString method to print complex number
    public String toString() {
        return "(" + realPart + " + " + imaginaryPart + "i)";
    }
}
