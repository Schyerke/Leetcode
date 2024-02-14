package problems;

public class RearrangeArray {

	public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        boolean[] taken = new boolean[nums.length];
        
        int negativeOffset = 0;
        int positiveOffset = 0;
        
        for(int i = 0; i < nums.length; ) {
        	int positive = -1;
        	int negative = 1;
        	
        	for(int j = negativeOffset; j < nums.length; j++) {
        		if(nums[j] < 0 && !taken[j] ) {
        			negative = nums[j];
        			taken[j]= true;
        			negativeOffset = j;
        			break;
        		}
        	}
        	for(int j = positiveOffset; j < nums.length; j++) {
        		if(nums[j]>0 && !taken[j]) {
        			positive = nums[j];
            		taken[j]=true;
            		positiveOffset = j;
            		break;
        		}
        	}
        	
        	
        	result[i++] = positive;
        	result[i++] = negative;
        }
        
        return result;
    }
	
	public int[] rearrangeArray2(int[] nums) {
		int n = nums.length;
		int[] ans = new int[n];
		int neg = 1;
		int pos = 0;
		for(int i = 0; i < n; i++ ) {
			if(nums[i]>0) {
				ans[pos]=nums[i];
				pos+=2;
			}else {
				ans[neg]=nums[i];
				neg+=2;
			}
		}
		return ans;
	}
}
