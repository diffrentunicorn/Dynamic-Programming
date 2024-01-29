/*
    121
    You are given an array prices where prices[i] is the price of a given stock on the ith day.

    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

    Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

 */

class Solution {
  public int maxProfit(int[] prices) {
    if (prices == null || prices.length <= 1) {
        return 0; // No profit can be made with less than 2 prices
    }
    
    int[] aux = new int[prices.length];
    aux[prices.length - 1] = prices[prices.length - 1];
    // Populate the aux array with the maximum price from i to the end
    for (int i = prices.length - 2; i >= 0; i--) {
        aux[i] = Math.max(prices[i], aux[i + 1]);
    }
    
    int maxProfit = 0;
    // Calculate the maximum profit
    for (int i = 0; i < prices.length; i++) {
        maxProfit = Math.max(maxProfit, aux[i] - prices[i]);
    }
    
    return maxProfit;
}

}

public class BestTimeToBuyAndSellStockBruteFroceOptimized {
    public static void main(String[] args) {
        
    }
    
}
