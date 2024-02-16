import problems.FindDuplicate;
import problems.FindLeastNumOfUniqueInts;
import problems.FindMedianSortedArrays;
import problems.IsValidSudoku;
import problems.LargestPerimeter;
import problems.MinOperations;
import problems.PalindromeNumber;
import problems.RearrangeArray;
import problems.TwoSum;

public class Main {

	public static void main(String[] args) {
		
		FindLeastNumOfUniqueInts f = new FindLeastNumOfUniqueInts();
		int result = f.findLeastNumOfUniqueInts(new int[] {2,1,1,3,3,3}, 3);
		
		System.out.println(result);
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " " );
		}
	}
	
}