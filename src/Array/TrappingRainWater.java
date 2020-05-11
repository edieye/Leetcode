package Array;

/**
 * Created by edieye on 2020-05-10.
 */
public class TrappingRainWater {

    /** 42. Trapping Rain Water **/

    public int trap(int[] height) {
        int water = 0;
        int[] left = new int[height.length];
        int leftMax = 0;
        int rightMax = 0;
        for (int i = height.length - 1; i >= 0 ; i--) {
            left[i] = Math.max(leftMax, height[i]);
        }
        for (int i = 0; i < height.length ; i++) {
            rightMax = Math.max(rightMax, height[i]);
            water += Math.min(leftMax, rightMax) - height[i];
        }
        return water;
    }
}
