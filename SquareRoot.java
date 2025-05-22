
public class SquareRoot {

    static void squareRoot(int num, int p) {

        int low = 0;
        int high = num;
        int mid = low + (high - low) / 2;

        while (low <= high) {
            // System.out.println("Square Root doesn't exist.");


            if (mid * mid == num) {
                System.out.println(mid);
            }

            if (mid * mid <= num) {
                low = mid + 1;
            } 
            
            if(mid*mid >= num ){
                high = mid - 1;
            }

        }
        System.out.println(mid);

    }

    public static void main(String[] args) {

        int num = 40;
        int p = 2;
        System.out.println("hih");
        squareRoot(num, p);

    }

}
