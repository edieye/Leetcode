package Array;

/**
 * Created by edieye on 2020-05-09.
 */
public class ContainerMostWater {

    /** 11. Container With Most Water **/

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while (left < right) {
            int lowest =  Math.min(height[right], height[left]);
            max = Math.max(max, lowest * right - left);
            if (height[right] > height[left]) left--;
            else right--;
        }
        return max;

    }
}
