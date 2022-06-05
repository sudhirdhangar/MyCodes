import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
       int mini=Integer.MAX_VALUE;
       int profit=0;
        for(int i=0;i<prices.size();i++)
        {
            mini=Math.min(mini,prices.get(i));
            profit=Math.max(profit,prices.get(i)-mini);
        }
        return profit;
    }
}
