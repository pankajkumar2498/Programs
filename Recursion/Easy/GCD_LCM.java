package Recursion.Easy;

public class GCD_LCM {

    // Normal Approach
    static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Recursive approach
    static int GCD_Recursive(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD_Recursive(b, a % b);
    }

    static int LCM(int a, int b) {

        int LCM = (a * b) / GCD(a, b);

        return LCM;
    }

    public static void main(String[] args) {

        System.out.println(GCD(8, 9));

        System.out.println(GCD_Recursive(8, 9));

        System.out.println(LCM(8, 9));
    }
}
