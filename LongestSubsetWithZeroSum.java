import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        int sum=0,max=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.size();i++)
        {
            sum=sum+arr.get(i);
            if(sum==0)
                max=Math.max(i+1,max);
            if(map.containsKey(sum))
            {
                max=Math.max(max,i-map.get(sum));
            }
            else 
                map.put(sum,i);
        }
        return max;
		// Write your code here.
	}
}
