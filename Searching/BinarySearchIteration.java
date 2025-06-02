public class BinarySearchIteration {

    public static void main(String[] args) {

        int[] arr = { -5, -2, 0, 23, 46, 78, 79, 81, 85 }; // Ascending Order

        // int[] arr = { 85, 81, 80, 67, 7, -1, -20, -27 }; // Descending Order

        int target = -5;
        int result = binarySearch(arr, target);

        // System.out.println(result);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not Found.");
        }
    }

    public static int binarySearch(int arr[], int key) {
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

}
