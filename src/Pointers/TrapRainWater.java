package Pointers;

/**
 * Created by edieye on 2019-11-02.
 */
public class TrapRainWater {

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (leftMax < rightMax) {
                total += Math.min(leftMax,rightMax) - height[left];
                left++;
            }
            else {
                total += Math.min(leftMax,rightMax) - height[right];
                right--;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        TrapRainWater obj = new TrapRainWater();
        System.out.println(obj.trap(arr));

    }
}
