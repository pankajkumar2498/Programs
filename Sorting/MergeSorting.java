import java.util.ArrayList;
import java.util.Arrays;

public class MergeSorting {

    public static void main(String[] args) {

        int[] arr = { 20, 12, 5, 15, 27, 34 };

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        MergeSorting.mergeSort(arr, 0, arr.length - 1);
        System.out.println("After Merge Sorting: " + Arrays.toString(arr));

    }

    public static void mergeSort(int arr[], int low, int high) {

        if (low >= high)
            return;

        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid); // for left Side Array
        mergeSort(arr, mid + 1, high); // for Right Side Array
        merge(arr, low, mid, high); // for merging arrays.

    }

    public static void merge(int arr[], int low, int mid, int high) {

        ArrayList<Integer> list = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        // compare both side arrays, whosoever is small then add to temporary list.
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }

        // if left side elements are remaining then add to list
        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }

        // if right side elements are remaining then add to list
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }

        // copy temporary into original array
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }

    }
}
