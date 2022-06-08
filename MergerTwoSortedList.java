import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the linked list node structure:
    
    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

************************************************************/

public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        LinkedListNode<Integer> list=null,temp=null;
        if(first==null)
            return second;
        else if(second==null)
            return first;
        if(first.data<second.data)
        {
            list=new LinkedListNode(first.data);
            first=first.next;
        }
        else 
        {
            list=new LinkedListNode(second.data);
            second=second.next;
        }
        temp=list;
        
        while(first!=null && second!=null)
        {
            if(first.data<second.data)
            {
                temp.next=new LinkedListNode(first.data);
                first=first.next;
            }
            else {
                temp.next=new LinkedListNode(second.data);
                second=second.next;
            }
            temp=temp.next;
        }
        while(first!=null)
        {
            temp.next=new LinkedListNode(first.data);
            first=first.next;
            temp=temp.next;
        }
        while(second!=null)
        {
            temp.next=new LinkedListNode(second.data);
            second=second.next;
            temp=temp.next;
        }
        return list;        
		// Write your code here.
	}
}
