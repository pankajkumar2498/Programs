import java.util.Scanner;

public class QueueUsingLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    public void enqueue(Scanner sc) {

        System.out.print("Enter Data: ");
        int data = sc.nextInt();
        Node new_node = new Node(data);

        if (front == null) {
            front = new_node;
            rear = new_node;
        } else {
            rear.next = new_node;
            rear = new_node;
        }
    }

    public void dequeue() {
        if ( front == null ) {
            System.out.println("UnderFlow Occurs. No element to delete.");
        } else {
            front = front.next;
        }
    }

    void display() {
        Node temp = front ;
        System.out.print("Elements in Queue are: ");
        while( temp != null ){
            System.out.print(temp.data+ " ");
            temp = temp.next; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        QueueUsingLinkedList Q = new QueueUsingLinkedList();

        while (true) {
            System.out.println("\nPress 1. Enqueue. \nPress 2. Dequeue. \nPress 3. Display. \nPress 4. Exit.");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Q.enqueue(sc);
                    break;

                case 2:
                    Q.dequeue();
                    break;

                case 3:
                    Q.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }

}
