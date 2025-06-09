// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// https://leetcode.com/problems/find-peak-element/
// (LeetCode_852). Peak Index in a Mountain Array
// (LeetCode_162). Find Peak Element
// You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
// Return the index of the peak element.
// Your task is to solve it in O(log(n)) time complexity.

// Example 1:
// Input: arr = [0,1,0]
// Output: 1

// Example 2:
// Input: arr = [0,2,1,0]
// Output: 1

// Example 3:
// Input: arr = [0,10,5,2]
// Output: 1 

// Constraints:

// 3 <= arr.length <= 105
// 0 <= arr[i] <= 106
// arr is guaranteed to be a mountain array.

public class _852_162_MountainArray {
    static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; // we can return both start, end ---> bcoz in end both lie on same index
                      // i.e,start == end
    }

    public static void main(String[] args) {
        int[] arr = { 5, 8, 10, 15, 13, 9, 1 };

        int ans = peakIndexInMountainArray(arr);
        System.out.println();
        System.out.println(ans);

    }
}
