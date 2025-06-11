package Striver_DSA_Sheet.Array.Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class FindUnion_MergeSortedArray {

    // Brute-Force Approach--> it is valid for inserting unique elements
    static ArrayList<Integer> FindUnion1(int[] arr1, int[] arr2) {

        HashSet<Integer> hashSet = new HashSet<Integer>();

        // add array1 elements to hashset
        for (int i = 0; i < arr1.length; i++) {
            hashSet.add(arr1[i]);
        }

        // add array2 elements to hashset
        for (int i = 0; i < arr2.length; i++) {
            hashSet.add(arr2[i]);
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        // Now add all elements from hashset to list array
        for (int i : hashSet) {
            list.add(i);
        }

        return list;
    }

    // Optimal Approach --> O(m+n) where m & n is the length of array
    static ArrayList<Integer> FindUnion(int[] arr1, int[] arr2) {

        int i = 0, j = 0; // pointers
        ArrayList<Integer> list = new ArrayList<>(); // Uninon vector
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (list.size() == 0 || list.get(list.size() - 1) != arr1[i])   // compare last element in list is not equal to element in Array.
                    list.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (list.size() == 0 || list.get(list.size() - 1) != arr2[j])
                    list.add(arr2[j]);
                j++;
            }
        }
        while (i < arr1.length) // IF any element left in arr1
        {
            if (list.get(list.size() - 1) != arr1[i])
                list.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) // If any elements left in arr2
        {
            if (list.get(list.size() - 1) != arr2[j])
                list.add(arr2[j]);
            j++;
        }
        return list;
    }

    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

        ArrayList<Integer> list = FindUnion(arr1, arr2);

        System.out.println("list of arr1 and arr2 is ");

        for (int item : list)
            System.out.print(item + " ");

    }
}