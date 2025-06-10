package Striver_DSA_Sheet.Array.Easy;

public class LargestElement {

    static int largestElement(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 3, 0, 99, -40 };

        System.out.println(largestElement(nums));

    }
}
