import java.util.ArrayList;

public class Factors {

    // Brute Force approach --> O(n)
    static void factors1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

    }

    // Optimal Approach --> O(sqrt(n))
    static void factors2(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " "); // for perfect square numbers like 36 = 6*6 ; it will print two times 6,
                                               // so to avoid this whenever this happens print only i(one time only)
                } else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }

    // Optimal Approach --> for both tiime and space Complexity O(sqrt(n))
    static void factors3(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " "); // for perfect square numbers like 36 = 6*6 ; it will print two times 6,
                                               // so to avoid this whenever this happens print only i(one time only)
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

    }

    public static void main(String[] args) {

        int num = 36;
        // factors1(num);

        factors3(num);

    }
}
