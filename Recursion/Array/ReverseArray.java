package Recursion.Array;

import java.util.Arrays;

public class ReverseArray {

    // Reverse Array without Recursion
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Reverse Array using two pointers by Recursion
    static int[] reverseRecursive(int[] arr, int start, int end) {

        if (start >= end) {
            return new int[] { -1 };
        } 
            swap1(arr, start, end);
            return reverseRecursive(arr, start + 1, end - 1);
        
    }

    // Swap two indexes using third variable
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Swap two indexes without using third variable
    static void swap1(int[] arr, int index1, int index2) {
        arr[index1] = arr[index1] + arr[index2];
        arr[index2] = arr[index1] - arr[index2];
        arr[index1] = arr[index1] - arr[index2];
    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 1, 5, 9 };

        System.out.println("Original Array: " + Arrays.toString(arr));

        reverseRecursive(arr, 0, arr.length - 1);

        System.out.println("Reversed Array: " + Arrays.toString(arr));

    }

}
