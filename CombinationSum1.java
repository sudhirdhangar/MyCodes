class Solution {
    public static void findCombinations(int i,int arr[], int target,List<List<Integer>> res,List<Integer> ds)
    {
        if(i==arr.length)
        {
            if(target==0)
                res.add(new ArrayList(ds));
            return;
        }
        if(arr[i]<=target)
        {
            ds.add(arr[i]);
            findCombinations(i,arr,target-arr[i],res,ds);
            ds.remove(ds.size()-1);
        }
        findCombinations(i+1,arr,target,res,ds);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList();
        findCombinations(0,candidates,target,list,new ArrayList());
        return list;
        
    }
}
