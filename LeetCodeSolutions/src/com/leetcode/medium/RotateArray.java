package com.leetcode.medium;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-array/
public class RotateArray {

	public static void rotate(int[] nums, int k) {
		
		// if shifting k goes out of bounds on the array, it will start again from the beginning
		k %= nums.length; 
		
		// 1. reverse whole array, from index 0 to last element
		reverse(nums, 0, nums.length-1);
		
		// 2. reverse array up to k # of elements, so from 0 index to k-1(for the index)
		reverse(nums, 0, k-1);
		
		// 3. reverse array from  index k till last element of array
		reverse(nums, k, nums.length-1);
		
	}
	
	// our reverse tool method that swaps from start and end of array
	public static void reverse(int[] nums, int start, int end) {
		
		while(start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			
			start++;
			end--;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		// test cases
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		
		System.out.println("Array before rotating by 3: " + Arrays.toString(nums) );
		
		rotate(nums, k);
		
		System.out.println("Array after rotating by 3: " + Arrays.toString(nums) );
		
		
	}

}
