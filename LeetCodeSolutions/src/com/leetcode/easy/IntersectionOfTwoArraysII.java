package com.leetcode.easy;

import java.util.Arrays;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/

public class IntersectionOfTwoArraysII {

	public static int[] intersect(int[] nums1, int[] nums2) {
	        
	    int len1 = nums1.length;
	    int len2 = nums2.length;
	    
	    if(len1 == 0)
	        return nums1;
	    if(len2 == 0)
	        return nums2;
	    
	    
	    int[] intersection = new int[len1 + len2]; // size of both arrays b/c we don't know how many are common.
	    
	    int i=0, j=0, k=0; // pointers for the index of the nums1, nums2, and intersection array respectively.
	    
	    // sort both arrays
	    Arrays.sort(nums1);
	    Arrays.sort(nums2);
	    
	   // while both arrays have elements to traverse
	    while(i < len1 && j < len2){
	       
	        // if nums1 element is < than nums2 element, incrememt nums1 pointer
	        if(nums1[i] < nums2[j]){
	            i++;
	        }
	        // if nums 1 element is > than nums2 element, incrememnt nums2 pointer
	        else if(nums1[i] > nums2[j]){
	            j++; 
	        }
	        // else, nums1[i] == nums2[j],so we add it to interection array, and increment all 3 pointers
	        else{ 
	            intersection[k++] = nums1[i++];
	            j++;
	        }
	    }
	    
	    // return the truncated array of interection from 1st index till k(the number of intersections)
	    return Arrays.copyOfRange(intersection, 0, k);
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		
		System.out.println("nums1 array: " + Arrays.toString(nums1));
		System.out.println("nums2 array: " + Arrays.toString(nums2));
		
		System.out.println("intersection of both arrays: " + Arrays.toString(intersect(nums1,nums2)));
		
		
	}

}
