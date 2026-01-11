package Hashsets;

import java.util.HashSet;

public class HashSetsIntro {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();

        h.add("Jeff");
        h.add("Ronny");
        h.add("Jeff");
        h.add("Arnold");

        System.out.println(h);
        h.remove("Jeff");
        System.out.println(h);

        System.out.println(h.size());
        System.out.println(h.isEmpty());
        // System.out.println(h.hashCode());
        System.out.println(h.contains("Ronny"));
        System.out.println(h.contains("Jeff"));

        // hashset traversal
        for (String s : h) {
            System.out.print(s + " ");
        }
    }
}
