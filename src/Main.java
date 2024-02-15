import org.w3c.dom.views.AbstractView;

import problems.FindDuplicate;
import problems.LargestPerimeter;
import problems.MinOperations;
import problems.PalindromeNumber;
import problems.RearrangeArray;
import problems.TwoSum;

public class Main {

	public static void main(String[] args) {
		
		LargestPerimeter p = new LargestPerimeter();
		
		long result = p.largestPerimeter2(new int[] {1,12,1,2,5,50,3});
		
		System.out.println(result);
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " " );
		}
	}
	
}