package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class InsertionInStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no. of elements: ");
        n = sc.nextInt();

        System.out.println("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println("Entered Stack Data: " + st);

        Stack<Integer> extst = new Stack<>();
        System.out.println("Enter index at which you want to insert element: ");
        int x = sc.nextInt();


        while (st.size() > x) {
            extst.push(st.pop());
        }

        System.out.println("Enter your element: ");
        int inp = sc.nextInt();
        st.push(inp);

        while (extst.size() > 0) {
            st.push(extst.pop());
        }

        System.out.println("Final stack is: " + st);
    }
}
