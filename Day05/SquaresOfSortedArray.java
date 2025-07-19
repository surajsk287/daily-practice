package Day05;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static int[] sortedArray(int[] nums){
        int[] result=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int poniter=result.length-1;
        while (left<=right) {
            int leftSquare=nums[left]*nums[left];
            int rightSquare=nums[right]*nums[right];

            if(leftSquare>rightSquare){
                result[poniter]=leftSquare;
                left++;
            }else{
                result[poniter]=rightSquare;
                right--;
            }
            poniter--;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={-7,-4,0,2,4};
        System.out.println(Arrays.toString(sortedArray(arr)));
    }
}
