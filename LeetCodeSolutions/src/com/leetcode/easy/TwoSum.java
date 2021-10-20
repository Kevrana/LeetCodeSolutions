package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/two-sum/
public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
		
		// the hashmap will store the nums[i] as key as each input will have exactly one solution,
		//so key needs to be unique, and the index as its value
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		// traverse through given array
		for(int i = 0; i < nums.length; i++) {
			// temp + nums[i] = target, so finding temp is target - nums[i] 
			int temp = target - nums[i];
			
			// checks to see if the hm contains temp's value, if it does, it will return the 2 indices
			if(hm.keySet().contains(temp)) {
				return new int[] {hm.get(temp), i};
			}
			
			// otherwise, add the current elment with its index.
			hm.put(nums[i],i);
			
		}
		
		// if no 2 indices add to target, return an empty int array
		return new int[0];
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[] nums = {2, 7, 11, 15};
		
		int target = 9;
		
		System.out.println("nums array: " + Arrays.toString(nums));
		System.out.println("Target: " + target );
		System.out.println("The indices of nums array that add up to target: "+ Arrays.toString(twoSum(nums, target)));
		

	}

}
