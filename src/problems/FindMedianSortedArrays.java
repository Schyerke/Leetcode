package problems;

public class FindMedianSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		int m = nums1.length;
		int n = nums2.length;
		
        int[] nums3 = new int[m+n];
        
        int j1=0;
        int j2=0;
        
        int n1 = 0;
        int n2 = 0;
        
        for(int i = 0; i < m+n; i++) {
        	if(j1>=m) {
        		n1 = Integer.MAX_VALUE;
        	} else {
        		n1 = nums1[j1];
        	}
        	if(j2>=n) {
        		n2 = Integer.MAX_VALUE;
        	} else {
        		n2 = nums2[j2];        		
        	}
        	
        	if(n1 <= n2) {
        		nums3[i]=n1;
        		j1++;
        	}
        	else {
        		nums3[i]=n2;
        		j2++;
        	}
        }
        int middle = (m+n)/2;
        if((m+n)%2==0) {
        	middle--;
        	int m1 = nums3[middle];
        	int m2 = nums3[middle+1];
        	double result = (double) (m1+m2)/2;
        	return result;
        }
        return (double) nums3[middle];
    }
}
