public class secondMax {

    public static void main(String[] args) {

        int[] arr = {4, 55, 16, 100};
        
        if (arr.length < 2) {
            System.out.println("Minimum 2 elements required for SecondMax value");
            return;
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No distinct second maximum found.");
        } else {
            System.out.println("Second max: " + secondMax);
        }
    }
}
