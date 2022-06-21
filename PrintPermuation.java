import java.util.*;
public class Solution {
    public static List<String> findPermutations(String s) {
        // Write your code here.
        char arr[]=s.toCharArray();
        List<String> res=new ArrayList<String>();
        func(0,arr,res);
        return res;
    }
    public static void func(int index,char arr[],List<String> res)
    {
        if(index==arr.length)
        {
            String ans="";
            for(int i=0;i<arr.length;i++)
                ans+=arr[i];
            res.add(ans);
        }
        for(int i=index;i<arr.length;i++)
        {
            swap(index,i,arr);
            func(index+1,arr,res);
            swap(index,i,arr);
        }
    }
    public static void swap(int i,int j,char arr[])
    {
        char t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
