import java.util.ArrayList;

// print all subsequences of string "abc" in arraylist order doesn't matter for example output ="abc" "ab" "ac" "a" "bc" "b" "c" " "
// print all subsequences of given string not only abc
class lec35 {
    static ArrayList<String> SSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();
        //base case
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }
        //recursive case
        ArrayList<String> smallAns = SSQ(s.substring(1));
        char currChar = s.charAt(0);
        //self work
        for (String ss : smallAns) {
            ans.add(ss);
            ans.add(currChar + ss);
        }
        return ans;
    }

    public void SSQ1(String s, String currAns) {
        // base case
        if (s.length() == 0) {
            System.out.println(currAns);
            return;
        }
        char currChar = s.charAt(0);
        // self work and recursive case
        String remString = s.substring(1);
        SSQ1(remString, currAns + currChar); // include currChar
        SSQ1(remString, currAns); // exclude currChar
    }
}

public class PrintStringSubsequencesRec {
    public static void main(String[] args) {
        lec35 obj = new lec35();
        ArrayList<String> ans = obj.SSQ("abc");
        for (String ss : ans) {
            System.out.println(ss);
        }

        System.out.println("+++++++++");
        String ans1 = "abcd";
        obj.SSQ1(ans1, "");
    }
}
