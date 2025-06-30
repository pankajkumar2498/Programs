package CollectionOperations;

// Basic
// 1.a HashSet with Integer values clone it to another HashSet .
// 2. a HashSet with String names convert a HashSet to a TreeSet
// 3. a HashSet with String names, reverse the names and create a reverse order view of the elements
// 4a. find the numbers less than 50 in TreeSet
// 4b. find the numbers greater than 50 in TreeSet
// 5a. In  a TreeSet of Integer values, get the element which is greater than or = to the given element.
// 5b. In a TreeSet of Integer values, get the element which is less than or = to the given element.
// 6a. In a TreeSet of Integer values, get the element strictly greater than the given element.
// 6b. In a TreeSet of Integer values, get the element strictly lesser than the given element.
// 7. In a TreeSet with names, reverse and print it
// 8. In a TreeSet with names, retrieve and remove the first element and last element of a tree set.
// 9. In a TreeSet with names, print the first and the last element of a tree set.
// 10. Write a program to remove duplicate strings from an array and store the unique strings in a HashSet.

// Advanced
// 11. Given two HashSet with course names webcourses
// HashSet web = new HashSet (Arrays.asList("HTML","CSS","ANGULAR","REACT"));
// HashSetfullstack = new HashSet(Arrays.asList("HTML","Spring","Java","REACT"));

//  a. compare the sets and retain elements that are the same  output: web[HTML,REACT]
//  b. difference (elements that are in one set but not both)print them output: [Spring, Java, CSS]

// 12. Write a program that reads a paragraph of text, splits it into words, and uses a HashSet to count the number of distinct words
//  Input: "Java is fun. Java is powerful."
//  Output: count: 5 distinct words: [Java, is, fun, powerful]

// 13. Write a program to group strings by their first letter using a TreeSet.
// Input is a list: ["apple", "banana", "apricot", "cherry", "blueberry"]
// Output should be 3 sets as: ["apple", "apricot"],  ["banana", "blueberry"], ["cherry"] 

// 14.Write a program to find the longest string from a set and store all strings of the same  length in a HashSet.
// Input Example: ["java", "javascript", "python", "kotlin","react","scss"]
// Output: prints javascript and the set with strings of same length["python","kotlin","react"] ["java","scss"]

// 15.Write a program to remove all strings from a HashSet that start with a specific letter (e.g., 'a').
// Input: ["apple", "banana", "avocado", "cherry"]
// Output (remove 'a'): ["banana", "cherry"]


