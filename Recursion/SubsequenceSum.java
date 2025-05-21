package Recursion;

import java.util.ArrayList;
import java.util.List;

// Write a program to find subsequences whose sum is equal to 2.
// public class SubsequenceSum {

//     // Recursive method to find and print subsequences with sum = 2
//     public static void findSubsequences(int[] arr, int index, List<Integer> current, int sum) {
//         if (index == arr.length) {
//             if (sum == 2) {
//                 System.out.println(current);
//             }
//             return;
//         }

//         // Include the current element
//         current.add(arr[index]);
//         findSubsequences(arr, index + 1, current, sum + arr[index]);

//         // Exclude the current element (backtrack)
//         current.remove(current.size() - 1);
//         findSubsequences(arr, index + 1, current, sum);
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 1};
//         findSubsequences(arr, 0, new ArrayList<>(), 0);
//     }
// }


// Write a program to find only one subsequence whose sum is equal to 2.
public class SubsequenceSum {

    // Recursive method to find one subsequence with sum = 2
    public static boolean findOneSubsequence(int[] arr, int index, List<Integer> current, int sum) {
        if (index == arr.length) {
            if (sum == 2) {
                System.out.println(current);
                return true; // Found one valid subsequence
            }
            return false;
        }

        // Include the current element
        current.add(arr[index]);
        if (findOneSubsequence(arr, index + 1, current, sum + arr[index])) {
            return true; // If a valid subsequence is found, stop further recursion
        }

        // Exclude the current element (backtrack)
        current.remove(current.size() - 1);
        if (findOneSubsequence(arr, index + 1, current, sum)) {
            return true;
        }

        return false; // No valid subsequence found in this path
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        findOneSubsequence(arr, 0, new ArrayList<>(), 0);
    }
}

