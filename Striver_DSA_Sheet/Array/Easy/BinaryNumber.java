package Striver_DSA_Sheet.Array.Easy;

public class BinaryNumber {

    private static void findBinary(int num) {
        if (num == 0) {
            System.out.println("Binary Number: 0");
            return;
        }

        StringBuilder binary = new StringBuilder();

        while (num > 0) {
            int rem = num % 2;
            binary.append(rem);
            num = num / 2;
        }

        // Since digits are added in reverse order, reverse the string
        binary.reverse();

        System.out.println("Binary Number: " + binary.toString());
    }

    public static void main(String[] args) {
        int num = 12;

        findBinary(num);  // Output: Binary Number: 1001
    }
}
