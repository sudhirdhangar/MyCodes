import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {  
        int left=0;
        int right=arr.length-1;
        int mid=0;
        while(mid<=right)
        {
            if(arr[mid]==0)
            {
                int temp=arr[left];
                arr[left]=arr[mid];
                arr[mid]=temp;
                left++;
                mid++;
            }
            else if(arr[mid]==2)
            {
                int temp=arr[mid];
                arr[mid]=arr[right];
                arr[right]=temp;
                right--;
            }
            else 
                mid++;
        }
    }
}
