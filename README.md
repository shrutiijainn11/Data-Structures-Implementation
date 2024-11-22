# Data-Structures-Implementation
Implementation of multiple data structures in java

Here are the basic details about the data structures listed in the image:

1. **Array (Array.java)**:
   - **Definition**: A collection of elements, each identified by an index or key.
   - **Operations**: Access, insert, delete.
   - **Time Complexities**:
     - Access: O(1)
     - Insertion/Deletion: O(n) (for unsorted arrays)
     - Search: O(n)
   
2. **Binary Tree (BinaryTree.java)**:
   - **Definition**: A tree data structure with each node having at most two children (left and right).
   - **Operations**: Insertion, deletion, traversal (pre-order, in-order, post-order).
   - **Time Complexities**:
     - Search: O(log n) (balanced tree)
     - Insert/Delete: O(log n) (balanced tree)
     - Traversal: O(n)
   
3. **Circular Queue (CircularQueue.java)**:
   - **Definition**: A queue where the last position is connected back to the first position, forming a circular structure.
   - **Operations**: Enqueue, Dequeue, Peek.
   - **Time Complexities**:
     - Enqueue/Dequeue: O(1)
     - Peek: O(1)

4. **Doubly Linked List (DoublyLinkedList.java)**:
   - **Definition**: A list in which each node contains references to both the next and previous node.
   - **Operations**: Insertion, deletion, traversal.
   - **Time Complexities**:
     - Access: O(n)
     - Insertion/Deletion: O(1) (if node is known)
     - Search: O(n)

5. **Graph (Graph.java)**:
   - **Definition**: A collection of nodes (vertices) connected by edges.
   - **Types**: Directed, Undirected, Weighted, Unweighted.
   - **Operations**: BFS, DFS, find shortest path.
   - **Time Complexities**:
     - BFS/DFS: O(V + E) (V = vertices, E = edges)
     - Dijkstra's Algorithm: O(V^2) (using matrix) or O(E + V log V) (using heap)

6. **HashMap Example (HashMapExample.java)**:
   - **Definition**: A data structure that stores key-value pairs, allowing fast access.
   - **Operations**: Insertion, deletion, lookup.
   - **Time Complexities**:
     - Access: O(1) (average case)
     - Insert/Delete: O(1) (average case)
     - Worst-case (if many collisions): O(n)

7. **Max Heap (MaxHeap.java)**:
   - **Definition**: A binary tree where the value of each parent node is greater than or equal to the values of its children.
   - **Operations**: Insertion, deletion, peek maximum.
   - **Time Complexities**:
     - Insert: O(log n)
     - Delete: O(log n)
     - Peek: O(1)

8. **Min Heap (MinHeap.java)**:
   - **Definition**: A binary tree where the value of each parent node is less than or equal to the values of its children.
   - **Operations**: Insertion, deletion, peek minimum.
   - **Time Complexities**:
     - Insert: O(log n)
     - Delete: O(log n)
     - Peek: O(1)

9. **Priority Queue Example (PriorityQueueExample.java)**:
   - **Definition**: A queue where elements are dequeued based on priority rather than the order they were enqueued.
   - **Operations**: Enqueue, dequeue, peek.
   - **Time Complexities**:
     - Enqueue/Dequeue: O(log n)
     - Peek: O(1)

10. **Queue (Queue.java)**:
    - **Definition**: A linear structure that follows the First In, First Out (FIFO) principle.
    - **Operations**: Enqueue, dequeue, peek.
    - **Time Complexities**:
      - Enqueue/Dequeue: O(1)
      - Peek: O(1)

11. **Singly Linked List (SinglyLinkedList.java)**:
    - **Definition**: A list where each node points to the next node in the sequence.
    - **Operations**: Insertion, deletion, traversal.
    - **Time Complexities**:
      - Access: O(n)
      - Insertion/Deletion: O(1) (if node is known)
      - Search: O(n)

12. **Stack (Stack.java)**:
    - **Definition**: A linear data structure that follows the Last In, First Out (LIFO) principle.
    - **Operations**: Push, pop, peek.
    - **Time Complexities**:
      - Push/Pop: O(1)
      - Peek: O(1)

These data structures are fundamental for understanding algorithms and their time complexities in co
