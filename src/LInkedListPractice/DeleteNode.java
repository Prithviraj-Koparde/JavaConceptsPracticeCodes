package LInkedListPractice;

// delete node with node as given parameter
class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
    }
}

class LL {
    node head = null;
    node tail = null;

    // delete given node with node as given parameter
    void deleteNode(node Node) {
        if (Node == null || Node.next == null) {
            throw new IllegalArgumentException("Cannot delete the last node sorry...");
        }
        Node.data = Node.next.data;
        Node.next = Node.next.next;
    }

    // search method for delete method because we need to find that node first and then pass it to delete method cause
    // it demands a node as input not int value
    node search(int val) {
        node temp = head;
        while (temp != null) {
            if (temp.data == val) return temp;
            temp = temp.next;
        }
        return null;
    }

    // method 1 - find nth node from end of list  formula m-n+1th node from start of list
    node findNthNode(node head, int n) {
        node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        int m = size - n + 1;

        for (int i = 1; i <= m - 1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //method - 2 o(n)(single pass)
    node findNthNode2(node head, int n) {
        node slow = head;
        node fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    // remove nth node from list using o(n) one pass
    void removeNthNode(int n) {
        node slow = head;
        node fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
    }

    void sizeOf(){
        node temp = head;
        int size = 0;
        while (temp != null){
            size++;
            temp = temp.next;
        }
    }

    // insertAtEnd
    void insertAtEnd(int val) {
        node temp = new node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    // Display
    void display() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class DeleteNode {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtEnd(100);
        list.insertAtEnd(41);
        list.insertAtEnd(30);
        list.insertAtEnd(4);
        list.insertAtEnd(15);
        list.insertAtEnd(3);

        System.out.print("Original List: ");
        list.display();
        System.out.println();


        System.out.print("One node deleted: ");
        node a = list.search(41);
        list.deleteNode(a);
        list.display();

        System.out.println();
        System.out.print("nth node: ");
        node b = list.search(100);
        node c = list.findNthNode(b, 2);
        System.out.print(c.data);

        System.out.println();
        System.out.print("O(n) one pass method for find nth node from last: ");
        node d = list.search(100);
        node e = list.findNthNode2(d, 2);
        System.out.println(e.data);

        System.out.println();
        System.out.print("Remove nth node from list from last: ");
        list.removeNthNode(3);
        list.display();
    }
}
