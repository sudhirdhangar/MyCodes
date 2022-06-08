import java.util.* ;
import java.io.*; 
/****************************************************************
	
	Following is the structure of the Singly Linked List.
	
	class LinkedListNode<T> {
    	T data;
    	LinkedListNode<T> next;

    	public LinkedListNode(T data) {
        	this.data = data;
    	}
	}

****************************************************************/

public class Solution {
	public static LinkedListNode<Integer> removeKthNode(LinkedListNode<Integer> head, int K) {
        LinkedListNode start=new LinkedListNode(0);
        
        start.next=head;
        LinkedListNode fast=start,slow=start;
        for(int i=1;i<=K;i++)
            fast=fast.next;
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        if(slow.next!=null)
        slow.next=slow.next.next;
        return start.next;
		// Write your code here.
	}
}
