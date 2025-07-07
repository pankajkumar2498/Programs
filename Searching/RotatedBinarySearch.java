
public class RotatedBinarySearch {

    static int rotatedBinarySearch(int[] arr, int target, int start, int end) {

        // if array is empty
        if (start > end)
            return -1;

        int mid = start + (end - start) / 2;

        // if middle element is the target element
        if (target == arr[mid])
            return mid;

        // if target lies between start and mid index
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return rotatedBinarySearch(arr, target, start, mid - 1);
            } else {
                // if target lies between mid and end index
                return rotatedBinarySearch(arr, target, mid + 1, end);
            }
        }

        // if target lies between mid and end index
        if (target >= arr[mid] && target <= arr[end]) {
            return rotatedBinarySearch(arr, target, mid + 1, end);
        } else {
            // if target lies between start and mid index
            return rotatedBinarySearch(arr, target, start, mid - 1);
        }

    }

    public static void main(String[] args) {

        int[] arr = { 4, 5, 6, 0, 1, 2, 3 };

        int target = 1;

        int index = rotatedBinarySearch(arr, target, 0, arr.length - 1);

        System.out.println(index);

    }
}
