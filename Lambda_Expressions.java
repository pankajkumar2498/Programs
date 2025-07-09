// what are the functional interface in java ?
// 	In Java, a functional interface is an interface that has exactly one abstract method. These interfaces can be implemented using lambda expressions, method references, or anonymous classes.

// Functional interfaces are the backbone of Java's functional programming features introduced in Java 8.

// ✅ Key Characteristics:
// 	Only one abstract method.

// 	Can have default and static methods.

// 	Annotated with @FunctionalInterface (optional but helps with clarity and compiler checks).

// 🔧 Common Functional Interfaces in java.util.function Package:
// Interface		    Method Signature	        Description
// Function<T, R>	    R apply(T t)		    Takes a value of type T and returns R
// Predicate<T>		    boolean test(T t)	    Takes T, returns boolean (used for filtering)
// Consumer<T>		    void accept(T t)	    Takes T, returns nothing (used for side-effects)
// Supplier<T>		    T get()			        Takes nothing, returns T
// UnaryOperator<T>	    T apply(T t)		    A Function<T, T> — input and output are same
// BinaryOperator<T>	T apply(T t1, T t2)	    A BiFunction<T, T, T> — combines two inputs of same type
// BiFunction<T,U,R>	R apply(T t, U u)	    Takes two inputs of types T and U, returns R
// BiPredicate<T, U>	boolean test(T t, U u)	Two inputs, returns boolean
// BiConsumer<T, U>	    void accept(T t, U u)	Two inputs, returns nothing

// 🧩 Other Common Functional Interfaces
// Interface	Package	Purpose
// Runnable	java.lang	No input, no return (void run())
// Callable<V>	java.util.concurrent	No input, returns V (V call())
// Comparator<T>	java.util	int compare(T o1, T o2)


import java.util.function.*;
import java.util.*;
import java.util.concurrent.Callable;

public class Lambda_Expressions {

    public static void main(String[] args) {

        // 1. Function<T, R>: Converts Integer to String
        Function<Integer, String> intToString = i -> "Number: " + i;
        System.out.println(intToString.apply(5)); // Output: Number: 5

        // 2. Predicate<T>: Checks if string is empty
        Predicate<String> isEmpty = str -> str.isEmpty();
        System.out.println(isEmpty.test("")); // Output: true

        // 3. Consumer<T>: Prints a message
        Consumer<String> printer = message -> System.out.println("Hello, " + message);
        printer.accept("Java"); // Output: Hello, Java

        // 4. Supplier<T>: Supplies a random number
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random: " + randomSupplier.get());

        // 5. UnaryOperator<T>: Converts string to uppercase
        UnaryOperator<String> toUpper = str -> str.toUpperCase();
        System.out.println(toUpper.apply("hello")); // Output: HELLO

        // 6. BinaryOperator<T>: Adds two integers
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("Sum: " + add.apply(10, 20)); // Output: Sum: 30

        // 7. BiFunction<T, U, R>: Concatenates string and integer
        BiFunction<String, Integer, String> concat = (s, i) -> s + i;
        System.out.println(concat.apply("Age: ", 25)); // Output: Age: 25

        // 8. BiPredicate<T, U>: Checks if two strings are equal ignoring case
        BiPredicate<String, String> equalsIgnoreCase = (s1, s2) -> s1.equalsIgnoreCase(s2);
        System.out.println(equalsIgnoreCase.test("java", "JAVA")); // Output: true

        // 9. BiConsumer<T, U>: Prints key and value
        BiConsumer<String, Integer> mapPrinter = (k, v) -> System.out.println(k + " = " + v);
        mapPrinter.accept("Score", 90); // Output: Score = 90

        // 10. Runnable: Runs a thread
        Runnable task = () -> System.out.println("Running thread!");
        new Thread(task).start();

        // 11. Callable<V>: Returns a value from a thread (exception handling needed)
        Callable<String> callable = () -> "Callable result";
        try {
            System.out.println(callable.call()); // Output: Callable result
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 12. Comparator<T>: Compare two integers
        Comparator<Integer> comparator = (a, b) -> Integer.compare(a, b);
        System.out.println("Compare 5 and 10: " + comparator.compare(5, 10)); // Output: -1
    }
}