package Day08;

public class LargestNumberAtLeastTwiceOfOthers {
    public static int largeNumOfTwice(int[] nums){
        int largest=-1;
        int sLargest=-1;
        int maxInd=0;
        for (int i = 0; i < nums.length; i++) {
            if(largest<nums[i]){
                sLargest=largest;
                largest=nums[i];
                maxInd=i;
            }else if(sLargest<nums[i]){
                sLargest=nums[i];
            }
        }
        if(sLargest*2<=largest)
           return maxInd;
        else
           return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,6,1,0};
        System.out.println(largeNumOfTwice(arr));
    }
}
