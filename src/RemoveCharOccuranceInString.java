import java.util.Scanner;

// remove all occurance of a in string "abcax"
class lec34 {
    //Method 1
    static String DeleteChar(String s, int idx) {
        //Base case
        if (idx == s.length()) return "";
        // recursive case
        String SmallAns = DeleteChar(s, idx + 1);
        char currentChar = s.charAt(idx);
        // self work
        if (currentChar != 'a') {
            return currentChar + SmallAns;
        } else {
            return SmallAns;
        }
    }
}

public class RemoveCharOccuranceInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lec34 obj = new lec34();
        String s = sc.nextLine();
        System.out.println(obj.DeleteChar(s, 0));
    }
}
