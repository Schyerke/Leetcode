package problems;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {
		long y = 0;
		int copyX = x;
		int digits = 0;
		
		while(x>0) {
			x/=10;
			digits++;
		}
		--digits;
		
		x=copyX;
		while(x>0) {
			int digit = x % 10;
			x/=10;
			y+=digit * Math.pow(10, digits);
			--digits;
		}
		return copyX==y;
    }
}
