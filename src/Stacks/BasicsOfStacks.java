package Stacks;

import java.util.Stack;

public class BasicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        /*
        push <-- pushes one element on top of stack
        pop <-- deletes or remove one element from top which has to save anywhere otherwise it is lost
        peek <-- returns top most element of the stack
        size <-- returns size of stack
        isEmpty <-- returns boolean value that stack is empty or not */

        System.out.println(st.isEmpty());
        st.push(1);
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        st.push(3);
        st.push(4);
        st.push(10);

        System.out.println(st);
        System.out.println(st.peek());

        while (st.size() > 1) {     //<-- will remove elements on top until size is greater than 1
            st.pop();
        }
        System.out.println(st);
    }
}
