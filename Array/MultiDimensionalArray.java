package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[][] arr2D = new int[3][3];

        // Scanning elements
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = scan.nextInt();
            }
        }

        // Output Scanning Elements
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col]+" ");
            }
            System.out.println();
        }
        
        // using for Array toString() function for inner loop
        for (int row = 0; row < arr2D.length; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }
       
        // print 2D array using foreach loop
        for (int[] element : arr2D) {
            System.out.println(Arrays.toString(element));
        }

        scan.close();
    }
}
