package Recursion;
import java.util.ArrayList;
import java.util.List;

// Write a program to find all subsequences of String.
public class StringSubsequences {

    // Recursive method to find subsequences of a string
    public static void findSubsequences(String str, int index, String current, List<String> allSubseq) {
        if (index == str.length()) {
            allSubseq.add(current); // Add the current subsequence
            return;
        }

        // Include the current character
        findSubsequences(str, index + 1, current + str.charAt(index), allSubseq);

        // Exclude the current character
        findSubsequences(str, index + 1, current, allSubseq);
    }

    public static void main(String[] args) {
        String input = "abc"; // Our source of musical letters
        List<String> allSubseq = new ArrayList<>();

        findSubsequences(input, 0, "", allSubseq);

        System.out.println("All subsequences of \"" + input + "\":");
        for (String subseq : allSubseq) {
            System.out.println("\"" + subseq + "\"");
        }
    }
}

