package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class DeleteElementFromStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(9);
        st.push(10);

        System.out.println(st);
        System.out.println("Enter index which element you want to delete: ");
        int n = sc.nextInt();
        Stack<Integer> extst = new Stack<>();

        while (st.size() > n) {
            extst.push(st.pop());
        }
        st.pop();

        while (extst.size() > 0) {
            st.push(extst.pop());
        }

        System.out.println("Your final stack: " + st);


    }
}
