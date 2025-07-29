import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondMinimum {

    static int Min(int[] arr, int start, int end) {
        if ((start > end) || (arr.length == 0))
            return -1;

        int min = arr[start];

        for (int i = start; i < end; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    static int secondMin( int[] arr){
        
        if (arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return -1;
        }

    
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        Collections.sort(list);

        int firstMin = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) != firstMin) {
                return list.get(i);
            }
        }

        System.out.println("No second minimum found all elements might be equal.");
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 11, 23, 4, 65, 1 };

        System.out.println(Min(arr, 0, arr.length));
        System.out.println(secondMin(arr));
        
    }

}
