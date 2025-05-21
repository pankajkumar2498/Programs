import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = scan.nextInt();

        System.out.println(isHappy(num));

        scan.close();
    }

    public static boolean isHappy(int n) {

        Set<Integer> usedNumbers = new HashSet<>();

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
}
