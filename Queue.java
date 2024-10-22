class Queue {
    private int[] queue;
    private int front, rear, capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = rear = 0;
    }

    // Enqueue an element
    public void enqueue(int data) {
        if (rear == capacity) {
            System.out.println("Queue is full");
        } else {
            queue[rear++] = data;
        }
    }

    // Dequeue an element
    public int dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int data = queue[front];
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
            return data;
        }
    }

    // Peek front element
    public int peek() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == rear;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.peek());  // Output: 10
        queue.dequeue();
        System.out.println(queue.peek());  // Output: 20
    }
}
