public class GCD_LCM {

    // Normal Approach
    static int GCD(int a, int b) {
        while (b % a != 0) {
            int rem = b % a;
            a = rem;
            b = a;
        }
        return a;
    }

    // Recursive approach
    static int GCD_Recursive(int a, int b) {
        if (b % a == 0) {
            return a;
        }
        return GCD_Recursive(b, b % a);
    }

    static int LCM(int a, int b) {

        int LCM = (a * b) / GCD(a, b);

        return LCM;
    }

    public static void main(String[] args) {

        System.out.println(GCD(500, 250));

        System.out.println(GCD_Recursive(500, 250));

        System.out.println(LCM(2, 8));
    }
}
