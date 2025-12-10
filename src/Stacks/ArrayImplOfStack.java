package Stacks;


import java.util.Stack;

public class ArrayImplOfStack {
    public static class Stack {
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is full bruh..");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        void pop() {
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
        }

        void peek() {
            if (idx <= 0) {
                System.out.println("Array negative size...");
                return;
            }
            System.out.println(arr[idx - 1]);
        }

        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.println(arr[i]);
            }
        }

        int size() {
            return idx;
        }

        void capacity() {
            System.out.println(arr.length);
        }

        boolean isEmpty() {
            if (size() == 0) return true;
            return false;
        }

        boolean isFull() {
            if (size() == arr.length) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.peek();
        st.push(4);
        st.display();
        st.push(3);
        st.display();
        st.push(5);
        st.display();
        st.push(2);
        st.display();
        st.pop();
        st.display();

        System.out.println("Peek");
        st.peek();
        System.out.println("size of stack " + st.size());
        st.capacity();

        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.push(1);
        st.push(10);
        System.out.println(st.isFull());
        st.push(2);
    }
}
