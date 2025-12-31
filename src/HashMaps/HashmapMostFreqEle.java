package HashMaps;

import java.util.HashMap;

public class HashmapMostFreqEle {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 2, 1, 2, 1, 1, 1};

        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!mp.containsKey(arr[i])) {
                mp.put(arr[i], 1);
            } else {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
        }

        System.out.println(mp.entrySet());

        int maxFreq = 0;
        int ansKey = -1;
        for (var e : mp.entrySet()) {
            if (e.getValue() > maxFreq) {
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.println(" Max frequency key is " + ansKey + " and its repeated " + maxFreq + " times");
    }
}
