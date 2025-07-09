package CollectionOperations.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// HashSet
// Order: No guaranteed order. Elements appear in a seemingly random sequence.
// Performance: Fastest of the three for basic operations like add, remove, and contains—thanks to hashing.
// Duplicates: Not allowed.

// LinkedHashSet
// Order: Maintains insertion order. Elements appear in the order they were added.
// Performance: Slightly slower than HashSet because it maintains a linked list of elements.
// Duplicates: Not allowed.

// TreeSet
// Order: Sorted in natural order (e.g., alphabetical for Strings, ascending for numbers), or you can provide a custom comparator.
// Performance: Slower than both HashSet and LinkedHashSet since it uses a Red-Black tree under the hood.
// Duplicates: Not allowed.
// Bonus: Implements NavigableSet, so it offers handy methods like ceiling(), floor(), higher(), and lower().

// If you're prioritizing speed, go with HashSet. If you care about insertion order, LinkedHashSet is your friend. And if sorted order is key, TreeSet is the go-to.

// Note: for Traversing Set, unfortunately ListIterator is not available for Set, so we have to go with Iterator method only or foreach loop. 

public class SetDemo {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();      // No Insrtion order is maintained for HashSet, it stores values according to hashcode
        set.add("Java");
        set.add("Java");
        set.add("Spring");
        set.add("C++");
        set.add("C++");
        set.add("Math");
        set.add("OOPs");
        set.add(null);
        set.add(null);
        set.add("100");

        System.out.println();
        // System.out.println(set);
        System.out.println(set.size());

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String name = (String) it.next();
            System.out.print(name+ " ");
        }
        
        
        Set<String> linkSet = new LinkedHashSet<>();        // Insertion order is maintained for LinkedHashSet
        linkSet.add("Java");
        linkSet.add("Java");
        linkSet.add("Spring");
        linkSet.add("C++");
        linkSet.add("C++");
        linkSet.add("Math");
        linkSet.add("OOPs");
        linkSet.add(null);
        linkSet.add(null);
        linkSet.add("100");

        System.out.println();
        // System.out.println(set);
        System.out.println(linkSet.size());

        Iterator<String> itt = linkSet.iterator();
        while (itt.hasNext()) {
            String name = (String) itt.next();
            System.out.print(name+ " ");
        }
        
        
        Set<String> treeSet = new TreeSet<>();        // Sorting order is maintained for TreeSet
        treeSet.add("Java");
        treeSet.add("Java");
        treeSet.add("Spring");
        treeSet.add("C++");
        treeSet.add("C++");
        treeSet.add("Math");
        treeSet.add("OOPs");
        // treeSet.add(null);                  // TreeSet doesn't accept null values.
        treeSet.add("100");

        System.out.println();
        // System.out.println(set);
        System.out.println(treeSet.size());

        Iterator<String> ittt = treeSet.iterator();
        while (ittt.hasNext()) {
            String name = (String) ittt.next();
            System.out.print(name+ " ");
        }

    }
}
