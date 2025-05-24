package Recursion.Easy;

// Print Sum of Digits like 1234 --> 10
public class Sum_ProductOfDigits {

    static int SumOfDigit(int num) {

        if (num == 0)
            return 0;

        int rem = num % 10;
        num = num / 10;
        return rem + SumOfDigit(num);  // return (num%10) + SumOfDigit(num/10);
    }
   
    static int ProductOfDigit(int num) {

        if (num%10 == num)      // Important: if One Single Digit is left then return that digit itself. 
            return num;

        int rem = num % 10;
        num = num / 10;
        return rem * ProductOfDigit(num);   // return (num%10) * ProductOfDigit(num/10);
    }

    public static void main(String[] args) {
        int num = 55;
        System.out.println();
        System.out.println("Sum of Digits of " + num + " is: " + SumOfDigit(num));
        System.out.println("Product of Digits of " + num + " is: " + ProductOfDigit(num));
    }
}
