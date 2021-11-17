package com.leetcode.medium;

// https://leetcode.com/problems/string-to-integer-atoi/
public class StringToIntegerATOI {

	public static int myAtoi(String s) {
        
        // 1. ignoring leading whitespace
        int idx = 0;
        while(idx < s.length() && s.charAt(idx) == ' '){
            ++idx;
        }
        
        // 2. if string is empty after ignoring whitespaces, return 0
        if(idx == s.length()){
            return 0;
        }
        

        // 3. check for sign character (+ or -), if sign at index exists, then include it,
        // otherwise, if none given, sign assumed as +
        int sign = 1;
        
        if(s.charAt(idx) == '+' || s.charAt(idx) == '-'){
            sign = (s.charAt(idx) == '-' ? -1 : 1);
            ++idx;
        }
        
        // 4. check if next characters are digits, and continue until non-digit character or end of string 
        // is reached
        
        int result = 0;
        
        while(idx < s.length() && Character.isDigit(s.charAt(idx))){
            
            
            // converts the character into an integer, 
            // i.e. subtracts ASCII of 0 from ASCII of character at idx
            int digit = s.charAt(idx) - '0'; 
            
            
            // to avoid integer overflow - if its above/below the integer max/min clamp return integer
            // to that min/max value
            if( (result > (Integer.MAX_VALUE / 10) ) || ( result == (Integer.MAX_VALUE / 10) && digit > 7) ){
                return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } 
            
            
            // Otherwise, safe to add digit to the result integer
            // add the digit to integer at its respective place-value
            result = (result * 10) + digit;
            ++idx;
        }
        
        return result * sign;
    }
	
	
	
	
	public static void main(String[] args) {
		
		String s1 = "   -42";
		
		System.out.println(s1);
		System.out.println(myAtoi(s1));

		String s2 = "4193 with words";
		
		System.out.println(s2);
		System.out.println(myAtoi(s2));
		
		String s3 = "words and 987";
		
		System.out.println(s3);
		System.out.println(myAtoi(s3));
		
		String s4 = "-91283472332";
		
		System.out.println(s4);
		System.out.println(myAtoi(s4));
	}

}
