package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapsIntro {
    static void HashMapMethods() {
        //Syntax
        Map<String, Integer> mb = new HashMap<>();

        //Adding elements to HashMap
        mb.put("Akash", 25);
        mb.put("Priya", 22);
        mb.put("Devan", 12);
        mb.put("Priyesh", 23);

        //Getting value of a key from the hashmap
        System.out.println(mb.get("Akash"));

        for (String key : mb.keySet()) {
            System.out.println(mb.get(key));
        }

        //Changing the value of a key from hashmap
        mb.put("Akash", 11); // will update akash which already exist
        System.out.println("Akash updated" + mb.get("Akash"));

        //Removing a pair from the hashmap
        System.out.println(mb.remove("Akash")); // returns null if key doesnt exist in hashmap to remove and simply removes the key if present
        System.out.println("Akash deleted" + mb.entrySet());

        //Check if key or value is present in hashmap
        System.out.println(mb.containsKey("Akash")); // containsKey return boolean value
        System.out.println(mb.containsValue(22));   // containsValue return boolean too

        //Adding a new entry only if the new key doesnt exist in hashmap
        // 1 way
        if (!mb.containsKey("Rajni"))
            mb.put("Rajni", 19);

        System.out.println(mb.entrySet());

        //2nd way
        mb.putIfAbsent("Agastya", 28);
        System.out.println("Agastya entered" + mb.get("Agastya"));

        //Get all keys in hashmap
        System.out.println("keySet" + mb.keySet());

        //Get all values in hashmap
        System.out.println("Values" + mb.values());

        //Get all entries in hashmap
        System.out.println("Entries" + mb.entrySet());

        // traverse the hashmap

        for (String key : mb.keySet()) {
            System.out.println("Age of " + key + "is" + mb.get(key));
        }

        for (var key : mb.entrySet()) {
            System.out.println(key.getKey() + " " + key.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapMethods();
    }
}
