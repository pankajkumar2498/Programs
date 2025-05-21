import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter num of element in Array: ");
        int n = scan.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter Elements of Array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < n - 1; i++) // for Swapping elements. ( j < (n-1) --> for avoiding last element in Comparision bcoz in last it is always Largest element.)
        {
            int min = i; // make zero index value as minimum

            for (int j = i + 1; j < n; j++) // loop for picking up minimum element from Unsored Array. 
            {
                if (arr[j] < arr[min]) {
                    min = j; // change minimum value with newly min value
                }
            }

            // if (min != i) // checking minimum != i , if it not equals then Swap each other
            // {
            // int temp = arr[i];
            // arr[i] = arr[min];
            // arr[min] = temp;
            // }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        // Printing the Array...
        System.out.println("After Selection Sort Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scan.close();
    }
}
