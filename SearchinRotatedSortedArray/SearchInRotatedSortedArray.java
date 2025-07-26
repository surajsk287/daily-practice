package SearchinRotatedSortedArray;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int st=0,end=nums.length-1;
        while(st<=end){
            int mid = st+(end-st)/2;
            if(nums[mid]==target)
               return mid;
            if(nums[st]<=nums[mid]){
                if(nums[st] <= target && target<nums[mid])
                   end=mid-1;
                else
                   st=mid+1;
            }else{
                if(nums[mid]<target && target<=nums[end])
                   st=mid+1;
                else
                   end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       SearchInRotatedSortedArray obj=new SearchInRotatedSortedArray();
       int[] arr={4,5,6,7,0,1,2};
       int targ=0;
       System.out.println(obj.search(arr, targ)); 
    }
}
