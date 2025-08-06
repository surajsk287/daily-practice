package BinerySearch;

public class SingleElementInaSortedArray {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];

        int st = 0, end = n - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (mid == 0 && nums[0] != nums[1])
                return nums[mid];
            if (mid == n - 1 && nums[n - 1] != nums[n - 2])
                return nums[mid];
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) ||
                    (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SingleElementInaSortedArray sol = new SingleElementInaSortedArray();

        int[] nums1 = { 1, 1, 2, 2, 3, 3, 4, 5, 5 };
        int[] nums2 = { 3, 3, 7, 7, 10, 11, 11 }; 
        int[] nums3 = { 1 }; 
        int[] nums4 = { 1, 1, 2 }; 

        System.out.println("Unique in nums1: " + sol.singleNonDuplicate(nums1));
        System.out.println("Unique in nums2: " + sol.singleNonDuplicate(nums2));
        System.out.println("Unique in nums3: " + sol.singleNonDuplicate(nums3));
        System.out.println("Unique in nums4: " + sol.singleNonDuplicate(nums4));
    }

}
