package String;

public class reverseString {
    public void reverseString(char[] s) {
        int st = 0;
        int end = s.length - 1;

        while (st < end) {
            char temp = s[st];
            s[st] = s[end];
            s[end] = temp;
            st++;
            end--;
        }
    }

    public static void main(String[] args) {
        reverseString obj = new reverseString();
        char[] arr = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("Before: " + new String(arr));
        obj.reverseString(arr);
        System.out.println("After: " + new String(arr));
    }
}
