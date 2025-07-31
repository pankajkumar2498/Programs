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
    
    // Optimal Approch --> T.C = O(N); S.C = O(1)
    static int missingNumber(int[] nums) {
        int Arraysum = 0;
        for (int i = 0; i < nums.length; i++) {
            Arraysum += nums[i];
        }

        int expectedSum = (nums.length * (nums.length + 1)) / 2;

        return expectedSum - Arraysum;
    }

    // Perform XOR Operation --> Faster and Safe
    static int missingNumber1(int[] nums) {
        int xor = 0;
        
        // XOR all elements from 0 to N --> Range[0,N]
        for (int i = 0; i <= nums.length; i++) {
            xor ^= i;
        }

        // XOR all elements in Array.
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 4, 5, 6 };
        int N = arr.length; // N is the number of elements in Array
        
        System.out.println("Missing Number in given Array is: " + missingNumber(arr));
        System.out.println("Missing Number in given Array is: " + missingNumber1(arr));
    }

}
