package com.leetcode.easy;

// https://leetcode.com/problems/implement-strstr/
public class ImplementStrStr {

	// solution 1: using nested loop
	public static int strStr(String haystack, String needle) {
        
        int h = haystack.length();
        int n = needle.length();
        
        // if needle is empty -> return 0
        if(n == 0){
            return 0;
        }
        
        // edge case - if haystack length is shorter than needle, then needle can't be in here
        // so, return -1
        if(h < n){
            return -1;
        }
        
        
        
        // Loop the haystack string till length of haystack - length of needle 
        // b/c beyond that, the haystack will not have room for needle
        for(int i = 0; i <= h-n; i++){
            
            // create a pointer for the index of the current character in the needle
            int j; 
            
            // loop the needle string
            for(j = 0; j < n; j++){
                
                // and if the current needle character does not match the current chracter of the haystack 
                // when starting from haystack loop's index + needle's index.
                // then break -> the pointer doesn't exist at this haystack index.
                // it will continue from next haystack index
                if(haystack.charAt(i + j) != needle.charAt(j)){
                    break;
                }
            }
            
            
            // if j equals length of needle, this means that the current haystack index is where 
            // needle occurs completely for the first time, so return haystack loop's index
            if( j == n){
                return i;
            }
        
        }
        
        // otherwise, if we go through entire haystack without finding needle,
        // then needle doesn't exist in haystack
        return -1;

    }
	
	// solution 2: using substring 
	public static int strStr2(String haystack, String needle) {
        
        int h = haystack.length();
        int n = needle.length();
        
        // if needle is empty -> return 0
        if(n == 0){
            return 0;
        }
        
        // edge case - if haystack length is shorter than needle, then needle can't be in here
        // so, return -1
        if(h < n){
            return -1;
        }
        
        
        
        // Loop the haystack string till length of haystack - length of needle 
        // b/c beyond that, the haystack will not have room for needle
        for(int i = 0; i <= h-n; i++){
        	// if the substring from current index till length of needle equals needle string
        	// return index
        	if(haystack.substring(i, i + n).equals(needle))
        		return i;
        }
        
        // otherwise, if we go through entire haystack without finding needle,
        // then needle doesn't exist in haystack
        return -1;


    }
	
	
	
	
	public static void main(String[] args) {
		

	}

}
