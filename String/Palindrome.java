package String;

public class Palindrome {
    public boolean isPalindrome(String s) {
        if (s == null) return false;

        int st = 0, end = s.length() - 1;
        while (st < end) {
            char left = s.charAt(st);
            char right = s.charAt(end);

            if (!isAlphaNum(left)) {
                st++;
                continue;
            }
            if (!isAlphaNum(right)) {
                end--;
                continue;
            }
            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }
            st++;
            end--;
        }
        return true;
    }

    boolean isAlphaNum(char ch) {
        return (ch >= '0' && ch <= '9') ||
               (Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z');
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(obj.isPalindrome("race a car")); // false
        System.out.println(obj.isPalindrome("No lemon, no melon")); // true
    }
}
