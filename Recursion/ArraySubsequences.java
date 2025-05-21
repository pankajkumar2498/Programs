package Recursion;
import java.util.ArrayList;
import java.util.List;

// Write a program to find all subsequences of Array.
public class ArraySubsequences {

    // Recursive method to find subsequences
    public static void findSubsequences(int[] arr, int index, List<Integer> current, List<List<Integer>> allSubseq) {
        if (index == arr.length) {
            allSubseq.add(new ArrayList<>(current));
            return;
        }

        // Include the current element
        current.add(arr[index]);
        findSubsequences(arr, index + 1, current, allSubseq);

        // Exclude the current element (backtrack)
        current.remove(current.size() - 1);
        findSubsequences(arr, index + 1, current, allSubseq);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // Feel free to change this to your own poetic numbers
        List<List<Integer>> allSubseq = new ArrayList<>();

        findSubsequences(arr, 0, new ArrayList<>(), allSubseq);

        System.out.println("All subsequences:");
        for (List<Integer> subseq : allSubseq) {
            System.out.println(subseq);
        }
    }
}
