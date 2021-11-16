package com.leetcode.easy;

import java.util.HashMap;

// https://leetcode.com/problems/first-unique-character-in-a-string/
public class FirstUniqueCharacterInAString {

	 public int firstUniqChar(String s) {
	        
        //edge cases
        if(s == null || s.length() == 0){
            return -1;
        }
        
        // single letter - first and only unique character, return index 0
        if(s.length() == 1){
            return 0;
        }
        
        
        // store in hashmap b/c we want to keep track of what character we have seen
        // and if we have seen more than once
        // key - current character at  that index
        // value - the index, else if we see it again down the line, -1
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
           char curr = s.charAt(i);
            
            if(!hm.containsKey(curr)){
                hm.put(curr,i);
            }
            else{
                hm.put(curr, -1);
            }
        }
        
        
        // since we want to get the first unique index
        // we start with max and perform a mincheck which at the end of 
        // the for loop will give the first unique index
        int minIndex = Integer.MAX_VALUE;
        
        // loop through the hashmap and do min check if 
        // each character's value is > -1 and < minIndex
        // make that index the new minIndex
        for(char ch : hm.keySet()){
            if(hm.get(ch) < minIndex && hm.get(ch) > -1){
                minIndex = hm.get(ch);
            }
        }
         
        
        // if minIndex doesn't update, then return -1 for no unique characters in this string
        // else return the current minIndex
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }
	
	
	public static void main(String[] args) {
		
		

	}

}
