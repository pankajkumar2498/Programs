package Array;

import java.util.Arrays;

public class Max_Min {

    static int Max(int[] arr) {
        if (arr.length == 0)
            return -1;

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int MaxRange(int[] arr, int start, int end) {

        if ((start > end) || (arr.length == 0))
            return -1;

        int max = arr[start];
        for (int i = start; i < end; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int Min(int[] arr) {

        if (arr.length == 0)
            return -1;

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    // Find Minimum using BinarySearch
    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length -1;

        while(start < end){
            int mid = start + (end - start)/2;

            if( nums[mid] > nums[end] ){
                start = mid + 1;
            }else if(nums[mid] < nums[end]){
                end = mid;
            }
        }
        return nums[start];      
    }

    static int MinRange(int[] arr, int start, int end) {
        if ((start > end) || (arr.length == 0))
            return -1;

        int min = arr[start];
        for (int i = start; i < end; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

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

    // Reverse Array by Recursion
    static int[] reverseRecursive(int[] arr, int start, int end) {

        if (start > end) {
            return new int[] { -1 };
        } else {
            swap(arr, start, end);
            return reverseRecursive(arr, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 23, 43, 67, 76, 87 };

        // To sort the Array using Arrays.sort method
        // Arrays.sort(arr);
        // System.out.print("Sorted Array: ");
        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }


        System.out.println(Min(arr));

        System.out.println(MinRange(arr, 1, 4));

        System.out.println(Max(arr));

        System.out.println(MaxRange(arr, 1, 4));

        
        reverse(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println(Arrays.toString(arr));

        System.out.println();

        int[] rev = reverseRecursive(arr, 0, arr.length - 1);
        for (int i : rev) {
            System.out.print(i + " ");
        }

    }

}
