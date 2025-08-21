package String;

public class PrintEvenWord {
    public static void main(String[] args) {
        String str="Sky is blue and vast";
        String[] wprd=str.split(" ");
        for (String currWord : wprd) {
            if(currWord.length()%2==0)
              System.out.println(currWord);
        }
    }
}
