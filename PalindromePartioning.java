import java.util.*;
public class Solution {
    public static List<List<String>> partition(String s) {
        // Write your code here.
        List<List<String>> res=new ArrayList<>();
        func(0,s,res,new ArrayList<String>());
        return res;
    }
    public static boolean isPalindrome(String s,int start,int end)
    {
        while(start<=end)
        {
            if(s.charAt(start++)!=s.charAt(end--))
                return false;
        }
        return true;
    }
    public static void func(int index,String s,List<List<String>> res,List<String> curr)
    {
        if(index==s.length())
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<s.length();i++)
        {
            if(isPalindrome(s,index,i))
            {
                curr.add(s.substring(index,i+1));
                func(i+1,s,res,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}
