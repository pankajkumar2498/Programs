import java.util.Arrays;

public class LinearSearchingArray {

    // Linear Search returns integer value
    static int linearSearch(int[] arr, int target) {

        if (arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {

            if (target == arr[i]) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    // Linear Search in Range
    static int linearSearchRange(int[] arr, int target, int start, int end) {

        if (arr.length == 0)
            return -1;

        for (int i = start; i <= end; i++) {

            if (target == arr[i]) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    // Linear Search returns boolean value
    static boolean linearSearch1(int[] arr, int target) {

        if (arr.length == 0)
            return false;

        for (int i = 0; i < arr.length; i++) {

            if (target == arr[i]) {
                return true;
            }
        }
        return false;
    }

    // LinearSearch in 2D Array
    static int[] linerSearchIn2DArray(int[][] arr, int target) {

        if (arr.length == 0)
            return new int[] { -1, -1 };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[] { row, col };
                }
            }
        }

        return new int[] { -1, -1 };
    }
    
    // Minimumm Element in 2D Array
    static int minmumIn2DArray(int[][] arr) {

        int minValue = Integer.MAX_VALUE;
        if (arr.length == 0)
            return minValue;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < minValue) {
                    minValue = arr[row][col];
                }
            }
        }
        return minValue;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 12, 32, 5, 66, 87 };

        int[][] array = {
            {23, 34, 3, 16, 6},
            {10, 14},
            {2, 32 , 4, 76, 89, 71},
            {87}
        };

        int target = 89;

        System.out.println(linearSearch(arr, target));
        System.out.println(linearSearch1(arr, target));
        System.out.println(linearSearchRange(arr, target, 1, 5));

        int[] ans = linerSearchIn2DArray( array, target);
        System.out.println(Arrays.toString(ans));

        System.out.println(minmumIn2DArray(array));
    }

}
