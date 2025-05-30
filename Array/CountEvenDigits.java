package Array;

public class CountEvenDigits {

    static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count = count + 1;
            num = num / 10;
        }

        return count;
    }
    
    static int findNumbers(int[] nums) {

        int count = 0;
        if (nums.length == 0)
            return -1;

        for (int j = 0; j < nums.length; j++) {
            
            int ans = countDigits(nums[j]);

            if(ans % 2 == 0){
                count = count +1;
            }

        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = { 12, 12, 456, 4657, 23 };

        System.out.println(findNumbers(arr));
    }
}