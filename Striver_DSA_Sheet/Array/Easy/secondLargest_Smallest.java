package Striver_DSA_Sheet.Array.Easy;

public class secondLargest_Smallest {

    static int getSecondLargest(int[] arr) {

        if (arr.length < 2 || arr.length == 0) {
            return -1;
        }

        int firstMax = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            return -1;
        }

        return secondMax;
    }

    static int getSecondSmallest(int[] arr) {

        if (arr.length < 2 || arr.length == 0) {
            return -1;
        }

        int firstMin = arr[0];
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstMin) {
                secondMin = firstMin;
                firstMin = arr[i];
            } else if (arr[i] < secondMin && arr[i] != firstMin) {
                secondMin = arr[i];
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            return -1;
        }

        return secondMin;
    }

    public static void main(String[] args) {

        int[] arr = { 4, 55, 16, 100, 80, 150 };

        System.out.println(getSecondLargest(arr));
        System.out.println(getSecondSmallest(arr));

    }

}
