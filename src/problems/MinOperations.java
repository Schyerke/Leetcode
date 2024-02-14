package problems;

import java.util.Arrays;

public class MinOperations {

	public int minOperations(int[] nums, int x) {
		int totalSum = Arrays.stream(nums).sum();
		int internalSum = totalSum-x;
		
		if(internalSum == 0) {
			return nums.length;
		}
		if(internalSum < 0) {
			return -1;
		}
		
		int left=0;
		int right=0;
		int min = Integer.MAX_VALUE;
		int n = nums.length;
		int sum = 0;
		
		while(right < n) {
			sum+=nums[right++];
			
			while(left<n && sum > internalSum) {
				sum-=nums[left++];
			}
			if(sum==internalSum) {
				min = Math.min(min, n - (right-left));
			}
		}
		return min == Integer.MAX_VALUE ? -1 : min;
		
    }
}
