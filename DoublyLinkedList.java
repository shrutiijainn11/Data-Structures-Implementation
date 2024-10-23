class DoublyLinkedList {
    private Node head;
    private Node tail;

    // Node class representing each element in the list
    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Constructor
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    // Insert at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Insert at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Delete a node with specific data
    public void deleteNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next; // Moving head if node to be deleted is head
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev; // Moving tail if node to be deleted is tail
                }
                return;
            }
            current = current.next;
        }
        System.out.println("Node with data " + data + " not found.");
    }

    // Display the list from head to tail
    public void displayForward() {
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Display the list from tail to head
    public void displayBackward() {
        Node current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert elements
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtBeginning(0);

        // Display the list
        dll.displayForward();  // Output: Forward: 0 10 20 30 
        dll.displayBackward(); // Output: Backward: 30 20 10 0 

        // Delete a node
        dll.deleteNode(20);
        
        // Display the list again
        dll.displayForward();  // Output: Forward: 0 10 30 
        dll.displayBackward(); // Output: Backward: 30 10 0 
    }
}
