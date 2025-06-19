import java.util.ArrayList;

class IsPrime {

    // Brute Force Approach --> O(n)
    static boolean isPrime1(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Optimal Approach --> O(sqrt(n))
    static boolean isPrime2(int num) {

        if (num < 2) {
            return false;
        }

        // int sqrt = (int) Math.sqrt(num);
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // getting how many prime numbers are there below any number
    static void seivePrime(int num, boolean[] primes) {

        for (int i = 2; i * i <= num; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= num; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= num; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    // find Divisors of any Number
    static void findDivisor(int num) {

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // find Divisors of any Number(Optimal Approach)
    static int[] findDivisors(int num) {
        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
            }
        }

        // Convert ArrayList to int[]
        int[] result = new int[divisors.size()];
        for (int i = 0; i < divisors.size(); i++) {
            result[i] = divisors.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int num = 40;
        // boolean ans = isPrime2(num);

        // if(ans){
        // System.out.println("Prime");
        // }else{
        // System.out.println("Not Prime");
        // }

        boolean[] primes = new boolean[num + 1];
        IsPrime.seivePrime(num, primes);

    }
}
