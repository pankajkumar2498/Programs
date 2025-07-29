import java.util.Scanner;

public class StrReverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = scan.next();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reverse String is: " + rev);

        scan.close();
    }

}
