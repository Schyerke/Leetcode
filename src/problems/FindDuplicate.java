package problems;

public class FindDuplicate {
	public int findDuplicate(int[] nums) {
		int n = nums.length;
		boolean[] numbers = new boolean[n];
		for(int i=0;i<n;i++) {
			if(numbers[nums[i]]) {
				return nums[i];
			}
			else {
				numbers[nums[i]]=true;
			}
		}
		return 0;
    }
}
