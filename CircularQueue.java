public class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    // Constructor
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = rear = size = 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Add an element to the queue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = data;
        rear = (rear + 1) % capacity; // Wrap around
        size++;
    }

    // Remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Indicate empty queue
        }
        int data = queue[front];
        front = (front + 1) % capacity; // Wrap around
        size--;
        return data;
    }

    // Peek at the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; // Indicate empty queue
        }
        return queue[front];
    }

    // Display the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);
        circularQueue.enqueue(50);

        // Display the queue
        circularQueue.display();  // Output: Queue elements: 10 20 30 40 50 

        System.out.println("Dequeued element: " + circularQueue.dequeue()); // Output: 10
        circularQueue.enqueue(60);

        // Display the queue
        circularQueue.display();  // Output: Queue elements: 20 30 40 50 60

        System.out.println("Peek element: " + circularQueue.peek()); // Output: 20
    }
}
