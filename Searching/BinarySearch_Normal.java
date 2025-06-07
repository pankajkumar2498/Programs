public class BinarySearch_Normal {

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
        int[] arr = { 2, 4, 6, 8, 23, 43 };
        int target = 8;

        int ans = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println();

        if (ans != -1) {
            System.out.println(target + " found at index: " + ans);
        } else {
            System.out.println(target + " not found in Array.");
        }
    }
}
