import java.util.ArrayList;

// print all subsequences of string "abc" in arraylist order doesn't matter for example output ="abc" "ab" "ac" "a" "bc" "b" "c" " "
// print all subsequences of given string not only abc
// return all possible subsets of given integer array and print their sum too order doesnt matter example : [2,3,4]  output ->> [0,2,3,4,5,6,7,9]
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

    static void NumSubsetAndSum(int[] arr, int arrLen, int idx, int currSum) {
        // Base case
        if (idx >= arrLen) {
            System.out.println(currSum);
            return;
        }
        // adding current idx + currSum
        NumSubsetAndSum(arr, arrLen, idx + 1, currSum + arr[idx]);        // including arr[idx]
        // currAns
        NumSubsetAndSum(arr, arrLen, idx + 1, currSum);       // excluding arr[idx]
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

        int[] arr = {2, 4, 5};
        obj.NumSubsetAndSum(arr, arr.length, 0, 0);
    }
}
