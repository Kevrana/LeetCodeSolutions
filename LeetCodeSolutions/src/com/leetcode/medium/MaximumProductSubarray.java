package com.leetcode.medium;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-product-subarray/
public class MaximumProductSubarray {
	
	public static int maxProduct(int[] nums) {
		
		if(nums.length == 0) {
			return 0;
		}
		
		int currMax = nums[0]; // keeps track of current subarray's Maximum product
		int currMin = nums[0]; // keeps track of current subarray's Minimum product
		int result = nums[0]; // use to keep track of the max product for the Array so far
		
		
		// traverse array starting at index 1
		for(int i = 1; i < nums.length; i++) {
			
			// keeps value of old max to be used in currMin's calculation
			int tempMax = currMax;
			
			// checks which value is largest:
			// 1) current item * current max 
			// 2) current item * current min
			// 3) current item 
			currMax = Math.max( Math.max( nums[i] * currMax, nums[i] * currMin ), nums[i] );
			
			// checks which value is smallest:
			// 1) current item * temp max (value of CurrentMax before the calculation above) 
			// 2) current item * current min
			// 3) current item 
			currMin = Math.min( Math.min( nums[i] * tempMax, nums[i] * currMin ), nums[i] );
			
			// if current max is > than previous result, replace
			result = Math.max(currMax, result);
		}
	
		return result;
	}
	
	

	public static void main(String[] args) {

		int[] nums = {2,3,-2,4};
		
		System.out.println("Nums array:" + Arrays.toString(nums));
		
		System.out.println("maxium product of a subarray in the array: " + maxProduct(nums));
		
		
		
		int[] nums2 = {-2,3,-2,4};
		
		System.out.println("Nums2 array:" + Arrays.toString(nums2));
		
		System.out.println("maxium product of a subarray in the array: " + maxProduct(nums2));
		
		
		int[] nums3 = {-2,0,-1};
		
		System.out.println("Nums3 array:" + Arrays.toString(nums3));
		
		System.out.println("maxium product of a subarray in the array: " + maxProduct(nums3));

	}

}
