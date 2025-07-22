package Day07;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public static int[] ProductOfArraySelf(int[] nums){

        int n=nums.length;
        int[] ans =new int[n];
        int prodL=1;
        int prodR=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=prodR;
            prodR=prodR*nums[i];
        }
        for (int i = 0; i < n; i++) {
            ans[i]=ans[i]*prodL;
            prodL=prodL*nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        //ProductofArrayExceptSelf obj=new ProductofArrayExceptSelf();
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(ProductOfArraySelf(arr)));
    }
}
