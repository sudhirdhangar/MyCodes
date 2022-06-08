import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static int uniqueSubstrings(String input) 
    {
        HashSet<Character> set=new HashSet<Character>();
        int left=0,right=0;
        int len=0;
       while(right<input.length())
        {
            
            if(!set.contains(input.charAt(right)))
            {
                set.add(input.charAt(right));
                len=Math.max(len,right-left+1);
                right++;
            }
            else 
            {
                while(left<=right && set.contains(input.charAt(right))){
                 
                    set.remove(input.charAt(left));                    
                   left++;
                }
            len=Math.max(len,right-left+1);
            }
        }
        return len;
    		//write your code here
	}
}
