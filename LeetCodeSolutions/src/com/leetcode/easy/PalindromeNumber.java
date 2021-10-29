package com.leetcode.easy;

// https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		// if x is 0 then its a palindrome
		if(x == 0) {
			return true;
		}
		
		// if x is negative or it ends in a 0, then not a palindrome
		if (x < 0 || x%10== 0)
			return false;
		
		// integer to hold our reversed x;
		int rev = 0;
		
		// until we get half way through x, as this is quicker vs waiting till we reverse entire x
		while(x > rev) {
			int pop = x % 10;
			x /= 10;
			
			rev = rev * 10 + pop;
		}
		
		// if x is even number of digits it will use x == rev after loop ends
		// i.e. x = 234 and rev = 234
		
		// if x is odd number of digits it will use x == rev/10 after loop ends
		// i.e. x = 23 and rev = 234, it will truncate rev
		return (x == rev || x == rev/10);
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
