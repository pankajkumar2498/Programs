// import java.util.Scanner;

// public class MergeSorting {

//     public static void main(String[] args) {

//         Scanner scan = new Scanner(System.in);

//         System.out.print("Enter num of element in Array: ");
//         int n = scan.nextInt();

//         int arr[] = new int[n];

//         System.out.print("Enter Elements of Array: ");

//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scan.nextInt();
//         }

//         MergeSorting.mergeSort(arr, 0, arr.length);

//         scan.close();

//     }

//      public static void mergeSort(int arr[], int lb, int ub) {

//         if (lb < ub) {

//             int mid = (lb + ub)/2;
//             mergeSort(arr, lb, mid); // for Left Side Array
//             mergeSort(arr, mid + 1, ub); // for Right Side Array

//             merge(arr, lb, mid, ub);     // for merging arrays.

//         }

//     }

   

//     public static void merge( int arr[], int lb, int mid, int ub ){

//         int i = lb ;
//         int j = mid +1 ;
//         int k = ub ;

//         if( i <= mid && j <= ub ){
//             if( arr[i] < arr[j] ){
//                int b[k] = arr[i];
//                 i++;
//             }else{ 
//                 b[i] = arr[j]
//             }

//         }

//     }



// }
