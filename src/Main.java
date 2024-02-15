import problems.FindDuplicate;
import problems.FindMedianSortedArrays;
import problems.LargestPerimeter;
import problems.MinOperations;
import problems.PalindromeNumber;
import problems.RearrangeArray;
import problems.TwoSum;

public class Main {

	public static void main(String[] args) {
		
		FindMedianSortedArrays f = new FindMedianSortedArrays();
		double result = f.findMedianSortedArrays(new int[] {1,3}, new int[] {2});
		
		System.out.println(result);
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " " );
		}
	}
	
}