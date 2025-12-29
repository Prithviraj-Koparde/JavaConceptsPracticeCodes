package Stacks;

import java.util.Stack;

public class StackInfix {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) val.push(ascii - 48);
            else if (operator.size() == 0) operator.push(ch);
            else {
                if (ch == '-' || ch == '+') {
                    int val2 = val.pop();
                    int val1 = val.pop();

                    // working
                    if (operator.peek() == '-') val.push(val1 - val2);
                    if (operator.peek() == '+') val.push(val1 + val2);
                    if (operator.peek() == '*') val.push(val1 * val2);
                    if (operator.peek() == '/') val.push(val1 / val2);
                    operator.pop();

                    operator.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (operator.peek() == '*' || operator.peek() == '/') {
                        int val2 = val.pop();
                        int val1 = val.pop();

                        if (operator.peek() == '/') val.push(val1 / val2);
                        if (operator.peek() == '*') val.push(val1 * val2);

                        operator.pop();
                        operator.push(ch);
                    } else operator.push(ch);
                }
            }
        }

        // val stack size ->1
        while (val.size() > 1) {
            int val2 = val.pop();
            int val1 = val.pop();

            if (operator.peek() == '-') val.push(val1 - val2);
            if (operator.peek() == '+') val.push(val1 + val2);
            if (operator.peek() == '*') val.push(val1 * val2);
            if (operator.peek() == '/') val.push(val1 / val2);
            operator.pop();
        }
        System.out.println(val.peek());
    }
}
