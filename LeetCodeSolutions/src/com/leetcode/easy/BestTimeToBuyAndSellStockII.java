package com.leetcode.easy;

import java.util.Arrays;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
public class BestTimeToBuyAndSellStockII {

	public static int maxProfit(int[] prices) {
		
		// if prices is null or 0, then no profit because we can't buy or sell a stock
		if(prices == null || prices.length == 0)
			return 0;
		
		
		int profit = 0;
		
		// loop through prices array
		for(int i = 1; i < prices.length; i++) {
			
			// check if current prices is greater than previous price
			// meaning, we buy on previous day, and sell on current day
			// and add onto the profit
			// and we continue to do this for every day where a transaction is possible
			if(prices[i] > prices[i-1])
				profit += prices[i] - prices[i-1];
		}
		
		return profit;
	}
	
	
	
	public static void main(String[] args) {
		
		// test cases
		int[] prices = {7,1,5,3,6,4};
		int[] prices2 = {1,2,3,4,5};
		int[] prices3 = {7,6,4,3,1};
		
		// execution
		System.out.println("prices array:" + Arrays.toString(prices));
		System.out.println("profit for this stock: " + maxProfit(prices));
		
		System.out.println();
		System.out.println("prices array:" + Arrays.toString(prices2));
		System.out.println("profit for this stock: " + maxProfit(prices2));
		
		System.out.println();
		System.out.println("prices array:" + Arrays.toString(prices3));
		System.out.println("profit for this stock: " + maxProfit(prices3));

	}

}
