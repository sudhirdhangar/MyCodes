import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int i=0;
        for(i=0;i<m;)
        {
            if(arr1[i]>arr2[0])
            {
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;
                int ele=arr2[0];
                int j=0;
                for(j=0;j<n-1 &&ele>arr2[j+1] ;j++)
                {
                    arr2[j]=arr2[j+1];
                }
                arr2[j]=ele;
                
            }           
            else 
                i++;
        }
        for(int k=i;k<m+n;k++)
            arr1[k]=arr2[k-i];
        return arr1;
    }
}
