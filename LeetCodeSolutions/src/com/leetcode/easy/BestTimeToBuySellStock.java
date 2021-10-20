package com.leetcode.easy;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuySellStock {
	
	public static int maxProfit(int[] prices) {
		
		if(prices.length == 0 || prices == null)
            return 0;
        
        
        int minSoFar = prices[0];
        int maxProfit = 0;
        
        for(int i = 1; i < prices.length; i++){
            
            //min check - if the current price on this ith day is smaller than minSoFar/
        	// make minSoFar that day's value
            if(prices[i] < minSoFar)
                minSoFar = prices[i];
            
            // maxProfit check, prices[i] represents sell day, and minSoFar represents buy day
            // if the difference between the sell and buy day is > than current maxProfit
            // make that the new maxProfit
            if(prices[i] - minSoFar > maxProfit){
                maxProfit = prices[i] - minSoFar;
            }
        }
        
        // at the end return the maxProfit for this prices list
        return maxProfit;
	}

	public static void main(String[] args) {
		
		int[] prices = {7,1,5,3,6,4};
		
		
		System.out.println("max profit: " + maxProfit(prices));

	}

}
