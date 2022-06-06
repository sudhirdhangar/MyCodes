import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;
class MyComparator implements Comparator<Interval>{
    public int compare(Interval i1,Interval i2)
    {
        if(i1.start<i2.start)
            return -1;
        else if(i1.start>i2.start)
            return 1;
        
            return 1;
    }
}
public class Solution {
    public static List<Interval> mergeIntervals(Interval[] intervals) {
        List<Interval> res=new ArrayList<>();
        MyComparator m=new MyComparator();
        Arrays.sort(intervals,m);
        int end=intervals[0].finish;
        int start=intervals[0].start;
       for(int i=1;i<intervals.length;i++)
       {
           if(intervals[i].start<=end)
           {
               end=Math.max(intervals[i].finish,end);
           }
           else
           {
               res.add(new Interval(start,end));
               start=intervals[i].start;
               end=intervals[i].finish;
           }
       }
        res.add(new Interval(start,end));
        return res;
        // write your code here.
    }
}
