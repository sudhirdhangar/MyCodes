import java.util.ArrayList;
import java.util.*;
public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        HashSet<Integer> set=new HashSet<Integer>();
        int repeat=-1,miss=-1;
        for(int i=0;i<arr.size();i++)
        {
            if(set.contains(arr.get(i)))
            {
                repeat=arr.get(i);
                break;
            }
            else 
                set.add(arr.get(i));
        }
        int s=0;
        for(int i=0;i<arr.size();i++)
            s=s+arr.get(i);
        s=s-repeat;
        int p=arr.size();
        int sum=p*(p+1)/2;
         miss=sum-s;
        return new int[]{miss,repeat};
        // Write your code here
    }
}
