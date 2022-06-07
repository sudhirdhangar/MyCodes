import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] arr, int n) {
		HashMap<Integer,Integer> map=new HashMap<>();
        int count=(int)Math.floor(n/2);
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
                
            }
            else 
                map.put(arr[i],1);
        }
         for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])>count)
                return arr[i];
        }
        
         return -1;        
	}
}
