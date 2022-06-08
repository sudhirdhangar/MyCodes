class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1)
            return s.length();
        String sort="";
        int max=1;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            count=1;
          for(int j=i+1;j<s.length();j++)    
          {
              if(!s.substring(i,j).contains(s.charAt(j)+""))
                  count++;
              else 
                  break;
          }
            max=Math.max(max,count);
        }
        return max;
    }
}
