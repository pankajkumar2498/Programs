package Striver_DSA_Sheet.Array.Easy;

public class SwapUsingBitManupulation {

    // swap two values using Bit manupulation
    // Property of XOR: a^a = 0 , a^0 = 0
    static void swapusingBitMaupulation(int a, int b) {

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Value after Swapping: a= " + a + " b= " + b);

    }

    public static void main(String[] args) {

        int a = 5;
        int b = 15;

        System.out.println("Value before Swapping: a= " + a + " b= " + b);
        swapusingBitMaupulation(a, b);

    }

}
