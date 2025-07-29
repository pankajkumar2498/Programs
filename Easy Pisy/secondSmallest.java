public class secondSmallest {

    static int secondSmallestNum(int[] arr) {

        int smallestNum = Integer.MAX_VALUE;
        int secondSmallestNum = Integer.MAX_VALUE;

        if (arr.length == 1)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallestNum) {
                secondSmallestNum = smallestNum;
                smallestNum = arr[i];
            } else if (arr[i] < secondSmallestNum && arr[i] != smallestNum) {
                secondSmallestNum = arr[i];
            }
        }
        return secondSmallestNum;
    }

    public static void main(String[] args) {

        int[] arr = { 15, 100, 12, 24, 25, 6 };

        System.out.println(secondSmallestNum(arr));

    }
}
