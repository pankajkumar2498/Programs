package CollectionOperations.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        // Only one null value is allowed in Key and multiples null in value
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        linkedHashMap.put(101, "Pankaj");
        linkedHashMap.put(102, "Rahul");
        linkedHashMap.put(103, "Aniket");
        linkedHashMap.put(104, "Ankit");
        linkedHashMap.put(105, "Ujjawal");
        linkedHashMap.put(106, "Shekhar");
        linkedHashMap.put(null, "Raone");
        linkedHashMap.put(107, null);

        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(103));
        System.out.println(linkedHashMap.get(null));

        System.out.println(linkedHashMap.getOrDefault(110, "done").toUpperCase());

        System.out.println(linkedHashMap.containsKey(112));
        System.out.println(linkedHashMap.containsValue("one"));

        // 1.   First way to get Keys and values is using KeySet
        Set<Integer> keys = linkedHashMap.keySet(); // keySet() provides all the keys present inside linkedHashMap
        System.out.println(keys);

        // Iterate through above Set of Keys to get allValues mapped with respective keys
        for (Integer key : keys) {
            System.out.println(key + " " + linkedHashMap.get(key));
        }

        // 2.   Second way to get Keys and values is entrySet() method
        Set<Entry<Integer, String>> entry = linkedHashMap.entrySet(); // entrySet() contains all the mapped keys and values, it doesn't require to get key first separately & then iterate over it. 
        System.out.println("EntrySet Values: " + entry);

        for (Entry<Integer,String> entries : entry) {
            System.out.println(entries.getKey() + " " + entries.getValue());        // we can directly call getKey() & getValue() method
        }

    }
}
