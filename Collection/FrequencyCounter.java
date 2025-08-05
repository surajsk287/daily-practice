package Collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Suraj","Kumar","Suraj","Kumar");
        Map<String, Integer> map=new HashMap<>();

        // List<Integer> list=Arrays.asList(1,2,3,2,1);
        // Map<Integer, Integer> map=new HashMap<>();
        for (String item : list) {
            map.put(item, map.getOrDefault(item, 0)+1);
        }
        System.out.println(map);
    }
}
