import java.util.Scanner;
public class BankQueue {
    int[] arr= new int[10];
    int front;
    int rear;
    int max;
 
    // Constructor - size is passed here
    BankQueue(int size) {
        max = size;
        arr = new int[max];
        front = 0;
        rear = -1;
    }

    // 1. Enqueue
    void enqueue(int token) {
        if (rear == max - 1) {
            System.out.println("Queue is Full. Cannot add more.");
        } else {
            rear++;
            arr[rear] = token;
            System.out.println("Token " + token + " added to queue.");
        }
    }

    // 2. Dequeue
    void dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty.");
        } else {
            System.out.println("Serving Token: " + arr[front]);
            front++;
        }
    }

    // 3. Display
    public void display() {
        if (front > rear) {
            System.out.println("Queue is Empty.");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // 4. Size
    public int size() {
        if (front > rear) {
            return 0;
        }
        return (rear - front) + 1;
    }

    // 5. isEmpty
    public boolean isEmpty() {
        return front > rear;
    }

    // 6. isFull
    public boolean isFull() {
        return rear == max - 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        BankQueue bank = new BankQueue(10); 
        
        int choice = 0;

        
        while (choice != 7) {
            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter token number: ");
                    int token = input.nextInt();
                    bank.enqueue(token);
                    break;
                case 2:
                    bank.dequeue();
                    break;
                case 3:
                    bank.display();
                    break;
                case 4:
                    System.out.println("Current Size: " + bank.size());
                    break;
                case 5:
                    System.out.println("Is Empty? " + bank.isEmpty());
                    break;
                case 6:
                    System.out.println("Is Full? " + bank.isFull());
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        
        input.close();
    }
}