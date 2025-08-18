package String;

public class StringIsPangram {
    public static boolean isPangram(String sentences){
        int[] arr=new int[26];
        int count=0;
        for(char ch: sentences.toCharArray()){
            int idx=ch-'a';
            if(arr[idx]==0){
            arr[idx]++;
            count++;
            }
        }
        if(count==26)
          return true;
        return false;
    }
    public static void main(String[] args) {
        String str="thequickbrownfoxjumpsoverthelazydog";
        String str1="badboy";
        System.out.println(isPangram(str));
        System.out.println(isPangram(str1));
    }
}
