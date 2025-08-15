package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubString {
     public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1; // Move left pointer
            }

            map.put(c, right); // Update last seen position
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {

        int result = lengthOfLongestSubstring("abcabcbb");
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
}
