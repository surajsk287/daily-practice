package ClimbingStrais;

public class ClimbingStraises {
    public static int ClimbingS(int n){
        if(n<=2)
            return n;

        int first=1;
        int second=2;
        for (int i = 3; i <= n; i++) {
            int current = first+second;
            first=second;
            second=current;
        }

        return second;
    }
    public static void main(String[] args) {
        int n=4;

        System.out.println(ClimbingS(n));
    }
}
