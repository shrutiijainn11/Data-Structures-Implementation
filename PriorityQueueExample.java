import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue with natural ordering
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Insert elements into the priority queue
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(15);

        // Display the priority queue elements
        System.out.println("Priority Queue: " + pq);

        // Remove and display the element with the highest priority (lowest value in default min-heap)
        System.out.println("Removed element: " + pq.poll()); // Output: 5

        // Peek at the highest priority element
        System.out.println("Peek element: " + pq.peek()); // Output: 10

        // Iterate through the priority queue
        System.out.println("Priority Queue after removal and peeking:");
        for (Integer element : pq) {
            System.out.println(element);
        }

        // Create a PriorityQueue with a custom comparator (max-heap example)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        
        maxHeap.add(10);
        maxHeap.add(5);
        maxHeap.add(20);
        maxHeap.add(15);

        // Display the max-heap
        System.out.println("Max-Heap Priority Queue: " + maxHeap);

        // Remove and display the element with the highest priority (largest value in max-heap)
        System.out.println("Removed element: " + maxHeap.poll()); // Output: 20

        // Peek at the highest priority element
        System.out.println("Peek element: " + maxHeap.peek()); // Output: 15

        // Iterate through the max-heap priority queue
        System.out.println("Max-Heap Priority Queue after removal and peeking:");
        for (Integer element : maxHeap) {
            System.out.println(element);
        }
    }
}
