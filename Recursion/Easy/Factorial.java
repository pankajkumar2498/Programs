package Recursion.Easy;

public class Factorial {

    // Recursive Approach to Calculate Factrial
    private static long Fact(long num) {

        if (num < 2) {
            return 1;
        }
        return num * Fact(num - 1);
    }

    private static long Fact_Sum(long num) {

        if (num < 2) {
            return 1;
        }
        return num + Fact(num - 1);
    }

    public static void main(String[] args) {

        long num = 5;
        System.out.println();
        System.out.println("Factorial of " + num + " is " + Fact(num));

        System.out.println("Sum of Factorial upto " + num + " is " + Fact_Sum(num));
    }
}
