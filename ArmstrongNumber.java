
// 153 = 1^3 +5^3 +3^3 where 3 is the number of digits
//  1+125+27 = 153

public class ArmstrongNumber {

    static boolean isArmstrong(int num) {
        int n = num;
        int digits = countDigits(num);
        double armstrongNum = 0;

        while (n != 0) {
            int rem = n % 10;
            armstrongNum += (int) Math.pow(rem, digits);
            n = n / 10;
        }

        if (armstrongNum == num) {
            return true;
        } else {
            return false;
        }

    }

    static int countDigits(int num) {
        int countDigits = 0;

        if (num == 0)
            return 1;

        while (num != 0) {
            countDigits++;
            num = num / 10;
        }

        return countDigits;
    }

    public static void main(String[] args) {
        int num = 54748; // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,153, 370, 371, 407,1634, 8208, 9474, 54748, 92727, 93084

        System.out.println(isArmstrong(num));
    }
}
