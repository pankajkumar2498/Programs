package Recursion.Array;

import java.util.ArrayList;

public class FindElement {

    static boolean findElementFromStart(int[] arr, int target, int index) {

        if (index == arr.length) {
            return false;
        }
        return ((arr[index] == target) || findElementFromStart(arr, target, index + 1));
    }

    static boolean findElementFromLast(int[] arr, int target, int index) {

        if (index == -1) {
            return false;
        }
        return ((arr[index] == target) || findElementFromLast(arr, target, index - 1));
    }

    static int findElementIndex(int[] arr, int target, int index) {

        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findElementIndex(arr, target, index + 1);
        }
    }

    // Find all the indexes of target element by uisng external List
    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {
    if (index == arr.length) {
    return;
    }
    if (arr[index] == target) {
    list.add(index);
    }
    findAllIndex(arr, target, index + 1);
    }

    // Find all the indexes of target element by using List as a parameter.
    static ArrayList<Integer> findAllIndexes(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndexes(arr, target, index + 1, list);
    }

    // Find all the indexes of target element by not using List as a paramter
    static ArrayList<Integer> findAllIndexes1(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (index == arr.length) {
            return list;
        }

        // this will contain answer for this function only
        if (arr[index] == target) {
            list.add(index);
        }
        
        ArrayList<Integer> ansFromBelowCalls = findAllIndexes1(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    public static void main(String[] args) {
        System.out.println();

        int[] arr = { 2, 4, 6, 2, 65, 87 };

        int target = 2;

        // System.out.println(findElementFromStart(arr, target, 0));

        // System.out.println(findElementFromLast(arr, target, arr.length - 1));

        // System.out.println(findElementIndex(arr, target, 0));

        // findAllIndex(arr, target, 0);
        // System.out.println(list);

        // ArrayList<Integer> ans = findAllIndexes(arr, target, 0, new ArrayList<>());
        System.out.println(findAllIndexes(arr, target, 0, new ArrayList<>()));

        // ArrayList<Integer> ans1 = findAllIndexes1(arr, target, 0);
        System.out.println(findAllIndexes1(arr, target, 0));

    }
}
