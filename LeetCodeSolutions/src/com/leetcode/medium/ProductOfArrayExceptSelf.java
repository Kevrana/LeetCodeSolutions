package com.leetcode.medium;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/
public class ProductOfArrayExceptSelf {
	
	private static int[] productExceptSelf(int[] nums) {
		
		// the answer array that we will return with the result
		int[] output = new int[nums.length];
		
		/* output[] will hold left products for now
		 * since nothing to left of 1st element so its is left product is initially 1
		 */
		output[0] = 1;
		
		/* the temp variable which will hold the right product 
		 * (nothing to right of last element so right product initially is 1)
		 */
		int rightProduct = 1;
		
		/* Calculate left product:
		 * - b/c the first index's left product is already 1, we start traversing at the 2nd index of the array in ascending order 
		 * - to calculate that index's left product: its the previous index's leftProduct * the previous nums element
		 */
		for(int i = 1; i < nums.length; i++) {
			output[i] = output[i-1] * nums[i-1];
		}
		
		
		/* Calculate final product of given element:
		 * - calculate product of that element by multiplying its leftProduct * rightProduct
		 * - calculate the next element's rightProduct
		*/
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
