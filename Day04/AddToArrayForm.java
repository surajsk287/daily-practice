package Day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {
    public List<Integer> addToArray(int[] num, int k){
        List<Integer> result=new ArrayList<>();
        int p=num.length-1;
        int carry=0;
        while(p>=0||k>0){
            int numValue=0;
            if(p>=0){
                numValue=num[p];
            }
            int lastDigit=k%10;
            int sum=numValue+lastDigit+carry;
            int digit=sum%10;
            result.add(digit);
            p--;
            k/=10;
        }
        if(carry>0){
            result.add(carry);
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        AddToArrayForm obj=new AddToArrayForm();
        int[] num={1,2,0,0};
        int k=28;
        List<Integer> result=obj.addToArray(num, k);
        System.out.println("Result : "+result);
    }
}
