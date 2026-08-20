package Stack;

public class StackUsingArrays {

    static class Stack {
        int arr[];
        int top;

        Stack(int size) {
            arr = new int[5];
            top = -1;
        }

        // check if the stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // add operation
        public void push(int data) {
            if (top == arr.length - 1) {
                System.out.println("Stack is overflow!!");
                return;
            }
            top++;
            arr[top] = data;
        }

        // remove operation
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!!");
                return -1;
            }
            int value = arr[top];
            top--;

            return value;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!!");
                return -1;
            }
            return arr[top];
        }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack(5);
        s1.push(1);
        s1.push(2);
        s1.push(4);
        s1.push(5);

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
