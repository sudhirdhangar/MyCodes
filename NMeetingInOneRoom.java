class Meeting{
    int start;
    int end;
    int pos;
    Meeting(int start, int end, int pos)
    {
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
}

class MyComparator implements Comparator<Meeting>{
    @Override
    public int compare(Meeting o1,Meeting o2)
    {
        if(o1.end<o2.end)
         return -1;
        else if(o1.end>o2.end)
            return 1;
        else if(o1.pos<o2.pos)
        {
            return -1;            
        }
        return 1;
    }
    
}
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        ArrayList<Meeting> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            res.add(new Meeting(start[i],end[i],i+1));
        }
        
        Collections.sort(res,new MyComparator());
        int limit=res.get(0).end;
        ArrayList<Integer> indexes=new ArrayList<>();
        indexes.add(res.get(0).pos);
       
        for(int i=1;i<res.size();i++)
        {
            if(res.get(i).start>limit)
            {
                indexes.add(res.get(i).pos);
                limit=res.get(i).end;
                
            }
        }
        return indexes.size();
    }
}
