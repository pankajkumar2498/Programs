import java.util.Arrays;

public class LinearSearchString {

    private static boolean linearSearchString(String str, char target) {

        if (str.length() == 0)
            return false;

        for (int i = 0; i < str.length(); i++) {

            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String str = "I am Pankaj Maurya";
        
        System.out.println(Arrays.toString(str.toCharArray()));     // Converts String into Character Array.
      
        char target = 'u';

        System.out.println(linearSearchString(str, target));

    }

}
