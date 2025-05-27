package Array;

public class Swap {

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2 + 1];
        arr[index2 + 1] = temp;
    }

    public static void main(String[] args) {

        int[] arr = { 12, 3, 54, 5, 23 };
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
       
        System.out.println();
       
        swap(arr, 1, 2);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
