package String;

public class LongestPalindromicSubstring {
     public static void main(String[] args) {
        String input1 = "babad";
        String input2 = "cbbd";
        String input3 = "a";
        String input4 = "ac";

        System.out.println("Input: " + input1 + " → Longest Palindrome: " + longestPalindrome(input1));
        System.out.println("Input: " + input2 + " → Longest Palindrome: " + longestPalindrome(input2));
        System.out.println("Input: " + input3 + " → Longest Palindrome: " + longestPalindrome(input3));
        System.out.println("Input: " + input4 + " → Longest Palindrome: " + longestPalindrome(input4));
    }
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int start = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i);     
            int len2 = expandFromCenter(s, i, i + 1); 
            int len = Math.max(len1, len2);
            
            if (len > end - start) {
                start = i - (len - 1) / 2;  
                end = i + len / 2;          
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;  
    }
}


    

