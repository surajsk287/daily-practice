package MaximumSubArray;

public class KadaneAlgorithm {
    public static int maxSubArray(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for (int i = 0; i < arr.length; i++) {
            currSum+=arr[i];
            maxSum=Math.max(maxSum, currSum);
            if(currSum<0)
               currSum=0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
