package com.leetcode.medium;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArrayExceptSelf {
	
	private static int[] productExceptSelf(int[] nums) {
		
		int[] output = new int[nums.length];
		
		// nothing to left of 1st element so its is left product is 1
		output[0] = 1;
		
		// loop through nums arr going forward getting the product of all elements to left of i
		// output[i-1] represents the total product of all of the left elements not including current-1
		// nums[i-1] represents the current-1's value which multiples to the output[i-1] 
		// and stores in output[i] and keeps doing so till we go through all elements of nums
		for(int i = 1; i < nums.length; i++) {
			output[i] = output[i-1] * nums[i-1];
		}
		
		// the temp variable which will hold the right product
		int rightProduct = 1;
		
		// will loop starting in reverse, starting from last element
		// each element in output[i] will multiple the all of rightproduct * the left products 
		// currently in output[i]. rightProduct will then multiple with all of the elements of 
		// nums and store into itself for the next iteration
		for(int i = nums.length -1; i >= 0; i--) {
			output[i] *= rightProduct;
			rightProduct *= nums[i];
		}

		return output;
	}

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		
		System.out.println("The original array: " + Arrays.toString(nums));
		System.out.println("The answer array: " + Arrays.toString(productExceptSelf(nums)));

	}

	

}
