import java.util.*;
public class Solution {
    public static ArrayList<Integer> subsetSum(int num[]) {
        // Write your code here..
        ArrayList<Integer> res=new ArrayList<Integer>();
        
        func(0,0,num,res);
        Collections.sort(res);
        return res;
    }
    public static void func(int index,int sum,int num[],ArrayList<Integer> res)
    {
        if(index==num.length)
        {
            res.add(sum);
            return;
        }
        func(index+1,sum+num[index],num,res);
        func(index+1,sum,num,res);
    }
}
