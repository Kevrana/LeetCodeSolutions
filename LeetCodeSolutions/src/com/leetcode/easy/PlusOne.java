package com.leetcode.easy;

import java.util.Arrays;

// https://leetcode.com/problems/plus-one/
public class PlusOne {

	public static int[] plusOne(int[] digits) {
		
		// since we are just adding 1, we can start from the last element of digits array
		for(int i = digits.length-1; i>= 0; i--) {
			// checking if the digit is < 9, we just add one and return the array
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			// else if that digit is a 9 we set the digit[i] to 0 because
			// the plus one will make 9 a 10, and that will carry over to the next digit
			// in the if statement above
			else {
				digits[i] = 0;
			}
			
		}
		
		// if the first element/digit is 0 that means we need to add another element to make space for
		// an additional digit, and will set  the 1st number to 1, by default elements of int arrays 
		// are set to 0, then we return the new array
		if(digits[0] == 0) {
			int[] newArr = new int[digits.length+1];
			newArr[0] = 1;
			return newArr;
		}
		
		// otherwise return the digits array as our plus one requirement has been done
		return digits;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int[] nums1 = {1,2,3}; // #123
		
		int[] nums2 = {9,9,9};// #999
		
		System.out.println("Nums 1 array:" + Arrays.toString(nums1));
		System.out.println("Nums 1 array after plus one:" + Arrays.toString(plusOne(nums1)));
		
		System.out.println("Nums 2 array:" + Arrays.toString(nums2));
		System.out.println("Nums 2 array after plus one:" + Arrays.toString(plusOne(nums2)));
		

	}

}
