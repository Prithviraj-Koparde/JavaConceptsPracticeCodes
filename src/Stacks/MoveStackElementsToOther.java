package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class MoveStackElementsToOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        /*
        int n;
        System.out.println("Enter no. of elements: ");
        n = sc.nextInt();
        System.out.println("Enter Elements: ");
        for (int i = 0; i<n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        */

        st.push(1);
        st.push(4);
        st.push(5);
        st.push(8);
        st.push(9);
        System.out.println("Original stack: " + st);

        // Reverse order insertion of stack into another one

        Stack<Integer> extrast = new Stack<>();
        while (st.size()>0){
            extrast.push(st.pop());
        }
        System.out.println(extrast);

        Stack<Integer> rst = new Stack<>();
        while (extrast.size()>0){
            rst.push(extrast.pop());
        }
        System.out.println(rst);

    }
}
