class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> s=new HashSet<>();
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(!s.contains(nums[i]-1))
            {
                int count=1;
                int currNum=nums[i]+1;
                while(s.contains(currNum))
                {
                    count++;
                    currNum++;
                }
                max=Math.max(count,max);
            }
        }
        return max;
    }
}
