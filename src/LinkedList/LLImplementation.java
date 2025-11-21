package LinkedList;
// 1. Print the length of LL

import java.util.LinkedList;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {this.data = data;}
}

class lec51a {
    public static void display(Node1 head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static int length(Node1 head){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}

class Linkedlist{
    Node1 head = null;
    Node1 tail = null;

    void insertAtEnd(int val){
        Node1 temp = new Node1(val);
        if (head == null){
            head = temp;
        }
        else {
            tail.next = temp;
        }
        tail = temp;
    }

    void insertAtStart(int val){
        Node1 temp = new Node1(val);
        if (head == null){  // empty list
            head = tail = temp;
//            or
//            insertAtEnd(val);
        }
        else {      // non empty list
            temp.next = head;
            head = temp;
        }
    }

    void insertAt(int idx, int val){
        Node1 t = new Node1(val);
        Node1 temp = head;
        for(int i = 0; i<=idx-1; i++){
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;

    }

    void Display(){
        Node1 temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    int sizeOf(){
        int count = 0;
        Node1 temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class LLImplementation {
    public static void main(String[] args) {

        Linkedlist LL = new Linkedlist();

        LL.insertAtStart(10);
        LL.insertAtEnd(4);
        LL.insertAtEnd(5);
        LL.insertAtEnd(6);
        LL.insertAtEnd(7);

//        lec51a.display();
//        System.out.println();
//        System.out.println("Length of LL: " + lec51a.length(a));

        LL.Display();
        System.out.println();
        System.out.println(LL.sizeOf());
        LL.insertAtStart(8);
        LL.Display();

        System.out.println();
        LL.insertAt(3,-5);
        LL.Display();



    }
}
