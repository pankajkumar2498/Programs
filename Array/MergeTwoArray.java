package Array;

import java.util.Arrays;

public class MergeTwoArray {

    public static void main(String[] args) {

        int[] arr1 = { 2, 5, 6, 8 };
        System.out.println("First Array: " + Arrays.toString(arr1));
        int[] arr2 = { 1, 76, 34 };
        System.out.println("Second Array: " + Arrays.toString(arr2));
        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length - 1 - i; j++) {
                if (arr3[j] > arr3[j + 1]) {
                    int temp = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = temp;
                }
            }
        }

        // Arrays.sort(arr3);
        System.out.println("Merged Array: " + Arrays.toString(arr3));

    }

}
