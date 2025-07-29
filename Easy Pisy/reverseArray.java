package Practice;
import java.util.Arrays;

public class reverseArray {

    static int[] reverse(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[nums.length - 1 - i];
        }
        return nums;
    }

    static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }

    static int[] reverseUsingRecursion(int[] arr, int start, int end) {

        if (start >= end) {
            return new int[] { -1 };
        }
        swap(arr, start, end);
        return reverseUsingRecursion(arr, start + 1, end - 1);

    }

    public static void main(String[] args) {

        int[] nums = { 23, 34, 45, 56 };

        reverse(nums);

        System.out.println(Arrays.toString(nums));
        
        reverseUsingRecursion(nums, 0, nums.length - 1);
        
        System.out.println(Arrays.toString(nums));

    }
}
