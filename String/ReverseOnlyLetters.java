package String;

public class ReverseOnlyLetters {
    public static String reverseLetters(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = s.length() - 1;
        
        while (i < j) {
            if (!Character.isLetter(arr[i])) {
                i++;
            } else if (!Character.isLetter(arr[j])) {
                j--;
            } else {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {        
        String s1 = "ab-cd";
        System.out.println(reverseLetters(s1));  
        
        String s2 = "a-bC-dEf-ghIj";
        System.out.println(reverseLetters(s2));  
        
    }
}
