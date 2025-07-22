package Day07;

import java.util.HashMap;
import java.util.Map;

public class longestSubarrayWith0Sum {
    public static int maxLength(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0,maxLen=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];

            if(sum==0){
                maxLen=i+1;
            }

            if(map.containsKey(sum)){
                maxLen=Math.max(maxLen, i-map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr={15,-2,2,-8,1,7,10,23};
        System.out.println(maxLength(arr));
    }
}
