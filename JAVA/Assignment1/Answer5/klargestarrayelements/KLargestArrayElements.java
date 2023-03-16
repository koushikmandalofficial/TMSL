package klargestarrayelements;
import newpackage.ArrayDemo;

import java.util.Arrays;

public class KLargestArrayElements {
    public static void main(String[] args) {
        
        int[] arr = { 12, 45, 1, -1, 45, 16, 97, 100 };
        int k = 3; 
        
        ArrayDemo obj = new ArrayDemo(arr);
        
        int[] kLargest = obj.findKLargest(arr, k);
        System.out.println("The " + k + " largest elements in the array are: " + Arrays.toString(kLargest));
       
    }

    
}
