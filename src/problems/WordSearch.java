package problems;

public class WordSearch {
	public boolean exist(char[][] board, String word) {
		int index=0;
		char[] words = word.toCharArray();
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				if(board[i][j]==words[index]) {
					index++;
					
				}
			}
		}
    }
}
