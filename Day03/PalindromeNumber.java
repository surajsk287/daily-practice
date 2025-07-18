package Day03;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = x;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        if (rev == x)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        PalindromeNumber obj = new PalindromeNumber();

        int num1 = 121;
        int num2 = -121;
        int num3 = 12321;
        int num4 = 123;

        System.out.println(num1 + " is palindrome : " + obj.isPalindrome(num1)); 
        System.out.println(num2 + " is palindrome : " + obj.isPalindrome(num2)); 
        System.out.println(num3 + " is palindrome : " + obj.isPalindrome(num3)); 
        System.out.println(num4 + " is palindrome : " + obj.isPalindrome(num4)); 
    }
}
