package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class PrintAllEleInQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> p = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            p.add(q.remove());
        }

        while (!p.isEmpty()) {
            q.add(p.remove());
        }
    }
}
