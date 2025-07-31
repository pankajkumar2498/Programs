package Striver_DSA_Sheet.Array.Easy;

public class find_SetBits {

    // Find Set Bits in any Number or find in how many times we can reduced number to 0
    // Optimal Approach --> O(N)
        static void findSetBits1(int num) {
        int count = 0;
        while (num != 0) {
            num = num & (num - 1);
            count++;
        }
        System.out.println("Total Set Bits: " + count);
    }

    // Better Approach --> O(N)
    static void findSetBits(int num) {
        int count = 0;
        for (int i = 0; i <= 31; i++) {

            int bit = 1 << i; // always left shift by using 1

            if ((num & bit) != 0) {
                count++;
            }
        }
        System.out.println("Total Set Bits: " + count);
    }

    // this function sets nth-bit to 0 where n can be any number.
    // static void setBitsToZero(int num) {
    //     int count = 0;
    //     for (int i = 0; i <= 31; i++) {
    //         int bit = 1 << i;
    //     }
    // }

    public static void main(String[] args) {

        int num = 7;

        findSetBits(num);

        findSetBits1(num);

    }

}
