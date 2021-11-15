package com.leetcode.medium;

import java.util.HashSet;

// https://leetcode.com/problems/valid-sudoku/

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
	        
	        if(board.length == 0 || board == null)
	            return false;
	        
	        HashSet<String> seen = new HashSet<>();
	        
	        for(int i = 0; i < 9; i++){
	            
	            for(int j = 0; j < 9; j++){
	                
	                char number = board[i][j];
	                
	                if(number != '.'){
	                if(!seen.add(number + "found in row " + i) ||
	                  !seen.add(number + "found in column " + j) ||
	                  !seen.add(number + "found in sub-box " + i/3 + "-" + j/3)){
	                    return false;
	                }
	            }
	        }
	    }
	   
	    return true;
	}

	public static void main(String[] args) {
		
		// need to verify using leetcode ide for testing 
		
		

	}

}
