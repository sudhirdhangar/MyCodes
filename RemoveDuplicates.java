import java.util.*;
public class Solution {
	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		int i=0,j=1,count=1;
        while(j<n)
        {
            if(arr.get(i)!=arr.get(j))
            {    i=j;
             count++;
            }
            j++;
        }
        return count;
	}
}
