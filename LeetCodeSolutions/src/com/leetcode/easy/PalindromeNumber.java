package com.leetcode.easy;

// https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		// base case: if x is 0 then its a palindrome
		if(x == 0) 
			return true;
		
		// base case: if x is negative or it ends in a 0, then not a palindrome
		if (x < 0 || x%10== 0)
			return false;
	
        // This will store the reverse of the number
        int reverse = 0;
        
        // loop half way as a palindrome is the same after half way
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        
        // since the length could be an odd number, we can remove the middle middle with reverse/10 for the comparison.
        // a middle number doesn't matter in a palindrome as it would be the same
        return (x == reverse || x == reverse/10);
		
	}
	
	
	
	
	
	
// One solution:	
//	public static boolean isPalindrome(int x) {
//		
//		String s = String.valueOf(x);
//		
//		int length = s.length();
//		
//		// loop through middle, and compare beginning and end, and work inward each iteration
//		for(int i = 0; i < length/2; i++) {
//			
//			// if the char at the beginning does not equal char at end then not palidrome
//			if(s.charAt(i) != s.charAt(length - 1 - i)) {
//				return false;
//			}
//		}
//		
//		// otherwise, it is a palindrome
//		return true;
//		
//	}
	
	
	
	// test the solution
	public static void main(String[] args) {
		
		// test cases
		int test1 = 121;
		int test2 = -121;
		int test3 = 10;
		int test4 = -101;
		
		System.out.println("Is '"+test1+"' a palindrome???: " + isPalindrome(test1));
		System.out.println("Is '"+test2+"' a palindrome???: " + isPalindrome(test2));
		System.out.println("Is '"+test3+"' a palindrome???: " + isPalindrome(test3));
		System.out.println("Is '"+test4+"' a palindrome???: " + isPalindrome(test4));
		
	}

}
