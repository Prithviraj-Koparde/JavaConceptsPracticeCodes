package Stacks;

public class LLImplOfStack {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LLStack {
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        int pop(){
            if (head == null){
                System.out.println("Stack is empty..");
                return -1;
            }
            int x = head.data;      // save the value dont loose it
            head = head.next;
            size--;
            return x;
        }

        void peek(){
            if (head == null){
                System.out.println("Stack is empty..");
            }
            System.out.println(head.data);
        }


        void displayRec(Node h){
            if (h == null) return;
            displayRec(h.next);
            System.out.print(h.data + " ");
        }


        void display(){
            displayRec(head);
            System.out.println();
        }
        void displayRev() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size() { // getter
            return size;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        st.push(6);
        System.out.println();
        st.display();
        System.out.println();
        System.out.println("size: " + st.size());
        st.pop();
        st.display();

        System.out.println();
        st.peek();
    }
}
