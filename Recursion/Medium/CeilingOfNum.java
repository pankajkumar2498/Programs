package Recursion.Medium;

public class CeilingOfNum {

    // Finds the ceiling of a number in a sorted array
    static int findCeilNum(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return Integer.MIN_VALUE;
        }

        // Edge case: if target > last element, no ceiling exists
        if (target > arr[arr.length - 1]) {
            System.out.println("No ceiling exists for target " + target + " in the array.");
            return Integer.MIN_VALUE;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return arr[mid]; // Exact match is the floor
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // At this point, start is pointing at the ceiling number
        return arr[start];
    }

    // Simple approach
    public static int ceilNumber(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (b == a[i]) {
                return b;
            } else {
                if (Math.max(a[i], b) != b) {
                    return a[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = { 23, 45, 65, 87, 90, 98 };
        int[] arr2 = {};
        int[] arr3 = { 5, 10, 15 };

        // Normal case
        System.out.println("Ceiling of 89: " + findCeilNum(arr1, 89));

        // Exact match
        System.out.println("Ceiling of 90: " + findCeilNum(arr1, 90));

        // Target smaller than smallest
        System.out.println("Ceiling of 10: " + findCeilNum(arr1, 10));

        // Target larger than largest
        System.out.println("Ceiling of 100: " + findCeilNum(arr1, 100));

        // Empty array
        System.out.println("Ceiling in empty array: " + findCeilNum(arr2, 50));

        // Another normal case
        System.out.println("Ceiling of 13: " + findCeilNum(arr3, 13));
    }
}
