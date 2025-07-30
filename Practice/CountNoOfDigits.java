package Practice;

public class CountNoOfDigits {

    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        return (int) (Math.log10(Math.abs(number)) + 1);
    }

    public static int countDigits1(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int countDigits2(int number) {
        // Handle the special case of 0
        if (number == 0) {
            return 1;
        }
        
        // Convert to absolute value to handle negative numbers
        number = Math.abs(number);
        
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        
        return count;
    }

    public static void main(String[] args) {

        int num = 34687;

        System.out.println(countDigits(num));
        
    }
}
