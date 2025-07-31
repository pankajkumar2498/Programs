package Striver_DSA_Sheet.Array.Easy;

public class BinaryNumber {

    private static void findBinaryNumber(int num) {
        if (num == 0) {
            System.out.println("Binary Number: "+ num);
            return;
        }

        StringBuilder binary = new StringBuilder();

        while (num > 0) {
            binary.append(num % 2);
            num = num / 2;
        }

        // Since digits are added in reverse order, reverse the string
        System.out.println("Binary Number: " + binary.reverse());
    }

    public static void main(String[] args) {
        int num = 102;

        findBinaryNumber(num);
    }
}
