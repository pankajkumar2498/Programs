package Striver_DSA_Sheet.Array.Easy;

import java.util.Arrays;

public class moveZeroesToEnd {

    // Brute Force Approach --> Returns same Array with all zeroes in end
    static void moveZeroes(int[] arr) {

        int[] temp = new int[arr.length];
        int index = 0; // Tracks the position in temp to insert non-zero elements
        
        // copy non zero elements in temporary array
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != 0) {
                temp[index++] = arr[i];
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

    // Returns new Array with all Zeroes in end
    static int[] moveZeroes1(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;

        // Add all non-zero elements to the result array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[index++] = arr[i];
            }
        }

        // Remaining elements are already 0 by default
        System.out.println(Arrays.toString(result));    // for testing purpose only
        return result;
    }


    // Optimal Approach --> O(N)
    static void moveZeroes2(int[] arr) {

        int zeroIndex = -1; // we can take zeroIndex as j also.

        // find index of first 0 and point it to zeroIndex variable.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroIndex = i;
                break;
            }
        }


        // if no zeroes found then return
        if (zeroIndex == -1)
            return;

        // start i index from next index where zero found i.e, zeroIndex
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
        int[] arr = { 0, 64, 0, 33, 0, 40, 50 };

        moveZeroes2(arr);

    }

}
