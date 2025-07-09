package CollectionOperations.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        // Only one null value is allowed in Key and multiples null in value
        Map<Integer, String> hashmap = new HashMap<Integer, String>();

        hashmap.put(101, "Pankaj");
        hashmap.put(102, "Rahul");
        hashmap.put(103, "Aniket");
        hashmap.put(104, "Ankit");
        hashmap.put(105, "Ujjawal");
        hashmap.put(106, "Shekhar");
        hashmap.put(null, "Raone");
        hashmap.put(107, null);

        System.out.println(hashmap);

        System.out.println(hashmap.get(103));
        System.out.println(hashmap.get(null));

        System.out.println(hashmap.getOrDefault(110, "done").toUpperCase());

        System.out.println(hashmap.containsKey(112));
        System.out.println(hashmap.containsValue("one"));

        // 1.   First way to get Keys and values is using KeySet
        Set<Integer> keys = hashmap.keySet(); // keySet() provides all the keys present inside HashMap
        System.out.println(keys);

        // Iterate through above Set of Keys to get allValues mapped with respective keys
        for (Integer key : keys) {
            System.out.println(key + " " + hashmap.get(key));
        }

        // 2.   Second way to get Keys and values is entrySet() method
        Set<Entry<Integer, String>> entry = hashmap.entrySet(); // entrySet() contains all the mapped keys and values, it doesn't require to get key first separately & then iterate over it. 
        System.out.println("EntrySet Values: " + entry);

        for (Entry<Integer,String> entries : entry) {
            System.out.println(entries.getKey() + " " + entries.getValue());        // we can directly call getKey() & getValue() method
        }

    }
}
