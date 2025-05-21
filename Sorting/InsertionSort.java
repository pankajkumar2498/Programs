import java.util.Scanner;

public class InsertionSort {
        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of element in Array: ");
        int n = scan.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter Elements of Array: ");

        for (int i=0; i < arr.length ; i++) {  
            arr[i] = scan.nextInt();
        }

        // Divide the Array into two parts- Sorted & Unsorted list.
        // Pick one value from unsorted list and place it into Sorted list, the way we insert element into sorted list is called INSERTION Sorting.
        // fix 0 index value in Sorted list & remaining elements in Unsorted.

        for( int i=1; i<n ; i++ )          // loop on UnSorted Array, start from index 1 so that we can run loop only on Unsorted Array.
        {
            // Store index 1 value in temp for comparing to previous index values
            int temp = arr[i];
            int j = i-1;    

            while( j >= 0 && arr[j] > temp )         // termination condition
            {
                arr[j+1] = arr[j] ;                 
                j--;                                 // decrease j for comparision with previous index values
            }
            arr[j+1] = temp;                         // if condition statisfies then store temp into arr[i]
        
        }

        // for printing Array...
        System.out.println("After Insertion Sort Array is: ");

        for (int i=0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        scan.close();
    }

}