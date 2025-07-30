package Practice;

import java.util.Arrays;

public class Rotate {

    static void reverse(int[] arr, int start, int end) {

        while (start >= end) {
            return;
        }

        swap(arr, start, end);
        reverse(arr, start + 1, end - 1);
    }

    private static void swap(int[] arr, int start, int end) {
        arr[start] = arr[start] ^ arr[end];
        arr[end] = arr[start] ^ arr[end];
        arr[start] = arr[start] ^ arr[end];
    }

    private static void rotateByRight(int[] arr, int k) {
        k = k % arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    private static void rotateByLeft(int[] arr, int k) {
        k = k % arr.length;

        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 23, 56, 76, 12, 7 };
        int k = 2;

        System.out.println("Original Array: "+Arrays.toString(arr));
        rotateByLeft(arr, k);
        System.out.println("Left Rotation by "+ k + " places: "+Arrays.toString(arr));
        
        rotateByRight(arr, k);
        System.out.println("Right Rotation by "+ k + " places: "+Arrays.toString(arr));

    }

}
