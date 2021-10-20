package com.leetcode.easy;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-subarray/
public class MaximumSubarray {
	
	public static int maxSubArray(int[] nums) {
		
		int currentSum = nums[0]; // will hold the current sum after adding the next element's value
		int maxSum = nums[0]; // will hold the max sum
		
		// loop through elements, 
		// currentSum will check if adding nums[i] to the currentSum will 
		// increase or decrease the sum
		// after currentSum is calculated for that iteration,
		// maxSum will check with the original maxSum and currentSum, if currentSum is greater
		// it will become the new maxSum
		for(int i = 1; i < nums.length; i++) {
			currentSum = Math.max(currentSum + nums[i], nums[i]);
			maxSum = Math.max(currentSum, maxSum);
		}
		
		return maxSum;
	}
	
	
	

	public static void main(String[] args) {
		
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println("Nums array:" + Arrays.toString(nums));
		
		System.out.println("maxium sum of subarray: " + maxSubArray(nums));

	}

	

}
