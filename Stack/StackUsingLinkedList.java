import java.util.Scanner;

public class StackUsingLinkedList {

    static class Node {
        int data;
        Node next = null;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null;

    public void push(Scanner sc) {
        System.out.print("Enter data: ");
        int data = sc.nextInt();

        Node new_node = new Node(data);

        if (top == null) {
            top = new_node;
        } else {
            new_node.next = top;
            top = new_node; 
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("Linked List is Empty.No element to delete.");
        } else {
            top = top.next;
        }
    }

    public void display() {
        Node temp = top;
        System.out.print("Elemnts in Satck are: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StackUsingLinkedList ll = new StackUsingLinkedList();
        int choice;
        boolean flag = true;
        while (flag) {

            System.out.println("\nPress 1. Push. \nPress 2. Pop. \nPress 3. Display. \nPress 4. Exit.");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ll.push(sc);
                    break;

                case 2:
                    ll.pop();
                    break;

                case 3:
                    ll.display();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                
                }
        }
    }
}
