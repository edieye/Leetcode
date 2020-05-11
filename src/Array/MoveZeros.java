package Array;

/**
 * Created by edieye on 2020-05-10.
 */
public class MoveZeros {

    /** 283. Move Zeroes **/
    public void moveZeroes(int[] nums) {
        int zeroPointer = 0;
        int fastPointer = 0;

        while (nums[fastPointer] != 0 && fastPointer < nums.length -1) {
            zeroPointer++;
            fastPointer++;
        }
        while (fastPointer < nums.length -1) {
            while (nums[fastPointer] == 0 && fastPointer < nums.length -1) {
                fastPointer++;
            }
            int tmp = nums[fastPointer];
            nums[fastPointer] = nums[zeroPointer];
            nums[zeroPointer] = tmp;
            zeroPointer++;
        }

    }
}

