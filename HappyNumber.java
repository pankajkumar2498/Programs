// A number is called happy if it leads to 1 after a sequence of steps wherein each step number is replaced 
//by the sum of squares of its digit that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1. 

// Examples : 
// Input: n = 19
// Output: True
// 19 is Happy Number,
// 1^2 + 9^2 = 82
// 8^2 + 2^2 = 68
// 6^2 + 8^2 = 100
// 1^2 + 0^2 + 0^2 = 1
// As we reached to 1, 19 is a Happy Number.

// Input: n = 20
// Output: False

import java.util.HashSet;

public class HappyNumber {

    public static boolean isHappy(int n) {

        HashSet<Integer> usedNumbers = new HashSet<>();

        while (true) {

            int sum = 0;
            while (n != 0) {
                sum = sum + (int) Math.pow(n % 10, 2);
                n = n / 10;
            }

            if (sum == 1) {
                return true;
            } else {
                n = sum;
            }

            if (usedNumbers.contains(n)) {
                return false;
            } else {
                usedNumbers.add(n);
            }
        }
    }

    static int numSquareSum(int n) {
        int num = 0;
        while (n != 0) {
            int digit = n % 10;
            num += digit * digit;
            n /= 10;
        }
        return num;
    }

    // method return true if n is Happy Number
    static boolean isHappyNumber(int n) {
        HashSet<Integer> st = new HashSet<>();
        while (true) {
            n = numSquareSum(n);
            if (n == 1)
                return true;
            if (st.contains(n))
                return false;
            st.add(n);
        }
    }

    public static void main(String[] args) {

        int num = 19;
        System.out.println();
        System.out.println(isHappyNumber(num));

    }
}
