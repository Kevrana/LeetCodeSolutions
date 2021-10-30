package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/single-number/
public class SingleNumber {
	
// Solution in o(1) space complexity, using bit manipulation	
public static int singleNumber(int[] nums) {
    
	// We will  be applying the xor operation on each item in the entire array
	// and due to the 3 properties of the xor operation, the result will hold
	// the single digit value after traversing  the entire array
	
	// 3 XOR operation properties:
	// 1) its a commutative operation (a ^ b = b ^ a)
	// 2) an item xor itself will result in a 0 ( a ^ a = 0)
	// 3) an item xor with 0 will result in that item (a ^ 0 = a)
	// therefore: a ^ b ^ a => b ^ (a ^ a) => b ^ 0 => b
	// same logic applies to our array, all duplicates will be zeroed out, and only the
	// distinct single digit will be left  in the result at the end
	// this solution only works for when every element appears exactly twice except the one
	// single digit
	
	int result = 0;
	
	for(int num : nums) {
		result ^= num;
	}
    
	return result;
}
	
	
	
	
	
	
// Solution 1: this one takes o(n) space complexity, however, problem wants constant o(1) space.
/*public static int singleNumber(int[] nums) {
        
    HashMap<Integer, Integer> numsFrequency = new HashMap<>();
    
    
    for(int i = 0; i < nums.length; i++){
        
        if(numsFrequency.containsKey(nums[i]))
        {
             numsFrequency.put(nums[i], numsFrequency.get(nums[i]) + 1);
        }else{
            numsFrequency.put(nums[i], 1);
        }
    }
    
    
    for(int i = 0; i < nums.length; i++){
        
        if(numsFrequency.get(nums[i]) == 1)
            return nums[i];
    }
    
    return -1;
}*/
	
	
	

	public static void main(String[] args) {
		
		// test cases
		int[] nums = {2,2,1};
		int[] nums2 = {4,1,2,1,2};
		int[] nums3 = {1};
		
		
		System.out.println("the array nums: " + Arrays.toString(nums));
		System.out.println("The single digit: " + singleNumber(nums));
		
		System.out.println();
		System.out.println("the array nums: " + Arrays.toString(nums2));
		System.out.println("The single digit: " + singleNumber(nums2));
		
		System.out.println();
		System.out.println("the array nums: " + Arrays.toString(nums3));
		System.out.println("The single digit: " + singleNumber(nums3));
		
		
		
	}

}
