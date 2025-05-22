class IsPrime {

    // static boolean isPrimeNum(int n) {
    //     if (n < 2) {
    //         return false;
    //     }

    //     int sqrt = (int) Math.sqrt(n);
    //     for (int i = 2; i * i <= sqrt; i++) {
    //         if (n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // getting how many prime numbers are there below any number
    static void seivePrime(int n, boolean[] primes) {

        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // int n = 25;
        // for (int i = 0; i <= n; i++) {
        // System.out.println(i + " " + isPrimeNum(i));
        // }

        int n = 40;
        boolean[] primes = new boolean[n + 1];
        IsPrime.seivePrime(n, primes);
    }
}
