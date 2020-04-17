package Array;

/**
 * Created by edieye on 2020-04-16.
 */

/* 643. Maximum Average Subarray I */

public class FindMaxAverage {


    public double findMaxAverage(int[] nums, int k) {
        double curr = 0;
        double max = 0;
        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }
        max = curr;
        for (int i = k; i < nums.length; i++) {
            curr += nums[i] - nums[i-k];
            max = Math.max(curr, max);

        }
        return max / k;
    }

    public static void main(String[] args) {
        FindMaxAverage obj = new FindMaxAverage();
        int[] test = {1,12,-5,-6, 50,3};
        int[] test1 = {5};
        System.out.println(obj.findMaxAverage(test, 4));
        System.out.println(obj.findMaxAverage(test1, 1));


    }
}
