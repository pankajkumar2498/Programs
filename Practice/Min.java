package Practice;

public class Min {

    // Find Minimum value
    static int minValue(int[] arr) {

        int min = arr[0];
        
        if (arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    
    // Find Minimum using BinarySearch
    public int findMin(int[] nums) {

        int start = 0;
        int end = nums.length -1;

        while(start < end){
            int mid = start + (end - start)/2;

            if( nums[mid] > nums[end] ){
                start = mid + 1;
            }else if(nums[mid] < nums[end]){
                end = mid;
            }
        }
        return nums[start];      
    }

    public static void main(String[] args) {
        int[] nums = { 52, 53, 55, 23, 34, 50, 51 };

        int min = minValue(nums);

        System.out.println(nums.length - min);

    }
}
