package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/two-sum/
public class TwoSum {

	// Solution1: hashmap + forloop traversal approach
	public static int[] twoSum(int[] nums, int target) {

		// key: array element, value: that element's index
		HashMap<Integer, Integer> hm = new HashMap<>();

		/* traverse array, check if map contains diff of target - current element 
		 * - if it does, return their indices in a new int[] 
		 * - if not, put that element,index pair into map 
		 * - Otherwise, after traversal ends, and no pairs found, return an empty int[0]
		 */
		for (int i = 0; i < nums.length; i++) {

			int diff = target - nums[i];

			if (hm.containsKey(diff))
				return new int[] { hm.get(diff), i };

			hm.put(nums[i], i);

		}
		return new int[0];
	}

	public static void main(String[] args) {

		int[] nums = { 2, 7, 11, 15 };

		int target = 9;

		System.out.println("nums array: " + Arrays.toString(nums));
		System.out.println("Target: " + target);
		System.out.println("The indices of nums array that add up to target: " + Arrays.toString(twoSum(nums, target)));

	}

}
