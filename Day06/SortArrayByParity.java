package Day06;

import java.util.Arrays;

public class SortArrayByParity {
    public int[] moveEvenAtStart(int[] nums){
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                index++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        SortArrayByParity obj=new SortArrayByParity();
        int[] arr = {3, 1, 2, 4, 7, 6};
        obj.moveEvenAtStart(arr);
        System.out.println(Arrays.toString(arr));
    }
}
