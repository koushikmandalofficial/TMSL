package complexdemo;
import mypackage.Complex;


public class ComplexDemo {
    public static void main(String[] args) {
        // Creating two complex numbers
        Complex c1 = new Complex(2.5, 3.0);
        Complex c2 = new Complex(1.5, 2.0);

        // Printing the complex numbers
        System.out.println("c1 = " + c1.toString());
        System.out.println("c2 = " + c2.toString());

        // Adding the two complex numbers
        Complex sum = c1.add(c2);
        System.out.println("Sum = " + sum.toString());

        // Subtracting the two complex numbers
        Complex difference = c1.subtract(c2);
        System.out.println("Difference = " + difference.toString());

        // Multiplying the two complex numbers
        Complex product = c1.multiply(c2);
        System.out.println("Product = " + product.toString());

        // Setting new values for realPart and imaginaryPart of c1
        c1.setRealPart(4.0);
        c1.setImaginaryPart(5.0);

        // Printing the new values of c1
        System.out.println("New c1 = " + c1.toString());
    }
}
