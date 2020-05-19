package DynamicProgramming;

/**
 * Created by edieye on 2020-05-18.
 */
/** 198. House Robber **/
public class RobHouse {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], nums[0]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
        return dp[nums.length - 1];
    }
}
