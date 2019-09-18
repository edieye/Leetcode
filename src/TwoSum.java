import java.util.HashMap;

/**
 * Created by edieye on 2017-06-15.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                return result;
            }
            else {
                map.put(nums[i], i);
            }
        }
        return result;

    }
}
