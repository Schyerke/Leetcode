package problems;

import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> values = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			values.put(nums[i], i);
		}
		for(int i=0;i<nums.length;i++) {
			int toFind = target-nums[i];
			if(values.containsKey(toFind) && values.get(toFind)!=i) {
				return new int[] {values.get(toFind), i};
			}
		}
		return null;
    }
}

	