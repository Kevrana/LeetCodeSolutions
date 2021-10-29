package com.leetcode.medium;

// https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {

	public static int reverse(int x) {
		
		int reverseInt = 0; // int we will return as reversed of x
		
		while(x != 0) {
	
			int pop; // each digit we pop off to add onto reverseInt
			
			pop = x % 10; // pop off the digit
			x /= 10; // make x equal to the number without the popped digit
            
			// for following the leetcode problem's rules:::
            // If reversing x causes the value to 
			// go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
            if (reverseInt > Integer.MAX_VALUE/10 || (reverseInt == Integer.MAX_VALUE / 10 && pop > 7)) 
                return 0;
            if (reverseInt < Integer.MIN_VALUE/10 || (reverseInt == Integer.MIN_VALUE / 10 && pop < -8)) 
                return 0;
			
			reverseInt = (reverseInt *10) + pop; // make space for new digit, and add popped digit
		}
		
		// return the reversedInt of x
		return reverseInt;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int test1 = 123;
		int test2 = -123;
		int test3 = 120;
		int test4 = 0;
	
//		reverse(test1);
		System.out.println("What is reverse of '"+test1+"': " + reverse(test1));
		System.out.println("What is reverse of '"+test2+"': " + reverse(test2));
		System.out.println("What is reverse of '"+test3+"': " + reverse(test3));
		System.out.println("What is reverse of '"+test4+"': " + reverse(test4));
		

	}

}
