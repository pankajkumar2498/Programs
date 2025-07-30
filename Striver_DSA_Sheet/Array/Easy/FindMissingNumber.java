package Striver_DSA_Sheet.Array.Easy;

// Given an integer array of size n containing distinct values in the range from 0 to n (inclusive), return the only number missing from the array within this range.

// Examples:
// Input: nums = [0, 2, 3, 1, 4]
// Output: 5
// Explanation: nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]

// Input: nums = [0, 1, 2, 4, 5, 6]
// Output: 3
// Explanation: nums contains 0, 1, 2, 4, 5, 6 thus leaving 3 as the only missing number in the range [0, 6]

//Input: nums = [1, 3, 6, 4, 2, 5]
// Output: 0


public class FindMissingNumber {
    
    // this function works only for sorted array
    // static int findMissingNumber(int[] arr) {
    //        Arrays.sort(arr);
    //     for (int i = 0; i < arr.length; i++) {
    //         int j = i + 1;

    //         if (arr[j] - arr[i] != 1) {
    //             return arr[i] + 1;
    //         }
    //     }
    //     return -1;
    // }


    // Optimal Approch --> T.C = O(N); S.C = O(1)
    static int findMissingNumber1(int[] arr, int N) {

        //Find Summation of first N numbers:
        int totalSum = (N * (N + 1)) / 2;
        
        // Find Sum of All the elements of array.
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return totalSum-sum;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 4, 5, 6 };
        int N = arr.length; // N is the number of elements in Array
        
        System.out.println("Missing Number in given Array is: " + findMissingNumber1(arr, N));

    }

}
