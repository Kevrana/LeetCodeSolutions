package com.leetcode.easy;

// https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
	

	public static boolean isPalindrome(String s) {
        
        // Edge case - empty string is a palindrome
        if(s.trim().isEmpty())
            return true;
        
        
        // Two Pointer approach
        int left = 0;
        int right = s.length()-1;
        
        
        while(left < right){
            
            //increment left until its pointing to a valid alphanumeric chracter
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            
            //decrement right until its pointing to a valid alphanumeric chracter
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            
            // do character matching check after lowercasing both left and right characters
            // if the letters don't matchup, then not a palindrome so return false
            if(left < right && Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;  
        }
        
        
        // Otherwise, if all alpha numeric characters are valid, its a palindrome phrase
        return true;
    }
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		System.out.println(s);
		System.out.println(isPalindrome(s));
		

	}

}
