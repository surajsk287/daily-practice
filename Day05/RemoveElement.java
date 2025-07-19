package Day05;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        return pointer;
    }

    public static void main(String[] args) {
        RemoveElement sol = new RemoveElement();

        int[] nums = {3, 2, 2, 3, 4, 2};
        int val = 2;

        int newLength = sol.removeElement(nums, val);

        System.out.println("New length: " + newLength);
        System.out.print("Updated array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
