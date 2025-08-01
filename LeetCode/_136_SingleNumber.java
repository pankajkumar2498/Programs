// 136. Single Number
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Example 1:
// Input: nums = [2,2,1]
// Output: 1

// Example 2:
// Input: nums = [4,1,2,1,2]
// Output: 4

// Example 3:
// Input: nums = [1]
// Output: 1

public class _136_SingleNumber {
    
    // Perform XOR Operation
    static int singleNumber(int[] nums) {
        int result =0;

        // XOR: a^a = 0, a^0 = a
        for (int i : nums) {
            result = result ^ i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,3};

        int result = singleNumber(nums);
        System.out.println(result);

    }
}
