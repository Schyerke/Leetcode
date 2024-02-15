package problems;

import java.util.Arrays;

public class LargestPerimeter {
	public long largestPerimeter(int[] nums) {
		Arrays.sort(nums);
		for(int i = nums.length-1; i>=0; i--) {
			long sum = 0;
			for(int j = 0; j < i; j++) {
				sum+=nums[j];
			}
			if(sum>nums[i]) {
				return sum+nums[i];
			}
		}
		return -1;
    }
	
	public long largestPerimeter2(int[] nums) {
		long sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum+=nums[i];
		}
		Arrays.sort(nums);
		
		for(int i = nums.length-1; i>=0; i--) {
			sum-=nums[i];
			if(sum>nums[i]) {
				return sum+nums[i];
			}
		}
		return -1;
	}
}
