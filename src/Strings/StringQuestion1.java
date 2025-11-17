package Strings;

import java.util.Scanner;

// convert uppercase in string to lower and lower to upper
// ex- HelLo - hELlO
public class StringQuestion1 {
    public static void main(String[] args) {
//        StringBuilder s = new StringBuilder("HeLlO");
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.nextLine());
        System.out.println(s);

        for (int i = 0; i < s.length(); i++) {
            // p -> P
            // Check character is small or large
            char ch = s.charAt(i);
            int asci = (int) ch;
            boolean flag = true;

            if (ch == ' ') continue;    // this condition is for ignoring space between two strings otherwise it will print @ between them
            if (asci >= 97) flag = false;

            if (flag == true) { // capital
                asci += 32;
                char dh = (char) asci;

                s.setCharAt(i, dh);
            } else {              // small
                asci -= 32;
                char dh = (char) asci;

                s.setCharAt(i, dh);
            }
        }
        System.out.println(s);
    }
}
