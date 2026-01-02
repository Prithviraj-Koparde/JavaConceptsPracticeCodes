package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class BasicSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.remove();             // remove 1st element which is 1
        System.out.println(q);
        q.poll();               // works same as remove
        System.out.println(q);
        System.out.println(q.element());  //it also works with q.peek // returns 1st element of queue
        System.out.println(q.peek());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
}
