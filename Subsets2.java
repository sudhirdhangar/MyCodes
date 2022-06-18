import java.util.*;
public class Solution {
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
         Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res=new ArrayList();
       subset(0,arr,new ArrayList<Integer>(),res);
        return res;
    }
   
       
    public static void subset(int index, int nums[], ArrayList<Integer> ds,ArrayList<ArrayList<Integer>> res)
    {
        res.add(new ArrayList<>(ds));
        for(int i=index;i<nums.length;i++)
        {
            if(i!=index && (nums[i]==nums[i-1]))
                continue;
            ds.add(nums[i]);
            subset(i+1,nums,ds,res);  
            ds.remove(ds.size()-1);
            
        }
        
    }

}
