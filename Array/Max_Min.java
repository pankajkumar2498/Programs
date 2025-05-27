package Array;

public class Max_Min {

    static int Max(int[] arr) {
        if (arr.length == 0)
            return -1;

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int MaxRange(int[] arr, int start, int end) {

        if ((start > end) || (arr.length == 0))
            return -1;

        int max = arr[start];
        for (int i = start; i < end; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    static int Min(int[] arr) {

        if (arr.length == 0)
            return -1;

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static int MinRange(int[] arr, int start, int end) {
        if ((start > end) || (arr.length == 0))
            return -1;

        int min = arr[start];
        for (int i = start; i < end; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arr = {23, 43, 54, 67, 76, 87};

        System.out.println(Min(arr));

        System.out.println(MinRange(arr, 1, 4));

        System.out.println(Max(arr));

        System.out.println(MaxRange(arr, 1, 4));

    }
}
