import org.w3c.dom.views.AbstractView;

import problems.FindDuplicate;
import problems.MinOperations;
import problems.RearrangeArray;

public class Main {

	public static void main(String[] args) {
		MinOperations m = new MinOperations();
		int result = m.minOperations(new int[] {3,2,20,1,1,3}, 10);
		
		System.out.println(result);
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " " );
		}
	}
	
}