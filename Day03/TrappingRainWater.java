package Day03;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int len = height.length;
        int[] leftMax = new int[len];
        leftMax[0] = height[0];

        for (int i = 1; i < len; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int[] rightMax = new int[len];
        rightMax[len - 1] = height[len - 1];

        for (int i = len - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int ans = 0;
        for (int i = 0; i < len; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trappedWater = trap(height);
        System.out.println("Total trapped water: " + trappedWater);
    }
}
