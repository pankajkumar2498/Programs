package CollectionOperations;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class NavigablSet {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 12, 23, 43, 55, 67, 32);

        // Note: we can pass collections inside TreeSet.
        TreeSet<Integer> tree = new TreeSet<>(nums);
        System.out.println("Original view of TreeSet: "+tree);

        // NavigableSet<Integer> reversedSet = tree.descendingSet();
        // System.out.println("Reversed view of TreeSet: " + reversedSet);
        // System.out.println("Reversed view of TreeSet: " + tree.descendingSet());
        
        // System.out.println(tree.pollFirst());        // print first element and removes it
        // System.out.println(tree);
        
        // System.out.println(tree.pollLast());         // print last element and removes it
        // System.out.println(tree);

        // System.out.println(tree.descendingSet());   // reversed the Set, descendingSet is a method of Navigable Set
        // TreeSet<Integer> descSet = (TreeSet)tree.descendingSet();
        // System.out.println(descSet);
        

        // for itertaing on Set in Descending Order --> it is for only viewing purpose, it doesn't change in SET
        Iterator it = tree.descendingIterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            System.out.print(num+" ");
        }

        System.out.println();
        System.out.println("Ceil value: "+tree.ceiling(21));    // returns same number if present, otherwise print greater number
        System.out.println("Floor value: "+tree.floor(21));     // returns same number if present, otherwise print smaller number

        System.out.println("Higher value: "+tree.higher(23));    // returns strictly greater number
        System.out.println("Lower value: "+tree.lower(23));     // returns strictly smaller number

        System.out.println(tree.headSet(23));           // headSet returns all the numbers smaller than given number in parameter.
        System.out.println(tree.headSet(23,true));  // headSet returns all the numbers smaller than equal to given number if present in Set.

        System.out.println(tree.tailSet(43));           // headSet returns all the numbers greater than given number in parameter.
        System.out.println(tree.tailSet(43, false));    // headSet returns all the numbers gretaer than not equal to given number if present in Set.

    }

}
