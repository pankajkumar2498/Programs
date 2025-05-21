import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter num of element in Array: ");
        int n = scan.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter Elements of Array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int flag;
        for (int i = 0; i < (n - 1); i++) // for making passes, if we have n elements then passes will be (n-1) passes
        {
            flag = 0;
            for (int j = 0; j < (n - 1); j++) // for making comparisions, if we have n elements then we have (n-1) comparisions
            {
                if (arr[j] > arr[j + 1]) // Swapping Logic
                {
                    flag = 1;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            // check if values are swapped, if not then break for avoiding uneccssary Comaparisons.
            
            if (flag == 0)          // this logic is for optimised Bubble Sort. 
            {
                break;
            }
        }

        // for printing Array...
        System.out.println("Sorted Array is: ");
        for (int i = 0; i <= (n - 1); i++) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }
}