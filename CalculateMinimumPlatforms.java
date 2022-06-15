import java.util.*;
public class Solution {
    public static int calculateMinPatforms(int arr[], int dep[], int n) {
        // Write your code here.
         Arrays.sort(arr);
        Arrays.sort(dep);
        int count=1,max=1;
        for(int i=1,j=0;i<n&&j<n;)
        {
            if(arr[i]>dep[j])
            {
                count--;
                j++;
            }
            else if(arr[i]<=dep[j])
            {
            count++;
            i++;
                
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
