package Recursion.Array;

public class Sorted_Array {

    static boolean isArraySorted(int[] arr, int index) {

        if (index == arr.length - 1)
            return true;

        return ((arr[index] < arr[index + 1]) && isArraySorted(arr, index + 1));
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 5, 6, 8, 9, 10 };
        System.out.println();
        System.out.print(isArraySorted(arr, 0));

    }
}