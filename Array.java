public class Array {
    private int[] array;
    private int size;

    // Constructor
    public Array(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    // Insert element
    public void insert(int element) {
        if (size < array.length) {
            array[size] = element;
            size++;
        } else {
            System.out.println("Array is full");
        }
    }

    // Delete element at index
    public void delete(int index) {
        if (index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    // Search for an element
    public int search(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1; // Not found
    }

    // Display the array
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Array array = new Array(5);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.display();  // Output: 10 20 30
        array.delete(1);
        array.display();  // Output: 10 30
        System.out.println(array.search(30));  // Output: 1
    }
}
