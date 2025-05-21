import java.util.Scanner;

public class Stack1 {
    Scanner sc = new Scanner(System.in);

    int n = 5;
    int Stack[] = new int[n];
    int top = 0;

    public void push(int data) {
        if (top == n) {
            System.out.println("Stack is already full.");
        } else {
            Stack[top] = data;
            top++;
            System.out.println(data + " pushed Successfully.");
        }
    }

    public void pop() {
        if (top == 0) {
            System.out.println("Stack is Empty. No Element to pop");
        } else {
            int data;
            top--;
            data = Stack[top];
            Stack[top] = 0;
            System.out.print(data + " Popped out Succesfully.");
        }
    }

    public void peek() {
        if (top == 0) {
            System.out.print("\nStack is Empty. No Element to pop");
        }
        int data = Stack[top-1];
        System.out.println("\nTop Element of Stack is: " + data);
    }

    void display() {
        System.out.print("Elements in Stack are: ");
        for (int i : Stack) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        Stack1 s = new Stack1();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        s.peek();
        s.pop();
        s.peek();
        s.pop();
        s.display();

    }
}
