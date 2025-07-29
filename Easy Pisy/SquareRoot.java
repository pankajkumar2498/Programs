
class SquareRoot {

    static double squareRoot(int num, int precision) {

        int low = 0;
        int high = num;
        double root = 0.0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == num) {
                return mid;
            }

            if (mid * mid < num) {
                root = mid;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        
        // for decimal part
        double inc = 0.1;
        for (int i = 0; i < precision; i++) {
            while (root * root <= num) {
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }
        return root;
    }

    public static void main(String[] args) {

        int num = 48;
        int precision = 2;

        double result = squareRoot(num, precision);

        // Check if it's an integer
        if (result == (int) result) {   
            System.out.printf("%d\n", (int) result);
        } else {
            System.out.printf("%.2f", result);
        }
    }
}
