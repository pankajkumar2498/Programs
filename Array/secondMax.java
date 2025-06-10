package Array;

public class secondMax {

    public static void main(String[] args) {

<<<<<<< HEAD
        int[] arr = { 4, 5, 6, 100 };
        int start = 0;
        int end = arr.length;

        int firstMax = arr[0];
        int secondMax = arr[0];
        if (arr.length < 2) {
            System.out.println("Minimum 2 elements required for SecondMax value");
        } else if (start < end) {
            for (int i = 0; i < arr.length; i++) {
                if (firstMax < arr[i]) {
                    secondMax = firstMax;
                    firstMax = arr[i];
                }
            }
            System.out.println(secondMax);
=======
        int[] arr = {4, 55, 16, 100};
        
        if (arr.length < 2) {
            System.out.println("Minimum 2 elements required for SecondMax value");
            return;
>>>>>>> refs/remotes/origin/master
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
<<<<<<< HEAD

// package Array;

// public class secondMax {

// public static void main(String[] args) {

// int[] arr = {4, 5, 6, 100};

// if (arr.length < 2) {
// System.out.println("Minimum 2 elements required for SecondMax value");
// return;
// }

// int firstMax = Integer.MIN_VALUE;
// int secondMax = Integer.MIN_VALUE;

// for (int num : arr) {
// if (num > firstMax) {
// secondMax = firstMax;
// firstMax = num;
// } else if (num > secondMax && num != firstMax) {
// secondMax = num;
// }
// }

// if (secondMax == Integer.MIN_VALUE) {
// System.out.println("No distinct second maximum found.");
// } else {
// System.out.println("Second max: " + secondMax);
// }
// }
// }
=======
>>>>>>> refs/remotes/origin/master
