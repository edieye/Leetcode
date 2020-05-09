package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edieye on 2020-05-09.
 */

/** 448. Find All Numbers Disappeared in an Array **/

public class NumbersDisappeared {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {

                nums[val] = -nums[val];
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] > 0) ret.add(j + 1);
        }
        return ret;
    }
}
