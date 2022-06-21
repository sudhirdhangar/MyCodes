import java.util.ArrayList;
import java.util.*;
public class Solution {
    public static String kthPermutation(int n, int k) {
       List<Integer> list=new ArrayList<Integer>();
        int fact=1;
        for(int i=1;i<n;i++)
        {
            fact=fact*i;
            list.add(i);
        }
        list.add(n);
        String res="";
        k=k-1;
        while(true)
        {
            res=res+list.get(k/fact);
            list.remove(k/fact);
            if(list.size()==0)
                break;
            k=k%fact;
            fact=fact/list.size();
        }
        return res;
    }
}
