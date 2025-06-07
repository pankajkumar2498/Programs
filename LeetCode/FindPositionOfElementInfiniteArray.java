package LeetCode;

// Find the position of element in Sorted Array inside Infinite Array i.e, now you can't use Array.length method 

public class FindPositionOfElementInfiniteArray {

    static int findRange(int[] arr, int target) {
        int start = 0, end = 1;

        // for accessing array beyond its actual size --> (end < arr.length)
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;  // When element not found in Range, then increase range by double.
            start = newStart;
        }

        // Since Java arrays are not truly infinite, there's a risk of
        // ArrayIndexOutOfBoundsException if end exceeds the actual length of the array.
        if (end >= arr.length) {
            end = arr.length - 1;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 10, 23, 27, 30 };
        int target = 23;

        System.out.println();

        int ans = findRange(arr, target);

        if (ans != -1) {
            System.out.println(target + " lies on index " + ans);
        } else {
            System.out.println(target +" doesn't exist inside Array.");
        }
    }
}