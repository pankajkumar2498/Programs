package Recursion;

public class Print_Numto1 {

    // Brute Force Approach --> O(n)
    static void Print_Nto1(int num) {
        for (int i = num; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    // Print Number in Reverse
    // Recursive Approach --> O()  
    static void Print_Nto2(int num) {
        if( num == 0){
            return;
        }
        System.out.print(num + " ");
        Print_Nto2(num - 1);
    }

    // Print 1 to Number -- 1 2 3 4 5 ....
    static void Print_Nto3(int num) {
        if( num == 0){
            return;
        }
        Print_Nto3(num - 1);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {
        System.out.println();

        Print_Nto1(5);
        
        System.out.println();
        
        Print_Nto2(5);

        System.out.println();
        
        Print_Nto3(5);
    }
}
