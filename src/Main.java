import org.w3c.dom.views.AbstractView;

import problems.FindDuplicate;
import problems.MinOperations;
import problems.PalindromeNumber;
import problems.RearrangeArray;
import problems.TwoSum;

public class Main {

	public static void main(String[] args) {
		
		PalindromeNumber n = new PalindromeNumber();
		boolean result = n.isPalindrome(2147483647);
		
		System.out.println(result);
		
		
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " " );
		}
	}
	
}