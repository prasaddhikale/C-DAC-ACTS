package queue;

public class CircularQueue {
    private int front;
    private int rear;
    private int[] queue;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        front = -1;
        rear = -1;
        queue = new int[capacity];
    }

    boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("No element present");
            return -1;
        }
        int element = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        return element;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        System.out.println("Queue elements:");
        while (i != rear) {
            System.out.println(queue[i]);
            i = (i + 1) % capacity;
        }
        System.out.println(queue[rear]); // Display last element
    }

    int count() {
        if (isEmpty()) {
            return 0;
        }
        int count = 0;
        int i = front;
        while (i != rear) {
            count++;
            i = (i + 1) % capacity;
        }
        return count + 1; // Add 1 for the last element
    }
}