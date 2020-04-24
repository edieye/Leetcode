package DynamicProgramming;

/**
 * Created by edieye on 2020-04-23.
 */
public class MinimumFallingPathSum {

    /** 931. Minimum Falling Path Sum **/

    public int minFallingPathSum(int[][] A) {
        for (int i = 1; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (j == 0) A[i][j] += Math.min(A[i-1][j], A[i-1][j+1]);
                else if (j == A[0].length - 1) A[i][j] += Math.min(A[i-1][j-1], A[i-1][j]);
                else A[i][j] += Math.min(A[i-1][j], Math.min(A[i-1][j-1], A[i-1][j+1]));
            }
        }
        int min = A[A.length - 1][0];
        for (int j = 1; j < A[0].length; j++) {
            min = Math.min(A[A.length -1][j], min);
        }
        return min;
    }

    public static void main(String[] args) {
        int[][] test = {{1,2,3},{4,5,6},{7,8,9}};
        MinimumFallingPathSum obj = new MinimumFallingPathSum();
        System.out.println(obj.minFallingPathSum(test));
    }
}
