package Stacks;

import javax.xml.transform.Source;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> mst = new Stack<>();
        Stack<Integer> extst = new Stack<>();

        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(1);
        st.push(10);
        System.out.println(st);

        System.out.println("Reversing stack...");
        while (st.size() > 0) {
            mst.push(st.pop());
        }

        while (mst.size() > 0) {
            extst.push(mst.pop());
        }

        while (extst.size() > 0) {
            st.push(extst.pop());
        }

        System.out.println("Reversed stack: " + st);
    }
}
