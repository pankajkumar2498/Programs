package Recursion.Easy;

public class Print_Numto1 {

    // Brute Force Approach --> O(n)
    static void Print_Nto1(int num) {
        for (int i = num; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    // Recursive Approcah --> Print Number in Reverse --> 5 4 3 2 1
    static void Print_by(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num+ " ");
        Print_by(--num); // first decrement then pass value
    }

    // Print Number in Reverse --> 5 4 3 2 1
    // Recursive Approach --> O(n)
    static void Print_Nto2(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num + " ");
        Print_Nto2(num - 1);
    }

    // Print 1 to Number --> 1 2 3 4 5 ....
    static void Print_Nto3(int num) {
        if (num == 0) {
            return;
        }
        Print_Nto3(num - 1);
        System.out.print(num + " ");
    }

    // Prints 5 4 3 2 1 1 2 3 4 5 from both sides
    static void Print_Both(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num + " ");
        Print_Both(num - 1);
        System.out.print(num + " ");
    }

    public static void main(String[] args) {

        int num = 5;

        Print_Nto1(num);

        System.out.println();
        
        Print_by(num);
        System.out.println();

        Print_Nto2(num);

        System.out.println();

        Print_Nto3(num);

        System.out.println();

        Print_Both(num);
    }
}
