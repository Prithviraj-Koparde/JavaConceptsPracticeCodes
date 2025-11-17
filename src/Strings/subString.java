package Strings;

public class subString {
    public static void main(String[] args) {
        String s = "Prithviraj";

        System.out.println(s.substring(1));  // will print all after index 1
        System.out.println(s.substring(0, 3));           // will print from 0 to 2 , 3 is excluded


        for (int i = 2; i < 4; i++) {
            System.out.println("From " + i + " th index");
            System.out.println(s.substring(i));

        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }
}
