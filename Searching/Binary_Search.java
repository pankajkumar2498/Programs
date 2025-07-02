// NOTE: For applying BinarySearch, it is mandatory to Have Arry in Ascending Order

public class Binary_Search {
    
    
    static int binary_SearchRecursive(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {
            return binary_SearchRecursive(arr, target, start, mid - 1);
        } else {
            return binary_SearchRecursive(arr, target, mid + 1, end);
        }
    }

    static int binarySearch(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;

        if (arr == null || arr.length == 0)
            return -1;

        // for checking Array is Sorted in Ascending order or Descending
        boolean isAsc = arr[low] < arr[high];

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (key == arr[mid])
                return mid;

            if (isAsc) {
                if (key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (key > arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 23, 43 };

        int target = 43;

        // int ans = binarySearch(arr, target);

        int ans = binary_SearchRecursive(arr, target, 0, arr.length - 1);

        if (ans != -1) {
            System.out.println(target + " element found at index: " + ans);
        } else {
            System.out.println(target + "element not found in Array.");
        }
    }

}
