package Hashsets;
import java.util.HashSet;

public class LongestConsecutiveSubArray {
    public static int LongestConsecutive(int [] nums){
        HashSet<Integer> st = new HashSet<>();

        for (int num : nums){
            st.add(num);
        }

        int maxStreak = 0;
        for(int num : st){
            if (!st.contains(num - 1)){
                int currNum = num;
                int currStreak = 1;
                while (st.contains(currNum + 1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;
    }
}
