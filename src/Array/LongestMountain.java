package Array;

/**
 * Created by edieye on 2020-02-18.
 */
public class LongestMountain {

    public static int longestMountain(int[] A) {
        int n = A.length;
        int[] down = new int[n];
        int[] up = new int[n];
        int res = 0;
        for (int i = n - 1; i > 0; i--) {
            if (A[i] < A[i-1]) {
                down[i-1] = down[i] + 1;
            }
        }
        for (int i = 0; i < n -1 ; i++) {
            if (A[i] < A[i+1]) {
                up[i+1] = up[i] + 1;
            }
            if (down[i] > 0 && up[i] > 0) {
                res = Math.max(res, down[i] + up[i] + 1);
            }
        }


        return res;
    }

    public static void main(String[] args) {
        int[] test = {2,1,4,7,3,2,5};
        System.out.println(longestMountain(test));
    }
}
