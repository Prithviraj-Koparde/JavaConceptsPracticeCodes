package Strings;

import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        String str = "Prithviraj";
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
//        String input = sc.next();               // this will not read after space
//        System.out.println(input);

        String input = "Koparde";
        String input1 = "Prithviraj";          // this will print everything with space too
        System.out.println("input - " + input1 + " input length - " + input1.length() + " CharAt -" + input1.charAt(3)
                + " indexOf -" + input1.indexOf("i"));


//        ComapreTo() - returns +ve number if 1st string is greater than 2nd lexicographically
//                      else -ve number which is difference between their values in alphabhet.

        System.out.println(input1.compareTo(input)); // input1 > input lexocographically - +ve output
        System.out.println(input.compareTo(input1)); // input < input1 lexographically - -ve input

//        contains() - takes input as a string and check if it present in main string and give boolean value
//                        its case sensitive

        System.out.println(input.contains("rit"));  // false
        System.out.println(input.contains("K"));    // true

//        startsWith() && endsWith

        System.out.println(input.startsWith("KOP"));  // false
        System.out.println(input.startsWith("Kop"));  // true

        System.out.println(input.endsWith("De"));  // false
        System.out.println(input.endsWith("de"));  // true

//        toLowerCase() toUpperCase
        System.out.println(input.toLowerCase());
        System.out.println(input.toUpperCase());

//        concat() - we dont use this mostly instead we simply we + two strings
        String ans = input.concat(" " + input1);
        System.out.println(ans);

//        Strings equals() - compare two strings text by text it first check address then goes to content

        String input3 = "Koparde";
        System.out.println(input.equals(input1)); // false
        System.out.println(input.equals(input3)); // true
    }
}
