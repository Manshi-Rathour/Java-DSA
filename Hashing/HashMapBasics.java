package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 50);
        map.put("China", 150);

        System.out.println(map);

        // Searching
        if(map.containsKey("China")){
            System.out.println("Key is present in set");
        }
        else{
            System.out.println("Key is not present in set");
        }

        System.out.println(map.get("India"));     // key exist
        System.out.println(map.get("Japan"));     // key doesn't exist

        // Iteration (1)
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey());
            System.out.print(" -> ");
            System.out.println(e.getValue());
        }

        // Iteration (2)
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " -> " + map.get(key));
        }

        // Remove
        map.remove("China");
        System.out.println(map);
    }
}
