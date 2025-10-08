import java.util.Scanner;

// reverse the given string
// tell if string is palindrome or not
class lec34a {
    static String Reverse(String s, int idx) {
        //Base case
        if (idx == s.length()) return "";
        // recursive case
        String SmallAns = Reverse(s, idx + 1);
        // self work
        return SmallAns + s.charAt(idx);
    }
}

public class ReverseStringRecursively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        lec34a obj = new lec34a();
        System.out.println(obj.Reverse(s, 0));
        // method 1 for checking palindrome
        String rev = obj.Reverse(s,0);
        if (rev.equals(s)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
