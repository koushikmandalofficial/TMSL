package newpackage;

import java.util.Arrays;

public class ArrayDemo {
    
    int[] arr;

    public ArrayDemo(int[] arr) {
        this.arr = arr;
    }
    
    public static int[] findKLargest(int[] arr, int k) {
        Arrays.sort(arr); 
        int[] kLargest = new int[k]; 
        
        int index = 0;
        for (int i = arr.length - k; i < arr.length; i++) {
        kLargest[index++] = arr[i];
        }
        
        return kLargest;
    }
    
}
