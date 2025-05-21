import java.util.Scanner;

public class BinarySearchIteration {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter num of element in Array: ");
        int num = scan.nextInt();

        int arr[] = new int[num];

        System.out.print("Enter Elements of Array: ");

        for(int i = 0; i < arr.length ; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("Enter Key to Search: ");
        
        int key = scan.nextInt();

        int result = BinarySearch( arr, key );

        // System.out.println(result);

        if ( result != -1 ) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not Found.");
        }

        
        scan.close();
    }

    public static int BinarySearch( int arr[], int key ) {
        int low = 0;
        int high = arr.length-1;
        
        while(low <= high) { 

            int mid = (low + high)/2;
            
            if ( key == arr[mid] ) 
                return mid;
            
            if (key < arr[mid]) {
                high = mid - 1;
            }
             else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
