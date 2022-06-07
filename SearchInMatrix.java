import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		int low=0;
        int high=m*n-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int temp=mat.get(mid/n).get(mid%n);
            
            if(temp==target)
                return true;
            else if(temp>target)
            {
                high=mid-1;
            }
            else 
                low=mid+1;
        }
        return false;
	}
}
