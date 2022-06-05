import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long sum=0,best=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
            best=Math.max(sum,best);
            if(sum<0)
                sum=0;
        }
        return best;
	}

}
