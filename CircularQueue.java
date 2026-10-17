class CircularQueue {
    int[] queue = new int[5];
    int front = 0;
    int rear = 0;
    int count = 0;

    void enqueue(int x) {
        if (count == 5) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = x;
        rear = (rear + 1) % 5;
        count++;
    }

    void dequeue() {
        if (count == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Removed: " + queue[front]);
        front = (front + 1) % 5;
        count--;
    }

    void display() {
        int i = front;
        for (int n = 0; n < count; n++) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % 5;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();      // 10 20 30

        q.dequeue();      // Removed: 10
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);    // wraps to the start
        q.display();      // 20 30 40 50 60
    }
}