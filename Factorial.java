import java.util.Scanner;

public class Factorial {

    // To handle fatorial of small numbers
        public static void main(String[] args) {
    
            Scanner scan = new Scanner(System.in);
    
            System.out.print("Enter Number: ");
            int num = scan.nextInt();
    
            double fact = 1;
    
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
    
            System.out.println("Factorial of " + num + " is: " + fact);
            scan.close();
    
        }


    // to handle large Factorials Numbers
    // public static void main(String[] args) {

    //     Scanner scan = new Scanner(System.in);

    //     System.out.print("Enter Number: ");
    //     int  num = scan.nextInt();

    //     BigInteger  fact = BigInteger.ONE;

    //     for (int i = 1; i <= num; i++) {
    //         fact = fact.multiply(BigInteger.valueOf(i));
    //     }

    //     System.out.println("Factorial of " + num + " is: " + fact);
    //     scan.close();

    // }


    // Factorial by Recursion
    // public static void main(String[] args) {

    // Scanner scan = new Scanner(System.in);
    // System.out.print("Enter Number: ");
    // int num = scan.nextInt();
    // System.out.println("Factorial of "+ num + " is: "+ factorial(num));

    // scan.close();
    // }

    // public static int factorial(int n) {
    // if(n == 0) {
    // return 1;
    // }
    // return n * factorial(n-1);
    // }

}
