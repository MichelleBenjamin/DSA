import java.util.Scanner;
class StackOperations{
    int stack[] = new int[10];
    int top = -1; // -1 means the stack is empty

    // 1. Push 
    void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot add.");
            return;
        }
        top = top + 1;       
        stack[top] = value;  // add the new value
        System.out.println(value + " pushed.");
    }

    // 2. Pop 
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to remove.");
            return;
        }
        System.out.println("Popped value: " + stack[top]);
        top = top - 1; // move top down
    }

    // 3. Display 
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // 4. Size 
    void size() {
        System.out.println("Current size: " + (top + 1));
    }

    // 5. isEmpty 
    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    // 6. isFull 
    boolean isFull() {
        if (top == 9) { 
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StackOperations s = new StackOperations();
        int ch=0;

        while (ch != 7) {

            
            System.out.println("----- STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmtpy");
            System.out.println("6. isFull");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.println("Enter value to push:");
                int v = sc.nextInt();
                s.push(v);
            }

            if (ch == 2) {
                s.pop();
            }

            if (ch == 3) {
                s.display();
            }

            if (ch == 4) {
                s.size();
            }

            if (ch == 5) {
                if (s.isEmpty()) {
                    System.out.println("Stack is Empty: True");
                } else {
                    System.out.println("Stack is Empty: False");
                }
            }

            if (ch == 6) {
                if (s.isFull()) {
                    System.out.println("Stack is Full: True");
                } else {
                    System.out.println("Stack is Full: False");
                }
            }
        }

        System.out.println("Exit!Bye");
    }
}