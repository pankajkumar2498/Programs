package Recursion.Easy;

public class CountNumOfZeros {
    
    static int countZeroes(int num){
        int count = 0;

        while(num != 0){
            if( num%10 == 0){
                count++;
            }
            num= num/10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println();

        int num = 900;
        int ans = countZeroes(num);
        
        if(ans != 0){
            System.out.println("Total Number of Zeroes Present in "+ num + " are: "+ ans);
        }else{
            System.out.println("No Zero present inside "+ num);
        }
    }
}
