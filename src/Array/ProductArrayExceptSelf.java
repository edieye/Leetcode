package Array;

/**
 * Created by edieye on 2020-02-16.
 */
public class ProductArrayExceptSelf {

    // 238. Product of Array Except Self

    public static int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        right[nums.length-1] = 1;
        int tmp = 1;
        for (int i = 0; i < left.length - 1; i++) {
            tmp = tmp * nums[i];
            //System.out.println(tmp);
            left[i + 1] = tmp;
        }
        tmp = 1;
        for (int j = nums.length - 1; j > 0 ; j--) {
            tmp = tmp * nums[j];  // {1,2,3,4}  -> {     6, 6 3,1
            System.out.println(tmp);
            right[j - 1] = tmp;
        }

        int[] result = new int[nums.length];
        for (int k = 0; k < nums.length; k++) {
            result[k] = left[k] * right[k];
        }
        return result;
    }

    public static void main (String[] args) {
        int[] test = {1,2,3,4};
        int[] res =  productExceptSelf(test);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
