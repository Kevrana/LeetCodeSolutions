package com.leetcode.easy;

import java.util.Arrays;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {

	public static int removeDuplicates(int[] nums) {
        
		// index counter for unique elements being put at begining of nums array
		// because solution requires in place
		// starting at 1 because the 1st index at nums[0] is already unique
        int k = 1;
        
        // traverse through nums array, and compare if current element is different than
        // the previous element, if so add current element
        // to nums with the k index count and increment k.
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1])
                nums[k++] = nums[i];
        }
        
        // return k at the end
        return k;
    }
	
	
	
	
	public static void main(String[] args) {
		
		int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
		

		int k = removeDuplicates(nums); // Calls your implementation

		System.out.println("nums array:" + Arrays.toString(nums));
		
		System.out.println("Nums array without duplicates:");
		for (int i = 0; i < k; i++) {
		   System.out.print(nums[i] + ", ");
		}

	}

}
