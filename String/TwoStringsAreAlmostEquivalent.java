package String;

public class TwoStringsAreAlmostEquivalent {
    public static boolean equivalent(String w1, String w2){
        int len=w1.length();
        int[] freq=new int[26];
        for(int i=0;i<len;i++){
            freq[w1.charAt(i)-'a']++;
            freq[w2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(Math.abs(freq[i])>3)
              return false;
        }
        return true;
    }
    public static void main(String[] args) {
        //String w1 = "abcdeef", w2 = "abaaacc";
        String w1="aaaa",w2="bccb";
        System.out.println(equivalent(w1, w2));
    }
}
