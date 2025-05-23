class IsPrime {

      // Brute Force Approach --> O(n)
    static boolean isPrime1(int num){

        if( num < 2 ){
            return false;
        }

        for( int i=2; i <= num; i++){
            if( num%i == 0 ){
                return false;
            }
        }
        return true;
    }   
    
    // Optimal Approach --> O(sqrt(n))
    static boolean isPrime2(int num){

        if( num < 2 ){
            return false;
        }

        //     int sqrt = (int) Math.sqrt(num);
        for( int i=2; i*i <= num; i++){
            if( num%i == 0 ){
                return false;
            }
        }
        return true;
    }   

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
       
        int num = 40;
        // boolean ans = isPrime2(num);

        // if(ans){
        //     System.out.println("Prime");
        // }else{
        //     System.out.println("Not Prime");
        // }
       
        boolean[] primes = new boolean[num + 1];
        IsPrime.seivePrime(num, primes);
        
    }
}
