package Striver_DSA_Sheet.Array.Easy;

import java.util.Arrays;

public class moveZeroesToEnd {


    // Brute Force Approach
    static void moveZeroes1(int[] arr) {

        int[] temp = new int[arr.length];

        // copy non zero elements in temporary array
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != 0) {
                temp[i] = arr[i];
            }
        }

        // Again copy back Temp array elements into Original array
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }

        // fill remaining elements as 0
        for (int i = temp.length; i <= arr.length - 1; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }


    // Optimal Approach --> O(N)
    static void moveZeroes(int[] arr) {

        int zeroIndex = -1; // we can take zeroIndex as j also.

        // find index of first 0 and point it to zeroIndex variable.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroIndex = i;
                break;
            }
        }


        // if no zeroes founf then return
        if (zeroIndex == -1)
            return;

        // start i index from next index where zero foung i.e, zeroIndex
        for (int i = zeroIndex + 1; i < arr.length; i++) {
            if (arr[i] != 0) {

                // swapping
                arr[i] = arr[i] + arr[zeroIndex];
                arr[zeroIndex] = arr[i] - arr[zeroIndex];
                arr[i] = arr[i] - arr[zeroIndex];

                zeroIndex++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 0, 4, 0, 33, 0, 40, 50 };

        moveZeroes(arr);

    }

}
