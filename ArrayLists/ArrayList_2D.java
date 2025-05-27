package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_2D {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int size = 3;
        System.out.println("Enter Elements: ");
        for (int i = 0; i < size; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                list.get(i).add(scan.nextInt());
            }
        }

        for (ArrayList<Integer> arrayList : list) {
            System.out.println(arrayList);
        }

        System.out.println(list);

        scan.close();
    }

}
