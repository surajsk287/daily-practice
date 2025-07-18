package Day03;

public class PalindromeString {
    public static boolean isPalind(String str){
        int left=0;
        int right=str.length()-1;
        String st="";
        while (left<right) {
            if(str.charAt(left)!= str.charAt(right))
               return false;
        left++;
        right--;
        }
       
        return true;
    }
    public static void main(String[] args) {
        String str="madam";
        System.out.println(isPalind(str));
    }
}
