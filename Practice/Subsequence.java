package Practice;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {

    static void findSubsequence(int[] arr, int index, List<Integer> current, List<List<Integer>> allSubseq) {

        if (index == arr.length) {
            allSubseq.add(new ArrayList<>(current));
            return;
        }

        current.add(arr[index]);
        findSubsequence(arr, index + 1, current, allSubseq);

        current.remove(current.size() - 1);
        findSubsequence(arr, index + 1, current, allSubseq);

    }

    public static void main(String[] args) {

        int[] arr = { 3, 2, 1 };

        List<Integer> current = new ArrayList<Integer>();
        List<List<Integer>> allSubseq = new ArrayList<>();

        findSubsequence(arr, 0, current, allSubseq);

        for (List<Integer> list : allSubseq) {
            System.out.println(list);
        }
    }
}
