import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

        /*
        // Simple program
         int arr[] = { 2, 4 , 4, 10, 5};
        
        int key = 4;

        int found = 0;

        for( int i=0 ; i< arr.length ; i++ ){

            if( key == arr[i] ){
                found++;
                System.out.println(arr[i]+ " found at index "+ i);
            }            
        }

        if ( found != 0 ){
            System.out.println(key + " found "+ found +" times.");
        }else{
            System.out.println("Element not found!!!");
        }
         */
		 

        // User defined values 
        Scanner scan = new Scanner(System.in);	
        
        System.out.println("Enter num of elements in Array: ");
        
        int num = scan.nextInt();

        int arr[] = new int[num] ;
        
        System.out.print("Enter Elements of Array: ");

        for( int i=0; i<arr.length; i++){
        
            arr[i] = scan.nextInt();
        
        }
        
        System.out.print("Enter Key to Search: ");
        int key = scan.nextInt();

		int result = Linear_Search( arr , key);

        if( result != -1 ){
            System.out.println("Element found at index: "+ result);
        }
        else{
            System.out.println("Element not Found.");
        }		

        scan.close();     

	}
	
	public static int Linear_Search( int arr[] , int key ) {
		
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key ){
                return i;
            }
        }
		return -1;
	}

    
	
}
