package Striver_DSA_Sheet.Array.Easy;

public class FindMissingNumber {
    
    // this function works only for sorted array
    // static int findMissingNumber(int[] arr) {
    //        Arrays.sort(arr);
    //     for (int i = 0; i < arr.length; i++) {
    //         int j = i + 1;

    //         if (arr[j] - arr[i] != 1) {
    //             return arr[i] + 1;
    //         }
    //     }
    //     return -1;
    // }


    // Optimal Approch --> T.C = O(N); S.C = O(1)
    static int findMissingNumber1(int[] arr, int N) {

        //Find Summation of first N numbers:
        int totalSum = (N * (N + 1)) / 2;
        
        // Find Sum of All the elements of array.
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return totalSum-sum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 5, 7, 2 };

        // System.out.println(findMissingNumber(arr));
        
        System.out.println("Missing Number in given Array is: " + findMissingNumber1(arr, 7));

    }

}
