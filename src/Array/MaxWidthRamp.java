package Array;

/**
 * Created by edieye on 2020-05-17.
 */

/** 962. Maximum Width Ramp **/
public class MaxWidthRamp
{

    public int maxWidthRamp(int[] A) {
        int[] maxWidthRight = new int[A.length];
        int max = 0;
        int ret = 0;
        for (int i = A.length - 2; i >= 0; i--) {
            maxWidthRight[i] = Math.max(max, A[i]);
        }
        int i = 0;
        int j = 0;
        while (j < A.length) {
            while (i < j && A[i] > maxWidthRight[j]) {
                i++;
            }
            ret = Math.max(j-i, ret);
            j++;
        }
        return ret;

    }
}
