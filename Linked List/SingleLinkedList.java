// Singly Linked List

public class SingleLinkedList {
    Node head;
    private int size;

    // Constructor
    SingleLinkedList() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Insert in beginning of Linked List
    public void addFirst(String data) {
        Node firstNode = new Node(data);
        if (head == null) {
            head = firstNode;
            return;
        } else {
            firstNode.next = head;
            head = firstNode;
        }
    }

    // Insert in the end of Linked List
    public void addLast(String data) {
        Node lastNode = new Node(data);

        if (head == null) {
            head = lastNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = lastNode;
    }

    // delete from the beginning of Linked List
    public void deleteFirstNode() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete from the end of Linked List
    public void deleteLastNode() {
        if (head == null) { // if List is Empty
            System.out.println("List is Empty");
            return;
        }

        size--;
        if (head.next == null) { // if List contains only one Node
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;

        if (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }

        secondLastNode.next = null;
    }

    // Reverse Linked list

    public void reverseList_Iteratively() {

        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next; // store nextNode address in currNode so that the value didn't lost when links are reversing
            currNode.next = prevNode;

            // update the values of prevNode and currNode
            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null; // change head to null
        head = prevNode; // point head to new prevNode
    }

    // getter function for getting size of list
    public int getSize() {
        return size;
    }

    // Traversing the Linked List
    public void printSinglyList() {
        Node temp = head;

        if (temp == null) {
            System.out.println("List is Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        SingleLinkedList list = new SingleLinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");

        // list.printSinglyList();

        list.addLast("Linked_List");

        // System.out.println(list.getSize());
        list.printSinglyList();

        // list.deleteFirstNode();

        // list.reverseList_Iteratively();
        

        list.printSinglyList();

    }
}
