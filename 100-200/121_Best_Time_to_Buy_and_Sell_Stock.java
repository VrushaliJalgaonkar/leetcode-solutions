// Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
// Last Practice on : 10-Mar-2025

class Solution {
    public int maxProfit(int[] prices) {

        //Approach 2: One Pass
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
        //TC - O(n), SC - O(1)


        //Approach 1: Brute Force
        // int maxProfit = 0;
        // for(int i=0;i<prices.length - 1; i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         int profit = prices[j] - prices[i];
        //         if(profit > maxProfit){
        //             maxProfit = profit;
        //         }
        //     }
        // }
        // return maxProfit;
        //TC - O(n^2), SC - O(1)
    }
}
