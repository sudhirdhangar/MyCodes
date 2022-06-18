class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        int max=-1;
        for(int i=0;i<arr.length;i++)
          max=Math.max(max,arr[i].deadline);
          int nums[]=new int[max+1];
          for(int i=1;i<nums.length;i++)
          {
              nums[i]=-1;
          }
          int jobsCount=0,profit=0;
          for(int i=0;i<arr.length;i++)
          {
              for(int j=arr[i].deadline;j>0;j--)
              {
                  if(nums[j]==-1)
                  {
                      nums[j]=i;
                      jobsCount++;
                      profit+=arr[i].profit;
                      break;
                  }
              }
          }
          int res[]=new int[2];
          res[0]=jobsCount;
          res[1]=profit;
return res;
        // Your code here
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/
