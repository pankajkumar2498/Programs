package Striver_DSA_Sheet.Array.Easy;

import java.util.HashSet;

// Note: Before Removing elements, sort the array
// Brute Force Approach
public class remove_Duplicates {
    static int removeDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        // adding elements in Set
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int size = set.size();

        int index = 0;

        for (int i : set) {
            arr[index++] = i;
        }

        return size;
    }

    // Optimal Approcah - this will work only when array is sorted
    static int removeDuplicates(int[] nums) {

        // Take two pointers i and j; place i at 0th index and j at (i+1) index
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;   // (i+1) is the current size of Array
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        int size = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}