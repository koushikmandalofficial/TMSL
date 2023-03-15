package mypackage;

import java.math.BigInteger;

public class Calculation {
    // function to calculate the factorial value of a number
    public static BigInteger factorial(int num) {
        BigInteger fact = BigInteger.valueOf(1);
        for(int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
    
    // function to check if a number is prime or not
    public static boolean isPrime(long n) {
        if(n <= 1) {
            return false;
        }
        for(long i = 2; i*i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // function to find the next probable prime number
    public static BigInteger nextPrime(long n) {
        BigInteger num = BigInteger.valueOf(n+1);
        while(!num.isProbablePrime(100)) {
            num = num.add(BigInteger.ONE);
        }
        return num;
    }
    
    // function to calculate the gcd of two numbers
    public static int gcdCalculation(int num1, int num2) {
        while(num2 != 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }
    
    // function to calculate the gcd of two big integer numbers
    public static BigInteger gcdCalculation(BigInteger num1, BigInteger num2) {
        return num1.gcd(num2);
    }
}
