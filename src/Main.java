import org.w3c.dom.views.AbstractView;

import problems.FindDuplicate;
import problems.MinOperations;
import problems.RearrangeArray;
import problems.TwoSum;

public class Main {

	public static void main(String[] args) {
		TwoSum sum = new TwoSum();
		int[] result = sum.twoSum(new int[] {3,2,4}, 6);
		printArray(result);
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " " );
		}
	}
	
}