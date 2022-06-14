import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the LinkedListNode class structure

    class LinkedListNode<T> {
	    T data;
	    LinkedListNode<T> next;
	    LinkedListNode<T> random;

	    public LinkedListNode(T data) {
		    this.data = data;
	    }
    }

*************************************************************/

public class Solution {
	public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
        if(head==null)
            return head;
        LinkedListNode itr=head;
        LinkedListNode front=head;
        while(itr!=null)
        {
            front=itr.next;
            LinkedListNode temp=new LinkedListNode(itr.data);
            itr.next=temp;
            temp.next=front;
            itr=front;
                    }
        itr=head;
        while(itr!=null)
        {
            if(itr.random!=null)
            itr.next.random=itr.random.next;
            itr=itr.next.next;
        }
        LinkedListNode dummy=new LinkedListNode(0);
        
        LinkedListNode copy=dummy;
        itr=head;
        
        while(itr!=null)
        {
            front=itr.next.next;
            copy.next=itr.next;
            copy=copy.next;
            itr.next=front;
            itr=front;
            
        }
        return dummy.next;
		// Write your code here.
	}
}
