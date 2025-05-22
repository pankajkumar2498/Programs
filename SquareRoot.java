
// public class SquareRoot {

//     static void squareRoot(int num, int p) {

//         int low = 0;
//         int high = num;
//         int mid = low + (high - low) / 2;

//         while (low <= high) {
          
//             if (mid * mid == num) {
//                 System.out.println(mid);
//             }

//             if (mid * mid <= num) {
//                 low = mid + 1;
//             } 
            
//             if(mid*mid >= num ){
//                 high = mid - 1;
//             }

//         }
//         System.out.println(mid);

//     }

//     public static void main(String[] args) {

//         int num = 40;
//         int p = 2;
//         System.out.println("hih");
//         squareRoot(num, p);

//     }

// }


public class SquareRoot {

    public static double sqrt(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot compute square root of a negative number.");
        }

        // Precision for 2 decimal places
        double precision = 0.01;
        double low = 0;
        double high = number;
        double mid = 0;

        if (number < 1) {
            high = 1; // for numbers between 0 and 1, e.g. 0.25
        }

        while ((high - low) > precision) {
            mid = (low + high) / 2;
            if (mid * mid > number) {
                high = mid;
            } else {
                low = mid;
            }
        }

        // Round to 2 decimal places
        return Math.round(mid * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        double num = 10;
        double result = sqrt(num);
        System.out.println("Square root of " + num + " ≈ " + result);
    }
}
