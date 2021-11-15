package com.leetcode.medium;

// https://leetcode.com/problems/rotate-image/
public class RotateMedium {

	public void rotate(int[][] matrix) {
	        
	    int N = matrix.length;
	        
	    // if matrix given is empty/null just return
	    if(N == 0 || matrix == null)
	        return;
	    
	    // (transpose) - swap on main diagonal 
	    for(int i = 0; i < N; i++){
	        for(int j = i ; j < N; j++){
	            
	            int temp = matrix[i][j];
	            matrix[i][j] = matrix[j][i];
	            matrix[j][i] = temp;
	        }
	    }
	    
	    // flip horizontally(reflect) - from left to right
	    for(int i = 0; i < N; i++){
	        for(int j = 0 ; j < N/2; j++){
	            
	            int temp = matrix[i][j];
	            matrix[i][j] = matrix[i][N-1-j];
	            matrix[i][N-1-j] = temp;
	        }
	    }
	}
	
	
	public static void main(String[] args) {
		
		// execution should be done using testcases on leetcode ide

	}

}
