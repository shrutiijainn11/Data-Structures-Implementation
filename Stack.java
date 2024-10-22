class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public Stack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    // Push element onto the stack
    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = data;
        }
    }

    // Pop element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }

    // Peek the top element
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());  // Output: 30
        stack.pop();
        System.out.println(stack.peek());  // Output: 20
    }
}
