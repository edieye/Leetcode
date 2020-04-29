package DynamicProgramming;

/**
 * Created by edieye on 2020-04-28.
 */
public class UniqueBinarySearchTrees {

    // 96. Unique Binary Search Trees

    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[i-j] * dp[j-1];
            }
        }
        return dp[n];
    }

    /** Explanation for future use:
     *  dp[n] is the number of possible trees from level n
     *  An empty tree has 1 possible combination
     *
     *  A tree with 1 node has 1 possible combination
     *
     *  A tree with 2 nodes has 2 possible combinations
     *    1              2       OR          1                   2
     *      2         1                dp[0]  dp[1]         dp[1]  dp[0]
     *
     *  A tree with 3 nodes has 5 possible combinations
     *         1                      2                         3
     *   dp[0]  dp[2]           dp[1]   dp[1]             dp[2]  dp[0]
     *
     *  A tree with 4 nodes has 14 combinations
     *        1                    2                 3                4
     *  dp[0]   dp[3]        dp[1]  dp[2]      dp[2] dp[1]       dp[3] dp[0]
     */
}
