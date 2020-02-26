package Array;

/**
 * Created by edieye on 2020-02-24.
 */

/** 121. Best Time to Buy and Sell Stock **/

public class MaxProfit {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuy = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minBuy = Math.min(prices[i], minBuy);
            maxProfit = Math.max(maxProfit, prices[i] - minBuy);
        }
        if (maxProfit < 0) return 0;
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] input = {7,1,5,3,6,4};
        int[] input1 = {7,6,4,3,1};
        System.out.println(maxProfit(input));
        System.out.println(maxProfit(input1));
    }

}

