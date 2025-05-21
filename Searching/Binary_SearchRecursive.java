public class Binary_SearchRecursive {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 23, 43 };

        int target = 43;

        int ans = BinarySearch(arr, target, 0, arr.length - 1);
        // System.out.println(ans);
        
        if(ans != -1){
            System.out.println("Element found at index: " + ans);
        }else{
            System.out.println("Element not found in Array.");
        }
    }

    public static int BinarySearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        
        if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {
            return BinarySearch(arr, target, start, mid - 1);
        } else {
            return BinarySearch(arr, target, mid + 1, end);
        }
    }
}
