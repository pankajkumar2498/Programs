import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_usingCollections {    
    public static void main(String[] args){

        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        // System.out.println(list);
        list.addFirst("This");
        list.addLast("List");
        System.out.println(list);
        // System.out.println(list.size());
        
        for(int i=0; i< list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        
        list.removeFirst();
        // System.out.println(list.size());

        // for(int i=0; i< list.size(); i++){
        //     System.out.print(list.get(i)+ " ");
        // }
        
        // list.removeLast();
        // System.out.println(list.size());

        // for(int i=0; i< list.size(); i++){
        //     System.out.print(list.get(i)+ " ");
        // }

        // list.remove(2);
        Collections.reverse(list);
        System.out.println();
        
        for(int i=0; i< list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        
    }

}
