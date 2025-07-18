package Day02;

import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        for (int freq : map.values()) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }

        int count = 0;
        for (int freq : map.values()) {
            if (freq == maxFreq) {
                count += freq;
            }
        }

        return count;
    }

    public static void main(String[] args) {
    	CountElementsWithMaximumFrequency ans = new CountElementsWithMaximumFrequency();

        int[] nums = {1, 2, 2, 3, 1, 4, 5, 5, 5, 2}; 
        int result = ans.maxFrequencyElements(nums);

        System.out.println("Sum of elements with max frequency: " + result);
    }

}
