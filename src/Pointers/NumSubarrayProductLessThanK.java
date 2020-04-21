package Pointers;

/**
 * Created by edieye on 2020-04-19.
 */
public class NumSubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int start = 0;
        int end = 0;
        int product = 1;
        while (end < nums.length)  {
            product *= nums[end];
            while (start < end && product >= k) {
                product /= nums[start];
                start++;
            }
            count += end - start + 1;
            end++;
        }

        return count;

    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        NumSubarrayProductLessThanK obj = new NumSubarrayProductLessThanK();
        System.out.println(obj.numSubarrayProductLessThanK(nums, k));
    }
}
