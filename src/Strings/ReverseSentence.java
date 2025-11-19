package Strings;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch != ' ') {
                word.append(ch);
            } else {
                result.append(word.reverse());
                result.append(" ");
                word.setLength(0); // reset word
            }
        }

        // reverse and append the last word
        result.append(word.reverse());

        System.out.println(result.toString());
    }
}
