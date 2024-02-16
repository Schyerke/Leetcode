package problems;

import java.util.HashMap;

public class FindLeastNumOfUniqueInts {
	public int findLeastNumOfUniqueInts(int[] arr, int k) {
		HashMap<Integer, Integer> freq = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			freq.put(arr[i], 1+freq.getOrDefault(arr[i], 0));
		}
		
		
		
		return freq.size();
    }
}
