public class PalindromeString {

    // Optimal Approach
    static boolean isPalindrome(String str, int start, int end) {

        for (int i = start; i < end; i++) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Optimal Approach by Recursion
    static boolean isPalindromeRecursion(String str, int start, int end) {
        if (start >= end) { // if pointers have crossed each other then it's a palindrome
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindromeRecursion(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String str = "MadaM";

        // System.out.println(isPalindrome(str, 0, str.length() - 1));

        System.out.println(isPalindromeRecursion(str, 0, str.length() - 1));
    }

}
