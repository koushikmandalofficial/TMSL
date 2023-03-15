package calculationexample;
import mypackage.Calculation;

import java.util.Scanner;
import java.math.BigInteger;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculation cal = new Calculation();
        
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        BigInteger factorialValue = cal.factorial(num);
        System.out.println("Factorial value for " + num + " = " + factorialValue);
        
        System.out.print("Enter the number to check Prime = ");
        long n = sc.nextLong();
        boolean val = cal.isPrime(n);
        System.out.println("Check the Prime Value = " + val);
        BigInteger nextPrime = cal.nextPrime(n);
        System.out.println("Next Probable prime = " + nextPrime);
        
        System.out.println("GCD value = " + cal.gcdCalculation(6786540, 4587655));
        
        // example of gcd calculation using BigInteger
        BigInteger bigNum1 = new BigInteger("12345678901234567890");
        BigInteger bigNum2 = new BigInteger("98765432109876543210");
        BigInteger gcd = cal.gcdCalculation(bigNum1, bigNum2);
        System.out.println("GCD value for big integers = " + gcd);
    }
}
