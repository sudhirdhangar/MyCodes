import java.util.* ;
import java.io.*; 
public class Solution {
    public static long getTrappedWater(long[] height, int n) {
        // Write your code here.
        long rightMax=0,leftMax=0;
        int left=0,right=height.length-1;
        long res=0;
        while(left<right)
        {
            if(height[left]<height[right])
            {
                if(height[left]>=leftMax)
                    leftMax=height[left];
                else 
                    res=res+leftMax-height[left];
                left++;
            }
            else {
                if(height[right]>=rightMax)
                    rightMax=height[right];
                else 
                    res=res+rightMax-height[right];
                right--;
            }
        }
        return res;
    }
}
