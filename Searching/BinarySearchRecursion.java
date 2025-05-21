import java.util.Scanner;

public class BinarySearchRecursion {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter num of element in Array: ");
        int num = scan.nextInt();

        int arr[] = new int[num];

        System.out.print("Enter Elements of Array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter Key to Search: ");

        int key = scan.nextInt();

        int result = BinarySearch(arr, key, 0, arr.length - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not Found.");
        }

        scan.close();
    }

    public static int BinarySearch(int arr[], int key, int low, int high) {

        while (low <= high) {

            int mid = (low + high) / 2;

            if (key == arr[mid])
                return mid;

            if (key < arr[mid]) {
                return BinarySearch(arr, key, 0, mid - 1);
            } else {
                return BinarySearch(arr, key, mid + 1, high);
            }
        }
        return -1;
    }

}
