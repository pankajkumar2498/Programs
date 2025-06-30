package CollectionOperations;

// I have a list of 10 names. 
// 1.
//  a. which type of collection is best to retrieve the name in an index?
//  b. The method to get the name in index position five - 
//  c. The method to change the name in index position 2
// 2. Get the names that has the character 'a' and store those names in a different list, sort them and print it
// 3. Remove the names that start with a specific letter 'S' from a list, convert to uppercase, sort and print

// 4. Iterate through the names and get the names that ends with 'e' and remove the duplicates, store them in a different list. print only the last 2 elements
// 5. Reverse each name in the list and print the names in sorted manner - as 'Priya'- ayirP

// I have a list of 10 integer values  
// 6. 
//  a. Which type of collection is best to insert a number in first position?
//  b. Which method throws exception if the list is empty?
//  c. Which method returns a special value if the list is empty?
//  d. What exception is thrown if the list is empty? 

// 7. Iterate thru the list and get only the even numbers, store in another list(name is evennumbers) sort them and print it

// 8. Iterate thru the list and get the square of each number, check if the number is less than 500, if yes store those numbers in a list(name is squarenumber)   sort them and print it

// 9. Iterate thru the list and calculate the sum and average of numbers and print it
// 10. Iterate thru the list and remove the duplicate numbers and print it descending order

// bonus
// Create a LinkedList with single characters as 'y','a','d','t','a','e','r',g' and make it behave as LIFO 

import java.util.*;
import java.util.stream.Collectors;

public class ListOperations {

    public static void main(String[] args) {

        // Sample data
        List<String> names = new ArrayList<>(Arrays.asList(
                "Alice", "Steve", "Mark", "Sandra", "Eva",
                "John", "Mike", "Priya", "Sam", "Jane"
        ));

        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                10, 25, 14, 9, 36, 14, 81, 100, 121, 64
        ));

        // 1. Index-based operations
        // a. ArrayList is used for index-based access
        // b. Get name at index 5
        String nameAtFive = names.get(5);
        System.out.println("Name at index 5: " + nameAtFive);

        // c. Change name at index 2
        names.set(2, "NewName");
        System.out.println("Updated names: " + names);

        // 2. Names that contain 'a', sort and print
        List<String> namesWithA = names.stream()
                .filter(name -> name.toLowerCase().contains("a"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Names with 'a' sorted: " + namesWithA);

        // 3. Remove names starting with 'S', convert to uppercase, sort and print
        List<String> filteredUpper = names.stream()
                .filter(name -> !name.startsWith("S"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Filtered, uppercased, sorted names: " + filteredUpper);

        // 4. Names ending with 'e', remove duplicates, print last 2
        List<String> endsWithE = names.stream()
                .filter(name -> name.endsWith("e"))
                .distinct()
                .collect(Collectors.toList());
        int size = endsWithE.size();
        System.out.println("Last 2 names ending with 'e': " + endsWithE.subList(Math.max(0, size - 2), size));

        // 5. Reverse each name and sort
        List<String> reversedSorted = names.stream()
                .map(name -> new StringBuilder(name).reverse().toString())
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Reversed and sorted names: " + reversedSorted);

        // 6. Integer list operations
        // a. LinkedList for efficient front insertions
        LinkedList<Integer> linkedNumbers = new LinkedList<>(numbers);
        linkedNumbers.addFirst(999);  // Insert at front
        System.out.println("After inserting at front: " + linkedNumbers);

        // b. Method that throws exception if list is empty
        try {
            Integer first = linkedNumbers.get(0);
            System.out.println("First element: " + first);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: " + e);
        }

        // c. Method returning special value if list is empty
        Integer special = linkedNumbers.stream().findFirst().orElse(null);
        System.out.println("Special value if empty: " + special);

        // d. Exception thrown: IndexOutOfBoundsException (see above)

        // 7. Even numbers: filter, sort, print
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Even numbers sorted: " + evenNumbers);

        // 8. Squares < 500
        List<Integer> squareNumbers = numbers.stream()
                .map(n -> n * n)
                .filter(square -> square < 500)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Squares < 500: " + squareNumbers);

        // 9. Sum and average
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // 10. Remove duplicates and sort descending
        List<Integer> noDuplicatesDesc = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Unique numbers descending: " + noDuplicatesDesc);

        // Bonus: LIFO using LinkedList
        LinkedList<Character> lifoStack = new LinkedList<>();
        char[] chars = {'y', 'a', 'd', 't', 'a', 'e', 'r', 'g'};
        for (char ch : chars) {
            lifoStack.push(ch); // Push to front
        }
        System.out.print("LIFO Stack Output: ");
        while (!lifoStack.isEmpty()) {
            System.out.print(lifoStack.pop()); // Pop in LIFO order
        }
        System.out.println();
    }
}
