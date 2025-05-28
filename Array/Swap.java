package Array;

public class Swap {

    // swap two indexes inside Array with the help of third variable
    static void swapUsingThirdVariable(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    // swap values of two variables without using third variable
    static int[] swapWithoutUsingThirdVariable(int a, int b) {
        a = a+b;
        b = a-b;
        a = a-b;

        return new int[]{a, b};
    }

    public static void main(String[] args) {

        int[] arr = { 12, 3, 54, 5, 23 };
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
       
        System.out.println();
       
        swapUsingThirdVariable(arr, 1, 2);

        for (int i : arr) {
            System.out.print(i + " ");
        }


        // Swapping of Two Variables
        int a = 20, b = 10;
        
        System.out.println();
       
        System.out.println("Before Swap: a= "+ a + " b= "+ b);
        
        int[] result = swapWithoutUsingThirdVariable(a, b);

        a = result[0];
        b = result[1];
        
        System.out.println("After Swap: a= "+ a + " b= "+ b);

    }

}
