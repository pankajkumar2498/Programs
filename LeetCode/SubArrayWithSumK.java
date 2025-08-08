public class SubArrayWithSumK {

    // Greedy Approach: Two Pointers Approach (Valid only for Positives & Zeroes)
    public static int SubArrayWithSumK_GreedyTwoPointer(int[] arr, int target) {
        int left = 0, right = 0;
        int sum = arr[0];
        int maxLength = 0;

        while (right < arr.length) {
            while (left <= right && sum > target) {
                sum -= arr[left];
                left++;
            }
            if (sum == target) {
                maxLength = Math.max(maxLength, right - left + 1);
            }

            right++;
            if (right < arr.length) {
                sum += arr[right];
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 2, 5 };
        int target = 5;

        int result = SubArrayWithSumK_GreedyTwoPointer(nums, target);

        System.out.println(result);
    }
}
