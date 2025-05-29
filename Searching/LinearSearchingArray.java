public class LinearSearchingArray {

    static int linearSearch(int[] arr, int target) {

        if (arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++){

            if( target == arr[i]){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }
    
    static boolean linearSearch1(int[] arr, int target) {

        if (arr.length == 0)
            return false;

        for (int i = 0; i < arr.length; i++){

            if( target == arr[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 12, 32, 5 };
        int target = 55;

        System.out.println(linearSearch(arr, target));

    }

}
