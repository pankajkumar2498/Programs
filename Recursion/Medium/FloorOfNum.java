package Recursion.Medium;

public class FloorOfNum {
    // Finds the floor of a number in a sorted array
    static int findFloorNum(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return Integer.MIN_VALUE;
        }

        // If target is less than the smallest element, no floor exists
        if (target < arr[0]) {
            System.out.println("No Floor exists for target " + target + " in the array.");
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

        // At this point, end points to the largest number <= target
        return arr[end];
    }

    public static void main(String[] args) {
        int[] arr1 = {23, 45, 65, 87, 90, 98};
        int[] arr2 = {};
        int[] arr3 = {5, 10, 15};

        // Exact match
        System.out.println("Floor of 87: " + findFloorNum(arr1, 87));

        // Exact match
        System.out.println("Floor of 90: " + findFloorNum(arr1, 90));

        // Target smaller than smallest
        System.out.println("Floor of 10: " + findFloorNum(arr1, 10));

        // Target larger than largest
        System.out.println("Floor of 100: " + findFloorNum(arr1, 100));

        // Empty array
        System.out.println("Floor in empty array: " + findFloorNum(arr2, 50));

        // Another normal case
        System.out.println("Floor of 13: " + findFloorNum(arr3, 13));
    }
}
