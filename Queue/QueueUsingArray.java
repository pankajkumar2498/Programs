import java.util.Scanner;

public class QueueUsingArray {

    int front = -1;
    int rear = -1;

    int n = 5;

    int q[] = new int[n];

    public void enqueue(Scanner sc) {
        if (rear == (n - 1)) {
            System.out.println("Overflow Condition.Element's can't be added.");
        } else {
            System.out.print("Enter Data: ");
            int i = sc.nextInt();
            if ((front == -1) && (rear == -1)) {
                front = 0;
                rear = 0;
                q[rear] = i;
            } else {
                rear = rear + 1;
                q[rear] = i;
            }
        }
    }

    public void dequeue() {
        if ((front == -1) && (rear == -1)) {
            System.out.println("UnderFlow Occurs. No element to delete.");
        } else {
            front = front + 1;
        }
    }

    void display() {
        System.out.print("Elements in Queue are: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(q[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice ;

        QueueUsingArray Q = new QueueUsingArray();

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
