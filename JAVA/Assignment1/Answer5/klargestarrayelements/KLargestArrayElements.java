package klargestarrayelements;

import java.util.Arrays;

public class KLargestArrayElements {
    public static void main(String[] args) {
        int[] arr = { 12, 45, 1, -1, 45, 16, 97, 100 };
        int k = 3; // initialize k
        int[] kLargest = findKLargest(arr, k);
        System.out.println("The " + k + " largest elements in the array are: " + Arrays.toString(kLargest));
    }

    public static int[] findKLargest(int[] arr, int k) {
        Arrays.sort(arr); // sort the array in ascending order
        int[] kLargest = new int[k]; // create a new array to store the k largest elements
        for (int i = arr.length - 1, j = 0; i >= arr.length - k; i--, j++) {
            kLargest[j] = arr[i]; // iterate over the last k elements in the sorted array and add them to kLargest
        }
        return kLargest;
    }
}
