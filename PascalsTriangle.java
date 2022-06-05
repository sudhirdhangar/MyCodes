import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
          ArrayList<ArrayList<Long>> list=new ArrayList<>();
        ArrayList<Long> l=new ArrayList<>(); 
        l.add(new Long(1));
        list.add(l);
            for(int i=1;i<n;i++)
            {
                ArrayList<Long> temp=new ArrayList<>();
                temp.add(new Long(1));
                for(int j=0;j<list.get(i-1).size()-1;j++)
                {
                    temp.add(new Long(list.get(i-1).get(j)+list.get(i-1).get(j+1)));
                }
                temp.add(new Long(1));
                list.add(temp);
            }
        ArrayList<ArrayList<Long>> res=new ArrayList<>(list);
        return res;
	}
}
