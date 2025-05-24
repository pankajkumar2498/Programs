package Recursion.Easy;

public class Num_Reverse {

    static int newnum = 0;
    static void Reverse_Num(int num) {
        
        if (num == 0) {
            return;
        }
        newnum = newnum * 10 + (num % 10);
        Reverse_Num(num / 10);
        
    }

    public static void main(String[] args) {

        int num = 1321;
        Reverse_Num(num);
        System.out.println();
        System.out.println(newnum);

    }

}
