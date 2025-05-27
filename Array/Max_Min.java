package Array;

public class Max_Min {

    static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    
    static int Min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] arr = { 12, 32, 45, 65, 75 };

        System.out.println(Min(arr));
        
        System.out.println(Max(arr));

    }
}
