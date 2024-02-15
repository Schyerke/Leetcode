package problems;

import java.util.HashSet;

public class IsValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		HashSet<String> seen = new HashSet<>();
		
		for(int i = 0; i < 9; i++) { 
			for(int j = 0; j < 9; j++) {
				if(board[i][j]!='.') {
					if( !seen.add(board[i][j] + "col" + i) ||
							!seen.add(board[i][j] + "row"+j) ||
							!seen.add(board[i][j] +"subbox"+(i/3)+"-"+(j/3))) {
						return false;
					}
				}
			}
		}
		return true;
    }
}
