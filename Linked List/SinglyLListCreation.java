import java.util.Scanner;

public class SinglyLListCreation {

    // Creation of Node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;       // head is pointer,initially pointed to null value means head contains null value
    // Creation of Linked List
    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter data: ");
            data = sc.nextInt();

            Node new_node = new Node(data);

            if (head == null) // check--> list exists or not
            {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;
            }
            System.out.println("Do you want to add more data.If yes then press 1");
            n = sc.nextInt();
        } while (n == 1);

        sc.close();
    }

    // Traversing the Linked List
    public void traverser() {
        Node temp = head;

        if( head == null ){
            System.out.println("Linked List doesn't exist.");
        }else{
            while( temp!= null ){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
        }
    }

        public static void main(String[] args) {
        InsertSinglyLinkedList ll = new InsertSinglyLinkedList();
        ll.creation();
        ll.traverser();

    }

}
