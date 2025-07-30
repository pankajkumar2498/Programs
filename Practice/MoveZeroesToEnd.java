package Practice;

import java.util.Arrays;

public class MoveZeroesToEnd {

    // Returns new Array
    static int[] moveZeroes(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;

        // Add all non-zero elements to the result array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }

        // Remaining elements are already 0 by default
        return result;
    }

    // Optimal Approach --> O(N)
    static void moveZeroes1(int[] arr) {

        int zeroIndex = -1;

        // find first index where 0 present
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroIndex = i; // store value of index where 0 is present inside zeroIndex variable
                break;
            }
        }

        // check whether value of zeroIndex changes --> if it changes it means, 0 is present otherwise 0 is Absent.
        if (zeroIndex == -1) {
            return;
        }

        for (int i = zeroIndex + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap non zero element with 0
                arr[i] = arr[i] ^ arr[zeroIndex];
                arr[zeroIndex] = arr[i] ^ arr[zeroIndex];
                arr[i] = arr[i] ^ arr[zeroIndex];

                zeroIndex++;
            }
        }
        System.out.println("After Moving all Zeroes in end: "+Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 0, 4, 2, 0, 0, 5, 1, 0 };

        // int[] temp = moveZeroes(arr);

        // System.out.println(Arrays.toString(temp));
        
        moveZeroes1(arr);
        // System.out.println();


    }
}
