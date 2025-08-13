package String;

public class StringCompression {
    public static int stringCompress(char[] chars){
        int index=0,i=0;
        while (index<chars.length) {
            char currentChar=chars[index];
            int count=0;

            while(index<chars.length&&chars[index]==currentChar){
                index++;
                count++;
            }
            chars[i]=currentChar;
            i++;
            if(count>1){
                for(char ch : String.valueOf(count).toCharArray()){
                    chars[i]=ch;
                    i++;
                }
            }

        }

        return i;
    }
    public static void main(String[] args) {
        char[] arr = {'a','a','b','b','c','c','c'};
        int len = stringCompress(arr);
        System.out.println("Length: " + len);
        System.out.println("Compressed: " + new String(arr, 0, len));
    }
}
