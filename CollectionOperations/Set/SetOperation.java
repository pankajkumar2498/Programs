package CollectionOperations.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class SetOperation {
    public static void main(String[] args) {

        // 1.
        HashSet<Integer> hashint = new HashSet<>(Arrays.asList(1, 2, 43, 5, 67, 8));
        HashSet<Integer> clone = (HashSet<Integer>) hashint.clone();
        System.out.println("Cloned List: " + clone);

        // 2.
        HashSet<String> hashstr = new HashSet<>(Arrays.asList("Sun", "Mango", "Orange", "PineApple"));
        TreeSet<String> treestr = new TreeSet<>(hashstr);
        System.out.println("TreeSet from HashSet: " + treestr);

        // 3.

    }
}
