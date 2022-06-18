public class Solution
{
public static int findMinimumCoins(int amount)
    {
        int count=0;
        int arr[]={1,2,5,10,20,50,100,500,1000};
        for(int i=arr.length-1;i>=0;i--)
        {
            while(amount!=0 && arr[i]<=amount)
            {
                amount=amount-arr[i];
                count++;
            }
        }
    return count;
    
        // Write your code here.
    }
}
