import java.util.Scanner;
static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

static class queue {
    Node front, rear;

    void enqueue(int x) {
        Node n = new Node(x);
        if (rear == null) {
            front = rear = n;
        } else {
            rear.next = n;
            rear = n;
        }
    }

    int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int x = front.data;
        front = front.next;
        if (front == null) rear = null;
        return x;
    }

    void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue q = new queue();
        int choice = 0;

        while (choice != 4) {
            System.out.println("1.Enqueue 2.Dequeue 3.Display 4.Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter value: ");
                q.enqueue(sc.nextInt());
            } else if (choice == 2) {
                int x = q.dequeue();
                if (x != -1) System.out.println("Dequeued: " + x);
            } else if (choice == 3) {
                q.display();
            }
        }
    }
