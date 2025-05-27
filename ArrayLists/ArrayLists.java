package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(35);
        list.add(36);
        list.add(37);
        list.add(38);
        System.out.println(list);

        System.out.println(list.contains(34));
        list.set(3, 84);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        // ArrayList using Scanner input
        ArrayList<Integer> al = new ArrayList<>();
        int size = 5;
        System.out.println("Enter Elements in ArrayList: ");
        for (int i = 0; i < size; i++) {
            al.add(scan.nextInt());
        }

        for (int i = 0; i < size; i++) {
            System.out.print(al.get(i) + " ");
        }
        scan.close();
    }
}
