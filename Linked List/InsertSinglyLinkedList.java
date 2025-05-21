import java.util.Scanner;

public class InsertSinglyLinkedList {

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

            if (head == null) // check --> list exists or not
            {
                head = new_node;
            } else {
                System.out.println(
                        "Press 1. Insert at the beginning. \nPress 2. Insert at the end. \nPress 3. Insert at Particular Position. \nPress 4.Exit.");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        // Insert at the beginning
                        new_node.next = head;
                        head = new_node;
                        break;

                    case 2:
                        // Insert at the end
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;

                    case 3:
                        // Insert at the User specified Position
                        System.out.print("Enter Position of node at which you want to insert: ");
                        int pos = sc.nextInt();
                        Node temp1 = head;
                        for( int i=0; i<(pos-2); i++){
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;

                    case 4:
                        System.exit(0);
                }
            }
            System.out.println("Do you want to add more data.If yes then press 1");
            n = sc.nextInt();
        } while (n == 1);

        sc.close();
    }

    // Traversing the Linked List
    public void traverser() {
        Node temp = head;

        if (head == null) {
            System.out.println("Linked List doesn't exist.");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
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
