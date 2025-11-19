package LinkedList;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class lec51 {
    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }


    // Linked List using recursion
    public static void displayRec(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        displayRec(head.next);
    }

    // To print ll in reverse
    public static void ReverseLL(Node head) {
        if (head == null) return;
        ReverseLL(head.next);
        System.out.print(head.data + " ");
    }

    // To print length of LL
    public static int length(Node head){
        int count = 0;
        while (head == null) {
            count++;
            System.out.println(head.data);
        }
        return count;
    }
}

public class ToLinkNodesAndPrintThem {
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(6);
        Node c = new Node(7);
        Node d = new Node(8);
        Node e = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        lec51.display(a);
        System.out.println();
        lec51.displayRec(a);
        System.out.println();
        lec51.ReverseLL(a);
        System.out.println();
        lec51.length(a);
    }
}
