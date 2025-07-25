package MaximumSubArray;

public class BruteForceApproach {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        for(int st=0;st<n;st++){
            int currSum=0;
            for(int end=0; end<n; end++){
                currSum+=arr[end];
                maxSum=Math.max(maxSum,currSum);
            }
        }
        System.out.println(maxSum);
    }
}
