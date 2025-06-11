package Striver_DSA_Sheet.Array.Easy;

import java.util.Arrays;

public class RotatedArray {

    static void rotateByLeft(int[] arr, int k) {

        k = k % arr.length;

        reverse(arr, 0, k - 1);

        reverse(arr, k, arr.length - 1);

        reverse(arr, 0, arr.length - 1);

    }

    static void rotateByRight(int[] arr, int k) {

        k = k % arr.length;

        reverse(arr, 0, arr.length - 1);

        reverse(arr, 0, k - 1);

        reverse(arr, k, arr.length - 1);

    }

    static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    static void reverse(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }
        swap(arr, start, end);
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 6, 7 };
        int k = 2;

        System.out.println("Original Array: " + Arrays.toString(arr));

        // rotateByLeft(arr, k);
        // System.out.println("Left Rotation: " + Arrays.toString(arr));

        rotateByRight(arr, k);
        System.out.println("Right Rotation: " + Arrays.toString(arr));

    }

}
