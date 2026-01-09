package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseKEleQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int k_times = k % q.size();

        for (int i = 0; i < k_times; i++) {
            s.push(q.remove());
        }

        System.out.println(s);
        System.out.println(q);

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        System.out.println(q);

        for (int i = 0; i < q.size() - k_times; i++) {
            int num = q.remove();
            q.add(num);
        }
        System.out.println(q);
    }
}
