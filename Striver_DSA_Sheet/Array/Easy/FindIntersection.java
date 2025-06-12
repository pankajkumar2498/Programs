package Striver_DSA_Sheet.Array.Easy;

import java.util.ArrayList;

public class FindIntersection {

    // Optimal Approcah --> O(n+m) in worst case where n and m are the length of both arrays.
    // Note: for more time optimization take samaller array first and then compare to bigger array.
    static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();

        // i, j is th epointer to arr1 and arr2
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {

            // if arr1[i] element is less than arr2[j] element then move forward
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) { // if arr2[j] element is less than arr1[i] element then move forward
                j++;
            } else {
                list.add(arr1[i]);      //  if arr1[i] element is equal to arr2[j] element then add that element in list and move both pointers to next index
                i++;
                j++;
            }
        }
        return list;
    }

    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

        ArrayList<Integer> list = findIntersection(arr1, arr2);

        System.out.println("Intersection elements of arr1 and arr2 is ");

        for (int item : list)
            System.out.print(item + " ");

    }
}
