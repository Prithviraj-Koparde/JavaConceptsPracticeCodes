package Queue;

public class LLImplementationOfQueue {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class quequeLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.val;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty!");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public boolean isEmpty() {
            if (size == 0) return true;
            return false;
        }
    }

    public static void main(String[] args) {
        quequeLL q = new quequeLL();

        q.display();
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.display();
        System.out.println("removed" + " " + q.remove());
        q.display();
        System.out.println("peeked" + " " + q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size);
    }
}
