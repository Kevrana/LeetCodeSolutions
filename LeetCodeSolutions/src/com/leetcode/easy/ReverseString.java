package com.leetcode.easy;

// https://leetcode.com/problems/reverse-string/
public class ReverseString {
	public static void reverseString(char[] s) {
		
		// Solution #1: traverse the array and swap half way
        for(int i = 0; i < s.length/2; i++) {
			char temp = s[i];
			s[i] = s[s.length-1-i];
			s[s.length-1-i] = temp;
		}
		
		
		// solution #2: two pointer approach
//		int start = 0;
//		int end = s.length-1;
//		
//		while(start<end) {
//			char temp = s[start];
//			s[start] = s[end];
//			s[end] = temp;
//			start++;
//			end--;
//		}
		
		
    }

	public static void main(String[] args) {
		
		char[] s = {'h','e','l','l','o'};
		
		System.out.println(s);
		
		reverseString(s);
		System.out.println(s);

	}

}
