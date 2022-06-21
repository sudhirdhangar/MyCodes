import java.util.ArrayList;
import java.util.*;
public class Solution 
{
    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int target)
    {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Collections.sort(arr);
        func(0,arr,target,res,new ArrayList<Integer>());
        return res;
        //    Write your code here.
    }
    public static void func(int index,ArrayList<Integer> arr,int target,ArrayList<ArrayList<Integer>> res,ArrayList<Integer> ds)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<arr.size();i++)
        {
            if(i>index && arr.get(i)==arr.get(i-1))
                continue;
            if(arr.get(i)>target)
                break;
            ds.add(arr.get(i));
            func(i+1,arr,target-arr.get(i),res,ds);
            ds.remove(ds.size()-1);
        }
    }
}
