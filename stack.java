import java.util.Scanner;
static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

static class stack {
    Node top;

    void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
    }

    int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int x = top.data;
        top = top.next;
        return x;
    }

    void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack sc1 = new stack();
        int choice = 0;

        while (choice != 4) {
            System.out.println("1.Push 2.Pop 3.Display 4.Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value: ");
                sc1.push(sc.nextInt());
            } else if (choice == 2) {
                int x = sc1.pop();
                if (x != -1) System.out.println("Popped: " + x);
            } else if (choice == 3) {
                sc1.display();
            }
        }
    }

