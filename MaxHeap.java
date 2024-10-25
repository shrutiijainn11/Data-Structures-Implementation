import java.util.Arrays;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    // Constructor
    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    // Insert a new element into the heap
    public void insert(int value) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full");
        }
        heap[size] = value;
        size++;
        heapifyUp(size - 1);
    }

    // Extract the maximum element (root) from the heap
    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return max;
    }

    // Heapify up to maintain heap property
    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        if (index > 0 && heap[index] > heap[parentIndex]) {
            swap(index, parentIndex);
            heapifyUp(parentIndex);
        }
    }

    // Heapify down to maintain heap property
    private void heapifyDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int largest = index;

        if (leftChildIndex < size && heap[leftChildIndex] > heap[largest]) {
            largest = leftChildIndex;
        }
        if (rightChildIndex < size && heap[rightChildIndex] > heap[largest]) {
            largest = rightChildIndex;
        }
        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    // Swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Display the heap
    public void display() {
        System.out.println("Heap: " + Arrays.toString(Arrays.copyOf(heap, size)));
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);

        // Insert elements
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(5);
        maxHeap.insert(15);
        maxHeap.insert(30);

        // Display the heap
        maxHeap.display();  // Output: Heap: [30, 20, 5, 10, 15]

        // Extract the maximum element
        System.out.println("Extracted Max: " + maxHeap.extractMax()); // Output: 30

        // Display the heap after extraction
        maxHeap.display();  // Output: Heap: [20, 15, 5, 10]
    }
}
