package Striver_DSA_Sheet.Array.Easy;

public class isArraySorted {

    static boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 33, 40, 50 };

        System.out.println(isSorted(arr));

    }
}
