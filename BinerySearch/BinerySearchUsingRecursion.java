package BinerySearch;

public class BinerySearchUsingRecursion {
    public static int search(int[] nums, int target, int st, int end){
        if(st<=end){
            int mid=st+(end-st)/2;
            if(target>nums[mid])
              return search(nums, target, mid+1, end);
            else if(target < nums[mid])
              return search(nums, target, st, mid-1);
            else
              return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int result = search(nums, target, 0, nums.length - 1);

        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found.");
        }
    }
}
