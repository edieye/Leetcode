package Array;

/**
 * Created by edieye on 2020-02-25.
 */

/** 122. Best Time to Buy and Sell Stock II **/

public class MaxProfitI {

    public static int maxProfit(int[] prices) {
        int totalProfit = 0, buy = 0, sell = 0, i = 0, N = prices.length -1;
        while (i < N) {
            while (prices[i] >= prices[i+1] && i < N) {
                i++;
            }
            buy = prices[i];
            while (prices[i] < prices[i+1] && i < N) {
                i++;
            }
            sell = prices[i];
            totalProfit += sell - buy ;
        }
        return totalProfit;


    }

}
