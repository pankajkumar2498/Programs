public class SortingPrac {
    public static void main(String[] args) {

        int a[] = { 32, 45, 12, 5, 23 , 21 };
        // int a[] = { 43, 21, 98, 10, 5, 1 };
       

        // Bubble Sorting
         int flag;

        for (int i = 0; i < a.length - 1; i++) {
            flag = 0;
            for (int j = 0; j < a.length - 1; j++) {

                if (a[j] > a[j + 1]) {
                    flag = 1;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

            if (flag == 0) {
                break;
            }
        }

        for (int i=0 ; i< a.length-1; i++) {
            System.out.print( a[i] + " ");
        }
        

        // Selection Sorting
        
        /* 
        for( int i=0 ; i < a.length-1 ; i++ ){
            
            int min = i;            

            for( int j= i+1; j < a.length ; j++ ){

                if( a[j] < a[min]){
                    min = j;
                }

                int temp = a[i];
                a[i] = a[min];
                a[min] = temp ; 
            }
        }

        for (int i=0 ; i< a.length ; i++) {
            System.out.print( a[i] + " ");
        }
        */

        // Insertion Sorting...
        /* 
        for( int i=0; i<a.length; i++){
            int temp = a[i];
            int j = i-1;

            while( j>=0 && a[j] > temp ){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp; 
       
        }

        for( int i=0 ; i<a.length; i++ ){
            System.out.print(a[i]+ " ");
        }
        */
        
    }
}
