import java.util.Scanner;

public class StackUsingArray {
    Scanner sc = new Scanner(System.in);

    int top = -1;
    int n = 5;
    int Stack[] = new int[n];

    public void push(int data) {
        if (top == (n - 1)) {
            System.out.println("Stack is already full.Elements can't be push into Stack.");
        } else {
            Stack[top + 1] = data;
            top++;
            System.out.println(data + " pushed Successfully.");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty. No Element to pop");
        } else {
            int data;
            top--;
            data = Stack[top + 1];
            Stack[top + 1] = 0;
            System.out.print(data + " Popped out Succesfully.");
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.print("\nStack is Empty. No Element present.");
        }
        int data = Stack[top];
        System.out.println("\nTop Element of Stack is: " + data);
    }

    void display() {
        System.out.print("Elements in Stack are: ");
        for (int i : Stack) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        StackUsingArray s = new StackUsingArray();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.display();
        s.peek();
        s.pop();
        s.peek();
        s.pop();
        s.peek();
        s.display();
    }
}