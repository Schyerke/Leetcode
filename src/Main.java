import problems.FindDuplicate;
import problems.FindMedianSortedArrays;
import problems.IsValidSudoku;
import problems.LargestPerimeter;
import problems.MinOperations;
import problems.PalindromeNumber;
import problems.RearrangeArray;
import problems.TwoSum;

public class Main {

	public static void main(String[] args) {
		
		char[][] matrix = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
		
		IsValidSudoku s = new IsValidSudoku();
		boolean result = s.isValidSudoku(matrix);
		
		System.out.println(result);
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " " );
		}
	}
	
}