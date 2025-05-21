package Recursion;

// // Write a program to count the no. of subsequences.
// public class CountSubsequences {

//     // Recursive method to count all subsequences
//     public static int countSubsequences(int[] arr, int index) {
//         if (index == arr.length) {
//             return 1; // Base case: one subsequence (even if empty)
//         }

//         // Count including the current element
//         int left = countSubsequences(arr, index + 1);

//         // Count excluding the current element
//         int right = countSubsequences(arr, index + 1);

//         return left + right;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3};
//         int total = countSubsequences(arr, 0);
//         System.out.println("Total number of subsequences: " + total);
//     }
// }

// Write a program to count the no. of subsequences in array when sum of subsequence is equal to k.
public class CountSubsequences {

    // Recursive method to count subsequences with sum equal to k
    public static int countSubsequences(int[] arr, int index, int currentSum, int k) {
        if (index == arr.length) {
            return currentSum == k ? 1 : 0;
        }

        // Include current element
        int left = countSubsequences(arr, index + 1, currentSum + arr[index], k);

        // Exclude current element
        int right = countSubsequences(arr, index + 1, currentSum, k);

        return left + right;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1 };
        int k = 1;
        int count = countSubsequences(arr, 0, 0, k);
        System.out.println("Number of subsequences with sum " + k + ": " + count);
    }
}
