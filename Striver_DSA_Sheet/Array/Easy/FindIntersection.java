package Striver_DSA_Sheet.Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindIntersection {

    // Optimal Approcah --> O(n+m) in worst case where n and m are the length of
    // both arrays.
    // Note: for more time optimization take samaller array first and then compare
    // to bigger array.
    // this function return duplicates elements in Intersection of Two Arrays.
    static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2) {

        Arrays.sort(arr1); // Sort arr1
        Arrays.sort(arr2); // Sort arr2

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
                list.add(arr1[i]); // if arr1[i] element is equal to arr2[j] element then add that element in list
                                   // and move both pointers to next index
                i++;
                j++;
            }
        }
        return list;
    }

    // this function return unique elements in Intersection of Two Arrays.
    static int[] findIntersection1(int[] arr1, int[] arr2) {
        Arrays.sort(arr1); // Sort arr1
        Arrays.sort(arr2); // Sort arr2

        Set<Integer> resultSet = new HashSet<>(); // To ensure uniqueness store result in HashSet
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                resultSet.add(arr1[i]); // Add only once
                i++;
                j++;
            }
        }

        // Convert Set to int[]
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {

        int arr1[] = { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int arr2[] = { 2, 2, 3, 4, 4, 5, 11, 12 };

        ArrayList<Integer> list = findIntersection(arr1, arr2);

        System.out.print("Intersection elements(maybe Duplicates) of arr1 and arr2 is: ");

        for (int item : list)
            System.out.print(item + " ");

        System.out.println();
        // this is for findIntersection1 function
        System.out.println("Unique Intersection elements of arr1 and arr2 is:"+Arrays.toString(findIntersection1(arr1, arr2)));
    }
}