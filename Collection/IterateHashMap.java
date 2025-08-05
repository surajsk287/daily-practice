package Collection;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args) {
        // Step 1: Create and add elements to HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 2);
        map.put("Banana", 5);
        map.put("Orange", 3);

        System.out.println("---- Using entrySet() ----");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\n---- Using keySet() ----");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        System.out.println("\n---- Using values() ----");
        for (Integer value : map.values()) {
            System.out.println("Value: " + value);
        }
    }
}
