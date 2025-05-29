package Recursion.Easy;

public class CountNumOfZeros {

    // Brute Force Approach --> O(n)
    static int countZeroes(int num) {
        int count = 0;

        while (num != 0) {
            if (num % 10 == 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }

    // Recursive Approach --> O(n)
    static int countZeroByRecursion(int num, int count) {
        if (num == 0) {
            return count;
        }

        while (num != 0) {
            if (num % 10 == 0) {
                return countZeroByRecursion(num / 10, count + 1);
            } else {
                return countZeroByRecursion(num / 10, count);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println();

        int num = 91, count = 0;

        int ans1 = countZeroes(num);

        int ans2 = countZeroByRecursion(num, count);

        if (ans1 != 0) {
            System.out.println("Total Number of Zeroes Present in " + num + " are: " +
                    ans1);
        } else {
            System.out.println("No Zero present inside: " + num);
        }

        if (ans2 != 0) {
            System.out.println("Total Number of Zeroes Present in " + num + " are: " + ans2);
        } else {
            System.out.println("No Zero present inside: " + num);
        }
    }
}
