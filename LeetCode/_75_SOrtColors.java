import java.util.Arrays;

public class _75_SOrtColors {

    // 1. Brute Force-Approach --> Apply direct Sorting on Array

    // 2. Better Approach --> Take 3 variables to maintain the count of 0, 1 and 2.
    public static void sortColors(int[] arr) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0 ++;
            } else if (arr[i] == 1) {
                count1 ++;
            } else {
                count2 ++;
            }
        }

        // Replace the places in the original array:
        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }

        for (int i = count0; i < count0 + count1; i++) {
            arr[i] = 1;
        }

        for (int i = count0 + count1; i < arr.length; i++) {
            arr[i] = 2;
        }
    }


    // Optimal Approach --> Use of Two Pointers
    public static void sortColors1(int[] arr) {
        
        

    }

    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0, 0 };

        // sortColors(arr);
        
        sortColors1(arr);

        System.out.println(Arrays.toString(arr));
    }
}
