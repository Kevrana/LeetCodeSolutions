package com.leetcode.easy;

import java.util.HashSet;

// https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate {
	
	public static boolean containsDuplicate(int[] nums) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		// traverse through nums array
		for(int i = 0; i < nums.length; i ++) {
			
			// if item at nums[i] has already been added, 
			// return true as it indicates duplicate value
			if(!hs.add(nums[i]))
				return true;
		}
		// otherwise, after going through entire array without finding a duplicate
		return false;
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		int[] nums = {2,33, 11, 2, 33, 4};
		
		System.out.println("Does nums array contain duplicates: " + containsDuplicate(nums));

	}

}
