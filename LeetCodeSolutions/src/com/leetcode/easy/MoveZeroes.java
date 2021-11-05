package com.leetcode.easy;

import java.util.Arrays;

// https://leetcode.com/problems/move-zeroes/
public class MoveZeroes {

	public static void moveZeroes(int[] nums) {
        if(nums.length == 0 || nums == null)
            return;
        
        // keeps track of where the non-zero elements are moved to in-place
        int nonZeroIndex = 0;
        
        // loop through entire array
        // if the current element is non-zero
        // then place that element in the array at the nonZeroIndex 
        // and increment the non-zero index
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0)
                nums[nonZeroIndex++] = nums[i];
        }
        
        // loop rest of the array and place 0s in the elements
        for(int i = nonZeroIndex; i < nums.length; i++)
            nums[i] = 0;
    }
	
	public static void main(String[] args) {
		
		int[] nums = {0,1,0,3,12};
		int[] nums2 = {0};
		
		System.out.println("nums array before zeros moved to end:" + Arrays.toString(nums));
		moveZeroes(nums);
		System.out.println("nums array after zeros moved to end:" + Arrays.toString(nums));
		
		System.out.println();
		
		System.out.println("nums array before zeros moved to end:" + Arrays.toString(nums2));
		moveZeroes(nums2);
		System.out.println("nums array after zeros moved to end:" + Arrays.toString(nums2));
		
	}

}
