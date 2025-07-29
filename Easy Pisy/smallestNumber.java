class Smallest_Number {
    public static void main(String[] args){
        
        int ages[] = { 22, 33, 16, 12, 43, 50};
        
        //
        // int smallest_num = ages[0];

        // for( int age : ages){

        //     if(smallest_num > age){
        //         smallest_num = age;
        //     }
        // }
        //     System.out.println("Smallest Number is: " + smallest_num);

        // Average of Ages 
        int sum = 0;
        for( int i : ages){
            sum+= i;
        }

        int avg = sum / ages.length;

        System.out.println(avg);

    }
}


  