package CollectionOperations.Map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        // Only one null value is allowed in Key and multiples null in value
        Map<Integer, String> tree = new TreeMap<Integer, String>();

        tree.put(101, "Pankaj");
        tree.put(102, "Rahul");
        tree.put(103, "Aniket");
        tree.put(104, "Ankit");
        tree.put(105, "Ujjawal");
        tree.put(106, "Shekhar");
        // tree.put(null, "Raone");         // TreeMap doesn't accept null keys but accept null values
        tree.put(107, null);

        // System.out.println(tree);

        System.out.println(tree.get(103));

        System.out.println(tree.getOrDefault(110, "done").toUpperCase());

        System.out.println(tree.containsKey(106));
        System.out.println(tree.containsValue("one"));

        // 1.   First way to get Keys and values is using KeySet
        Set<Integer> keys = tree.keySet(); // keySet() provides all the keys present inside tree
        System.out.println(keys);

        // Iterate through above Set of Keys to get allValues mapped with respective keys
        for (Integer key : keys) {
            System.out.println(key + " " + tree.get(key));
        }

        // 2.   Second way to get Keys and values is entrySet() method
        Set<Entry<Integer, String>> entry = tree.entrySet(); // entrySet() contains all the mapped keys and values, it doesn't require to get key first separately & then iterate over it. 
        System.out.println("EntrySet Values: " + entry);

        for (Entry<Integer,String> entries : entry) {
            System.out.println(entries.getKey() + " " + entries.getValue());        // we can directly call getKey() & getValue() method
        }
    }
}

