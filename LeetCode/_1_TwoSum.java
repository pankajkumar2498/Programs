import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_TwoSum {

    public static int[] twoSumBruteForce(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static int[] twoSumGreedyTwoPointer(int[] arr, int target, int left, int right) {
        // Note: Sort the array or applying Two Pointer Approach
        Arrays.sort(arr); // Necessary for two-pointer approach
        while (left < right) {
            if (arr[left] + arr[right] == target) {
                return new int[] { left, right };
            } else if ((arr[left] + arr[right]) < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {};
    }

    public static int[] twoSumUsingHashing(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int remaining = target - arr[i];

            if (map.containsKey(remaining)) {
                return new int[] { map.get(remaining), i };
            } else {
                map.put(arr[i], i);
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 12, 3, 24, 1, 2, 5 };
        int target = 6;

        // int[] result1 = twoSumBruteForce(nums, target);
        // System.out.println(Arrays.toString(result1));

        // int[] result2 = twoSumGreedyTwoPointer(nums, target, 0, nums.length - 1);
        // System.out.println(Arrays.toString(result2));
        
        int[] result3 = twoSumUsingHashing(nums, target);
        System.out.println(Arrays.toString(result3));

    }
}
