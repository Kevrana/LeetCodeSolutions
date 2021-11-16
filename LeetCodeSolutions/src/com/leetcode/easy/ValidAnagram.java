package com.leetcode.easy;

import java.util.Arrays;

// https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {

	private static boolean isAnagram(String s, String t) {
		
		int len1 = s.length();
		int len2 = t.length();
		
		// if the string sizes are different, can't be anagrams
		if(len1 != len2)
			return false;
		
		char[] sCharArr = s.toCharArray();
		char[] tCharArr = t.toCharArray();
		
		Arrays.sort(sCharArr);
		Arrays.sort(tCharArr);
		
		for(int i = 0; i < len1; i++) {
			if(sCharArr[i] != tCharArr[i])
				return false;
		}
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		
		String s = "dog";
		String t = "god";
		System.out.println("string s: " + s);
		System.out.println("string t: " + t);
		System.out.println("Are the strings anagrams? " + isAnagram(s,t));

	}

}
