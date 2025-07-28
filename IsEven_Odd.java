
public class IsEven_Odd {

    static boolean IsOdd(int num) {

        // Biwise & --> num & odd no. = 1   (ALWAYS)
        // Biwise & --> num & even no. = 0  (ALWAYS)
        if ((num & 1) == 1)
            return true;
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        int num = 7;

        System.out.println(IsOdd(num));

    }
}
