package LinkedList;


class Node {
    int data;
    Node1 next;

    Node(int data) {
        this.data = data;
    }
}

class lec51 {
    public static void display(Node1 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }


    // Linked List using recursion
    public static void displayRec(Node1 head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        displayRec(head.next);
    }

    // To print ll in reverse
    public static void ReverseLL(Node1 head) {
        if (head == null) return;
        ReverseLL(head.next);
        System.out.print(head.data + " ");
    }

    // To print length of LL
    public static int length(Node1 head) {
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
        Node1 a = new Node1(5);
        Node1 b = new Node1(6);
        Node1 c = new Node1(7);
        Node1 d = new Node1(8);
        Node1 e = new Node1(9);

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
