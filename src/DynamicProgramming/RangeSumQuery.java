package DynamicProgramming;

/**
 * Created by edieye on 2020-04-27.
 */
public class RangeSumQuery {

    /** 303. Range Sum Query - Immutable **/

    int[] nums;
    public RangeSumQuery(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        this.nums = nums;
    }

    public int sumRange(int i, int j) {
        if (i == 0) return nums[j];
        return nums[j] - nums[i-1];
    }
}
