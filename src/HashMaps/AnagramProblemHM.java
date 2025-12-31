package HashMaps;

import java.util.HashMap;

public class AnagramProblemHM {


    static HashMap<Character, Integer> makeFreqMap(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i <= str.length(); i++) {
            Character currChar = str.charAt(i);
            if (!mp.containsKey(currChar)) {
                mp.put(currChar, 1);
            } else {
                mp.put(currChar, mp.get(currChar) + 1);
            }
        }
        return mp;
    }

    //1st approach
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> mp = makeFreqMap(s);
        HashMap<Character, Integer> mp2 = makeFreqMap(t);
        return mp.equals(mp2);
    }


    //2nd approach space optimized
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> mp = makeFreqMap(s);
        for (int i = 0; i<=t.length(); i++){
            Character ch = t.charAt(i);
            if (!mp.containsKey(ch)) return false;
            else mp.put(ch,mp.get(ch)-1);
        }

        for (var e : mp.values()){
            if (e==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