import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        // 1. Clone a HashSet of Integer values
        HashSet<Integer> intSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> clonedSet = (HashSet<Integer>) intSet.clone();
        System.out.println("1. Cloned HashSet: " + clonedSet);

        // 2. Convert a HashSet with String names to a TreeSet
        HashSet<String> namesSet = new HashSet<>(Arrays.asList("John", "Alice", "Bob"));
        TreeSet<String> namesTreeSet = new TreeSet<>(namesSet);
        System.out.println("2. TreeSet from HashSet: " + namesTreeSet);

        // 3. Reverse the names in HashSet and create reverse order view
        HashSet<String> reversedNames = new HashSet<>();
        for (String name : namesSet) {
            reversedNames.add(new StringBuilder(name).reverse().toString());
        }
        TreeSet<String> reversedOrderSet = new TreeSet<>(Collections.reverseOrder());
        reversedOrderSet.addAll(reversedNames);
        System.out.println("3. Reversed names in reverse order TreeSet: " + reversedOrderSet);

        // 4a. Find numbers less than 50 in TreeSet
        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(10, 20, 30, 50, 60, 70));
        SortedSet<Integer> lessThan50 = numbers.headSet(50);
        System.out.println("4a. Numbers less than 50: " + lessThan50);

        // 4b. Find numbers greater than 50 in TreeSet
        SortedSet<Integer> greaterThan50 = numbers.tailSet(51);
        System.out.println("4b. Numbers greater than 50: " + greaterThan50);

        // 5a. Get element >= given element in TreeSet
        Integer given = 25;
        Integer ceiling = numbers.ceiling(given);
        System.out.println("5a. Element >= " + given + ": " + ceiling);

        // 5b. Get element <= given element in TreeSet
        Integer floor = numbers.floor(given);
        System.out.println("5b. Element <= " + given + ": " + floor);

        // 6a. Get element strictly greater than given element in TreeSet
        Integer higher = numbers.higher(given);
        System.out.println("6a. Element > " + given + ": " + higher);

        // 6b. Get element strictly less than given element in TreeSet
        Integer lower = numbers.lower(given);
        System.out.println("6b. Element < " + given + ": " + lower);

        // 7. Reverse and print a TreeSet of names
        TreeSet<String> nameSet = new TreeSet<>(Arrays.asList("John", "Alice", "Bob"));
        NavigableSet<String> reversedNamesSet = nameSet.descendingSet();
        System.out.println("7. TreeSet reversed: " + reversedNamesSet);

        // 8. Retrieve and remove the first and last element of TreeSet of names
        TreeSet<String> nameSet2 = new TreeSet<>(Arrays.asList("John", "Alice", "Bob"));
        String firstRemoved = nameSet2.pollFirst();
        String lastRemoved = nameSet2.pollLast();
        System.out.println("8. Removed first: " + firstRemoved);
        System.out.println("8. Removed last: " + lastRemoved);
        System.out.println("8. Remaining set after removals: " + nameSet2);

        // 9. Print first and last element of TreeSet of names
        TreeSet<String> nameSet3 = new TreeSet<>(Arrays.asList("John", "Alice", "Bob"));
        System.out.println("9. First element: " + nameSet3.first());
        System.out.println("9. Last element: " + nameSet3.last());

        // 10. Remove duplicates from an array and store unique strings in a HashSet
        String[] arr = {"apple", "banana", "apple", "cherry"};
        HashSet<String> uniqueSet = new HashSet<>(Arrays.asList(arr));
        System.out.println("10. Unique strings from array: " + uniqueSet);

        // Advanced

        // 11a. Retain common elements of two HashSets (intersection)
        HashSet<String> web = new HashSet<>(Arrays.asList("HTML","CSS","ANGULAR","REACT"));
        HashSet<String> fullstack = new HashSet<>(Arrays.asList("HTML","Spring","Java","REACT"));
        HashSet<String> common = new HashSet<>(web);
        common.retainAll(fullstack);
        System.out.println("11a. Common elements: " + common);

        // 11b. Find elements in one set but not both (symmetric difference)
        HashSet<String> difference = new HashSet<>(web);
        difference.addAll(fullstack);
        HashSet<String> tmp = new HashSet<>(web);
        tmp.retainAll(fullstack);
        difference.removeAll(tmp);
        System.out.println("11b. Symmetric difference: " + difference);

        // 12. Count distinct words from a paragraph using HashSet
        String paragraph = "Java is fun. Java is powerful.";
        String[] words = paragraph.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");
        HashSet<String> distinctWords = new HashSet<>(Arrays.asList(words));
        System.out.println("12. Count of distinct words: " + distinctWords.size());
        System.out.println("12. Distinct words: " + distinctWords);

        // 13. Group strings by first letter using TreeSet
        List<String> fruits = Arrays.asList("apple", "banana", "apricot", "cherry", "blueberry");
        Map<Character, TreeSet<String>> grouped = new TreeMap<>();
        for (String fruit : fruits) {
            char firstChar = fruit.charAt(0);
            grouped.putIfAbsent(firstChar, new TreeSet<>());
            grouped.get(firstChar).add(fruit);
        }
        System.out.println("13. Grouped by first letter: " + grouped.values());

        // 14. Find longest string from set and store all strings of the same length in HashSet
        Set<String> wordsSet = new HashSet<>(Arrays.asList("java", "javascript", "python", "kotlin","react","scss"));

        int maxLen = 0;
        for (String word : wordsSet) {
            maxLen = Math.max(maxLen, word.length());
        }
        HashSet<String> longestStrings = new HashSet<>();
        for (String word : wordsSet) {
            if (word.length() == maxLen) {
                longestStrings.add(word);
            }
        }
        System.out.println("14. Longest string(s): " + longestStrings);

        // 15. Remove all strings from a HashSet that start with 'a'
        HashSet<String> sampleSet = new HashSet<>(Arrays.asList("apple", "banana", "avocado", "cherry"));
        sampleSet.removeIf(s -> s.startsWith("a"));
        System.out.println("15. After removing strings starting with 'a': " + sampleSet);
    }
}
